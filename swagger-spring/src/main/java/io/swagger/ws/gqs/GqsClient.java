package io.swagger.ws.gqs;

import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.santander.gqs.client.GetProdutcs;
import com.santander.gqs.client.GetProdutcsResponse;

public class GqsClient extends WebServiceGatewaySupport {

	public GqsClient() {
		// TODO Auto-generated constructor stub
	}

	public GqsClient(WebServiceMessageFactory messageFactory) {
		super(messageFactory);
		// TODO Auto-generated constructor stub
	}
	
	public GetProdutcsResponse getProductsResponse (GetProdutcs getProductsRequest) {
//		String uri="https://ficresfrontcert.scftest.santanderconsumer.es/GQS/GQS.asmx";
//		return (GetProdutcsResponse) getWebServiceTemplate().marshalSendAndReceive(uri, getProductsRequest);
		return (GetProdutcsResponse) getWebServiceTemplate().marshalSendAndReceive(getProductsRequest);
	}

}
