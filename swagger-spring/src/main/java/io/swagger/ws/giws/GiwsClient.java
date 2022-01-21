package io.swagger.ws.giws;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import com.santander.giws.client.GetVehicles;
import com.santander.giws.client.GetVehiclesResponse;


public class GiwsClient extends WebServiceGatewaySupport {

	public GiwsClient() {
		// TODO Auto-generated constructor stub
	}

	public GiwsClient(WebServiceMessageFactory messageFactory) {
		super(messageFactory);
		// TODO Auto-generated constructor stub
	}
	
	public GetVehiclesResponse vehiclesResponse (GetVehicles vehiclesRequest) {
//		getWebServiceTemplate()
		return (GetVehiclesResponse) getWebServiceTemplate().marshalSendAndReceive(vehiclesRequest, new WebServiceMessageCallback() {	
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				( (SoapMessage) message ).setSoapAction( "https://ficressp.santanderconsumer.com/getVehicles" );
				
			}
		});
	}

}
