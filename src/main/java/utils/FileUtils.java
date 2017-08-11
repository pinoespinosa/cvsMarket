package utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileUtils {

	
	public static void toFile(String name, Object objeto) {
	
		
		
		
		ObjectMapper mapper = new ObjectMapper();

		try {
			String indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objeto);
		
		
			try{
			    PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
			    writer.println(indented);
			    writer.close();
			} catch (IOException e) {
			   // do something
			}
		
		
		
		
		
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
	}
	
}
