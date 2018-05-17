package dao;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import defines.Defines;
import entities.Location;
import entities.Place;

public class LocationDAO {

	private static String url = Defines.url + "/locations";

	public LocationDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	// get list
	public List<Location> getList(){
		String uri = url;
		
		List<Location> list = new ArrayList();
		
		RestTemplate restTemplate = new RestTemplate();
		// Chuỗi json
		String result = restTemplate.getForObject(uri, String.class);
		result = result.substring(8, result.length()-1);
		System.out.println(result);
		try {
			JSONParser jsonParser = new JSONParser();
			
			JSONArray jsonArray = (JSONArray) jsonParser.parse(result);
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jsonObject = (JSONObject) jsonArray.get(i);
				
				Gson gson = new Gson();
				
				Location obj = gson.fromJson(jsonObject.toString(), Location.class);
				list.add(obj);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Location getItemById(int id) {
		String uri = url + "/" +id;
		Location obj = new Location();
		RestTemplate restTemplate = new RestTemplate();
		// Chuỗi json
		String result = restTemplate.getForObject(uri, String.class);
		result = result.substring(8, result.length()-1);
		
		Gson gson = new Gson();
		obj = gson.fromJson(result, Location.class);
		return obj;
	}
}
