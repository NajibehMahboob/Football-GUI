
import java.net.HttpURLConnection;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FootballAppAPI { 
	public static JSONObject getFootballData(String countryName) {
		JSONArray countryData = getcountryData(countryName);
		
		
	}

	private static JSONArray getcountryData(String countryName) {
		
		// conn it means connection!
		try {
			HttpURLConnection conn = fetchApiResponse(urlString);
			if (conn.getResponseCode() != 200) {
				System.out.println("Error: you can not connect to API");
				return null;
			} else 
			{ StringBuilder resulttheJson = new StringBuilder();
			Scanner scanner = new Scanner (conn.getInputStream());
			
			//read data line by line of JSON
			while (scanner.hasnext()) {
				resulttheJson.append(scanner.nextLine());
				
			}
			scanner.close();
			conn.disconnect();
			// import JSON parser library for parse the JSON string
			JSONParser parser = new JSONParser();
			JSONObject resaulttheJsonObj = (JSONObject) parser.parse(String.valueOf(resulttheJson));
			
			JSONArray countryData = (JSONArray) resaulttheJsonObj.get ("the resaults");
			 return countryData;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
