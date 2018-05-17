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
import entities.Place;

public class PlaceDao {
	
	private static String url = Defines.url + "/places";

	public PlaceDao() {
	}
	
	// get list
	public List<Place> getList(){
		String uri = url;
		
		List<Place> list = new ArrayList();
		
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
				
				Place place = gson.fromJson(jsonObject.toString(), Place.class);
				list.add(place);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public boolean addItem(Place place) {
		String uri = url;
		RestTemplate restTemplate = new RestTemplate();
		restTemplate = new RestTemplate();
		Place result = restTemplate.postForObject(uri, place, Place.class);
		if(result != null) {
			return true;
		}
		return false;
	}

	public Place getItem(int id) {
		String uri = url + "/viewById/" + id;
		RestTemplate restTemplate = new RestTemplate();
		String jsonString = restTemplate.getForObject(uri, String.class);
		jsonString = jsonString.substring(9, jsonString.length()-2);
		Place place = null;
		Gson gson = new Gson();
		place = gson.fromJson(jsonString, Place.class);
		System.out.println(place.getPlaceName());
		return place;
	}

	public boolean editItem(Place place) {
		String uri = url + "/" + place.getId();
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(uri, place);
		return true;
	}

}
