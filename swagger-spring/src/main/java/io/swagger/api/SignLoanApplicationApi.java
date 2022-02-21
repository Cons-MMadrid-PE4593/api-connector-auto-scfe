package io.swagger.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;
import io.swagger.model.ProposalResponse;
import io.swagger.model.ResponseError;


@Validated
@Api(value = "signLoanApplication", tags = {"auto-api-controller"})
//@RequestMapping(value = "/AutoSCFE")
public interface SignLoanApplicationApi {

    @ApiOperation(value = "Active Products by Dealer", nickname = "getProducts", notes = "Available Products List for this dealerr", response = ProposalResponse.class, authorizations = {
        @Authorization(value = "JWTProfile", scopes = {
            @AuthorizationScope(scope = "sce", description = "sce")
            })
    })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "200 OK", response = ProposalResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ResponseError.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal Error Server") })
    @RequestMapping(value = "/signLoanApplication/loan/proposal/{ProposalId}/signINE",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ProposalResponse> getProducts(@ApiParam(value = "include context object" ,required=true) @RequestHeader(value="Context", required=true) String context,@ApiParam(value = "Authorization token. Bearer OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "metadata content type" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,@ApiParam(value = "Client Id header" ,required=true) @RequestHeader(value="X-Santander-Client-Id", required=true) String xSantanderClientId,@ApiParam(value = "The server response" ,required=true) @RequestHeader(value="Accept", required=true) String accept,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "BusinessUnit", required = true) String businessUnit,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Version", required = true) String version,@ApiParam(value = "",required=true) @PathVariable("ProposalId") String proposalId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "XMLDataGetProducts", required = true) String xmLDataGetProducts,@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long." ) @RequestHeader(value="X-B3-TraceId", required=false) String xB3TraceId,@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. " ) @RequestHeader(value="X-B3-ParentSpanId", required=false) String xB3ParentSpanId,@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId." ) @RequestHeader(value="X-B3-SpanId", required=false) String xB3SpanId,@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug" ) @RequestHeader(value="X-B3-Sampled", required=false) String xB3Sampled);


    @ApiOperation(value = "Submit Proposal, second call submit third parties", nickname = "submitProposal", notes = "Submit proposal", response = ProposalResponse.class, authorizations = {
        @Authorization(value = "JWTProfile", scopes = {
            @AuthorizationScope(scope = "sce", description = "sce")
            })
    })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "200 OK", response = ProposalResponse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad Request", response = ResponseError.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal Error Server") })
    @RequestMapping(value = "/signLoanApplication/loan/proposal/{ProposalId}/signContract",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ProposalResponse> submitProposal(@ApiParam(value = "include context object" ,required=true) @RequestHeader(value="Context", required=true) String context,@ApiParam(value = "Authorization token. Bearer OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "metadata content type" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,@ApiParam(value = "Client Id header" ,required=true) @RequestHeader(value="X-Santander-Client-Id", required=true) String xSantanderClientId,@ApiParam(value = "The server response" ,required=true) @RequestHeader(value="Accept", required=true) String accept,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "User", required = true) String user,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Password", required = true) String password,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OriginatorId", required = true) String originatorId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OperationType", required = true) String operationType,@ApiParam(value = "",required=true) @PathVariable("ProposalId") String proposalId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "OperationData", required = true) String operationData,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "Token", required = true) String token,@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long." ) @RequestHeader(value="X-B3-TraceId", required=false) String xB3TraceId,@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. " ) @RequestHeader(value="X-B3-ParentSpanId", required=false) String xB3ParentSpanId,@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId." ) @RequestHeader(value="X-B3-SpanId", required=false) String xB3SpanId,@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID.  The possible values are 0 = Deny 1 = Accept d = Debug" ) @RequestHeader(value="X-B3-Sampled", required=false) String xB3Sampled);

}
