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
import com.santander.giws.client.MappingDataTypes;
import com.santander.giws.client.MappingDataTypesResponse;


public class GiwsClient extends WebServiceGatewaySupport {

	public GiwsClient() {

	}

	public GiwsClient(WebServiceMessageFactory messageFactory) {
		super(messageFactory);
	}
	
	public GetVehiclesResponse vehiclesResponse (GetVehicles vehiclesRequest) {

		return (GetVehiclesResponse) getWebServiceTemplate().marshalSendAndReceive(vehiclesRequest, new WebServiceMessageCallback() {	
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				( (SoapMessage) message ).setSoapAction( "https://ficressp.santanderconsumer.com/getVehicles" );
				
			}
		});
	}
	
	public MappingDataTypesResponse mappingDataTypesResponse (MappingDataTypes mappingDataTypesRequest) {

		return (MappingDataTypesResponse) getWebServiceTemplate().marshalSendAndReceive(mappingDataTypesRequest, new WebServiceMessageCallback() {	
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				( (SoapMessage) message ).setSoapAction( "https://ficressp.santanderconsumer.com/MappingDataTypes" );
				
			}
		});
	}

}
