package io.swagger.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.api.AdditionalLoanApplicationApi;
import io.swagger.routing.route.model.InfoRoutingData;
import io.swagger.routing.route.model.RoutingResponse;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T15:26:16.036Z")

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

    public ResponseEntity<RoutingResponse> requestRouting(@ApiParam(value = "include context object" ,required=true) @RequestHeader(value="Context", required=true) String context,@ApiParam(value = "Authorization token. Bearer OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "metadata content type" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,@ApiParam(value = "Client Id header" ,required=true) @RequestHeader(value="X-Santander-Client-Id", required=true) String xSantanderClientId,@ApiParam(value = "The server response" ,required=true) @RequestHeader(value="Accept", required=true) String accept,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InfoRoutingData infoRoutingData,@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long." ) @RequestHeader(value="X-B3-TraceId", required=false) String xB3TraceId,@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. " ) @RequestHeader(value="X-B3-ParentSpanId", required=false) String xB3ParentSpanId,@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId." ) @RequestHeader(value="X-B3-SpanId", required=false) String xB3SpanId,@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug" ) @RequestHeader(value="X-B3-Sampled", required=false) String xB3Sampled) {
        String accept1 = request.getHeader("Accept");
        if (accept1 != null && accept1.contains("application/json")) {
            	RestTemplate restClient = new RestTemplate();
            	
            	HttpHeaders headers = new HttpHeaders();
                headers.set("Content-Type", "application/json");    
    
             
                HttpEntity<InfoRoutingData> request = new HttpEntity<>(infoRoutingData, headers);
                 
            	ResponseEntity<RoutingResponse> response= restClient.postForEntity("https://apisolicitudefc.scftest.santanderconsumer.es/spawapi/routing/route", request, RoutingResponse.class);
            	
                return response;
//                try {
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<RoutingResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        }

        return new ResponseEntity<RoutingResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}