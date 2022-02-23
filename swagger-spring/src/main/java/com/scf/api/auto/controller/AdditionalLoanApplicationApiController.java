package com.scf.api.auto.controller;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scf.api.auto.api.AdditionalLoanApplicationApi;
import com.scf.api.auto.exception.ResponseError;
import com.scf.api.auto.model.routingservice.route.InfoRoutingData;
import com.scf.api.auto.model.routingservice.route.RoutingResponse;
import com.scf.api.auto.util.JavaNetCookieJar;

import io.swagger.annotations.ApiParam;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Controller
public class AdditionalLoanApplicationApiController implements AdditionalLoanApplicationApi {

    private static final Logger log = LoggerFactory.getLogger(AdditionalLoanApplicationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AdditionalLoanApplicationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

	public ResponseEntity<RoutingResponse> requestRouting(
//			@ApiParam(value = "include context object", required = true) @RequestHeader(value = "Context", required = true) String context,
//			@ApiParam(value = "Authorization token. Bearer OAuth2 token", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "metadata content type", required = true) @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "The server response", required = true) @RequestHeader(value = "Accept", required = true) String accept,
			@ApiParam(value = "", required = true) @Valid @RequestBody InfoRoutingData infoRoutingData,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled) {
		String accept1 = request.getHeader("Accept");
		if (accept1 != null && accept1.contains("application/json")) {
			System.setProperty("java.net.useSystemProxies", "true");
			try {
				String ip = InetAddress.getLocalHost().getHostAddress();
				System.out.println(ip);
			} catch (UnknownHostException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			CookieManager cookieManager=new CookieManager();
			cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
			CookieJar cookieJar = new JavaNetCookieJar(cookieManager);
			HttpUrl url = HttpUrl.parse("https://apisolicitudefc.scftest.santanderconsumer.es/spawapi/routing/route");
			cookieJar.loadForRequest(url );

			OkHttpClient client = new OkHttpClient().newBuilder()

			.build();
			okhttp3.MediaType mediaType = okhttp3.MediaType.parse("application/json; charset=utf-8");
			try {
				okhttp3.RequestBody jsonBody = okhttp3.RequestBody.create(mediaType,
						objectMapper.writeValueAsString(infoRoutingData));
				Request request = new Request.Builder()
						.url("https://apisolicitudefc.scftest.santanderconsumer.es/spawapi/routing/route")
						.method("POST", jsonBody).addHeader("Content-Type", "application/json")
						.addHeader("Host", "apisolicitudefc.scftest.santanderconsumer.es")
						.addHeader("Content-Length", String.valueOf(jsonBody.contentLength()))
						.build();
				Response response = client.newCall(request).execute();
				RoutingResponse routingResponse = new RoutingResponse();
				int codeHttpResponse=response.code();
				if(codeHttpResponse!=200) {
					ResponseError responseError = new ResponseError(HttpStatus.resolve(response.code()));

				}
				String respStr = response.body().string();
				
				return new ResponseEntity<RoutingResponse>(HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			RoutingResponse body = new RoutingResponse();
			String mockResponse = "{\"applicationFunnel\":{\"URL\":\"https://solicitudefc.scftest.santanderconsumer.es/spaw/b9418f7f-9ff1-4f3a-b24d-1e3dd55bdda5\",\"lifeSpan\":3600000000},\"financeID\":\"13243\"}";
			try {
				body = objectMapper.readValue(mockResponse, RoutingResponse.class);
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ResponseEntity<RoutingResponse>(body, HttpStatus.OK);

		}
		return new ResponseEntity<RoutingResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

}
