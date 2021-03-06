package com.scf.api.auto.controller;

import java.io.IOException;
import java.io.StringReader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santander.giws.client.MappingDataTypes;
import com.santander.giws.client.ObjectFactory;
import com.scf.api.auto.api.ProposalLoanApplicationApi;
import com.scf.api.auto.model.ProposalResponse;
import com.scf.api.auto.model.SubmitThirdPartiesResponse;
import com.scf.api.auto.model.giws.mappingdatatypes.MappingDataTypesResponse;
import com.scf.api.auto.model.giws.submitthirdparties.Envelope;
import com.scf.api.auto.ws.giws.GiwsClient;

import io.swagger.annotations.ApiParam;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Controller
public class ProposalLoanApplicationApiController implements ProposalLoanApplicationApi {

	private static final Logger log = LoggerFactory.getLogger(ProposalLoanApplicationApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	@Autowired
	GiwsClient giwsClient;

	@org.springframework.beans.factory.annotation.Autowired
	public ProposalLoanApplicationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<ProposalResponse> getProposal(
			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true) @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true) @RequestHeader(value = "Accept", required = true) String accept,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OriginatorId", required = true) String originatorId,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OriginatorProposalReference", required = true) String originatorProposalReference,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OperationType", required = true) String operationType,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OperationData", required = true) String operationData,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			try {
				return new ResponseEntity<ProposalResponse>(
						objectMapper.readValue("{\"empty\": false}", ProposalResponse.class),
						HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProposalResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<ProposalResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<ProposalResponse> getProposalINE(
			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true) @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true) @RequestHeader(value = "Accept", required = true) String accept,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OriginatorId", required = true) String originatorId,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OperationType", required = true) String operationType,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OperationData", required = true) String operationData,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OriginatorProposalReference", required = true) String originatorProposalReference,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			try {
				return new ResponseEntity<ProposalResponse>(
						objectMapper.readValue("{\"empty\": false}", ProposalResponse.class),
						HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProposalResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<ProposalResponse>(HttpStatus.NOT_IMPLEMENTED);
	}



	@Override
	public ResponseEntity<MappingDataTypesResponse> getMappingDataTypes(
			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true) @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true) @RequestHeader(value = "Accept", required = true) String accept,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password, 
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			try {
				ObjectFactory objFactory = new ObjectFactory();
				com.santander.giws.client.MappingDataTypesResponse mappingDataTypeResponse = objFactory
						.createMappingDataTypesResponse();
				MappingDataTypes mappingDataTypesRequest = new MappingDataTypes();
				mappingDataTypesRequest.setUserId(user);
				mappingDataTypesRequest.setPassword(password);
				mappingDataTypeResponse = giwsClient.mappingDataTypesResponse(mappingDataTypesRequest);
				String jsonStr = objectMapper.writeValueAsString(mappingDataTypeResponse);
				return new ResponseEntity<MappingDataTypesResponse>(
						objectMapper.readValue(jsonStr, MappingDataTypesResponse.class),
						HttpStatus.OK);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<MappingDataTypesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<MappingDataTypesResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<ProposalResponse> saveProposal(String context, String authorization, String contentType,
			String xSantanderClientId, String accept, @NotNull @Valid String user, @NotNull @Valid String password,
			@NotNull @Valid String originatorId, String proposalId, @NotNull @Valid String operationType,
			@NotNull @Valid String operationData, @NotNull @Valid String token, String xB3TraceId,
			String xB3ParentSpanId, String xB3SpanId, String xB3Sampled) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<SubmitThirdPartiesResponse> getSubmitThirdParties(
			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true) @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true) @RequestHeader(value = "Accept", required = true) String accept,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password, 
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OperationData", required = true) String operationData, 
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			try {

				String soapEnv = "<soapenv:Envelope xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:fic='https://ficressp.santanderconsumer.com/'><soapenv:Header/><soapenv:Body><fic:submitThirdParties><userId>"
						+ user + "</userId><password>"
						+ password+ "</password><originatorId>?</originatorId><underwriterId>?</underwriterId><originatorProposalReference>?</originatorProposalReference><underwriterProposalReference>?</underwriterProposalReference><operationType>?</operationType><operationData>"
						+ operationData + "</operationData><token>?</token></fic:submitThirdParties></soapenv:Body></soapenv:Envelope>";
				OkHttpClient client = new OkHttpClient().newBuilder()
						  .build();
				MediaType mediaType = MediaType.parse("text/xml; charset=utf-8");
				RequestBody body = RequestBody.create(mediaType, soapEnv);
						Request request = new Request.Builder()
						  .url("https://ficresfrontcert.scftest.santanderconsumer.es/giws/scproposalprocess.asmx")
						  .method("POST", body)
						  .addHeader("Content-Type", "text/xml; charset=utf-8")
						  .addHeader("SOAPAction", "urn:SCProposalServiceTP")
						  .build();
						Response response = client.newCall(request).execute();

						String respStr=response.body().string();
						respStr = respStr.replace("soap:", "").replace("q1:", "");
						JAXBContext jaxbContext = JAXBContext.newInstance(Envelope.class);
			            Unmarshaller un = jaxbContext.createUnmarshaller();
			            StringReader readerStr=new StringReader(respStr);
			            Envelope soapEnvResp = (Envelope) un.unmarshal(readerStr);

				return new ResponseEntity<SubmitThirdPartiesResponse>(
						objectMapper.readValue(objectMapper.writeValueAsString(soapEnvResp.getBody().getSubmitThirdPartiesResponse()), SubmitThirdPartiesResponse.class),
						HttpStatus.OK);
			} catch (IOException | JAXBException e) {
				log.error("ClientAxisException" + e.getLocalizedMessage(), e.getLocalizedMessage());
				return new ResponseEntity<SubmitThirdPartiesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SubmitThirdPartiesResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

}
