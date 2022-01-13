package io.swagger.ws.gqs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class GqsConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.santander.gqs.client");
		return marshaller;
	}
	
	@Bean
	public GqsClient gqsClient(Jaxb2Marshaller marshaller) {
		GqsClient gqsClient = new GqsClient();
		gqsClient.setDefaultUri("https://ficresfrontcert.scftest.santanderconsumer.es/GQS/GQS.asmx");
		gqsClient.setMarshaller(marshaller);
		gqsClient.setUnmarshaller(marshaller);
		return gqsClient;
	}

}
