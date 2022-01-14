package io.swagger.ws.gqs;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

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
		return (GetProdutcsResponse) getWebServiceTemplate().marshalSendAndReceive(getProductsRequest, new WebServiceMessageCallback() {	
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				( (SoapMessage) message ).setSoapAction( "GQSResponse/GetProdutcs" );
				
			}
		});
	}

}
