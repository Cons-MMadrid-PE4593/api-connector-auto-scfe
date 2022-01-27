package io.swagger.ws.giws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class GiwsConfiguration{
	@Autowired Jaxb2Marshaller marshaller;	
	
	@Bean
	public GiwsClient giwsClient() {
		GiwsClient gqsClient = new GiwsClient();
		gqsClient.setDefaultUri("https://ficresfrontcert.scftest.santanderconsumer.es/giws/scproposalprocess.asmx");
		gqsClient.setMarshaller(marshaller);
		gqsClient.setUnmarshaller(marshaller);
		return gqsClient;
	}

}
