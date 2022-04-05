package com.scf.api.auto.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

import org.apache.tomcat.util.http.fileupload.FileUtils;

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
//		File file= new File("JSONResponse"+Calendar.getInstance().getTimeInMillis());
//		try {
//			file.createNewFile();
//			FileWriter writer = new FileWriter(file);
//			writer.write(jsonStr);
//			writer.flush();
//			writer.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		objectMapper.coercionConfigFor(LogicalType.POJO)
		  .setCoercion(CoercionInputShape.EmptyString, CoercionAction.AsEmpty);
		String content = readFile("test.txt", StandardCharsets.UTF_8);
		return (T) objectMapper.readValue(content,response);
	}

	private static String readFile(String string, Charset utf8) {

		StringBuffer fileData = new StringBuffer();
		try {
			BufferedReader reader;
			reader = new BufferedReader(
			        new FileReader("JSONResponse1648807082972"));
			char[] buf = new char[1024];
			int numRead=0;
			while((numRead=reader.read(buf)) != -1){
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return fileData.toString();

	}
}
