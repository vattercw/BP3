import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Parser {

	public Parser(){
		
	}
	
	public JSONArray parseJSON(String filePath){
		
		JSONParser parser = new JSONParser();
		JSONArray jsonObjects;
		
		try {
			jsonObjects = (JSONArray) parser.parse(new FileReader(filePath));
			return jsonObjects;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		return null; //if exceptions are thrown
		
		
	}
}
