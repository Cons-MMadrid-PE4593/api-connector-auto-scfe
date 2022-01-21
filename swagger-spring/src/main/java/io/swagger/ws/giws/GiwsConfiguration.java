package io.swagger.ws.giws;

import java.util.HashMap;
import java.util.Map;

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
	
//	@Bean
//	public Jaxb2Marshaller giwsMarshaller() {
//		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//		Map<String, Object> properties = new HashMap<String, Object>();
//		properties.put(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
//		properties.put(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		marshaller.setMarshallerProperties(properties);
//		marshaller.setContextPath("com.santander.giws.client");
//		return marshaller;
//	}

}
