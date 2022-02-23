package com.scf.api.auto.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class GqsUtil {
	public static <T> T getJsonFormatResponse(String result, ObjectMapper objectMapper, Class<T> response)
			throws JsonProcessingException, JsonMappingException {
		XmlMapper xmlMapper = new XmlMapper();
		JsonNode node = xmlMapper.readTree(result);
		String jsonStr = objectMapper.writeValueAsString(node);
		objectMapper.coercionConfigFor(LogicalType.POJO)
		  .setCoercion(CoercionInputShape.EmptyString, CoercionAction.AsEmpty);
		return (T) objectMapper.readValue(jsonStr,response);
	}
}
