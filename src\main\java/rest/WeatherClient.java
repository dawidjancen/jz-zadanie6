package rest;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import domain.Weather;

public class WeatherClient {
	public static final String URL =
		"http://api.openweathermap.org/data/2.5/weather";
	
	public Weather get(String cityName){
		System.out.println(ClientBuilder
		.newClient()
		.target(URL)
		.queryParam("q", cityName)
		.queryParam("APPID", "294147b7d4b38678e1c81c83abac2ebd"));
		
		return ClientBuilder
		.newClient()
		.target(URL)
		.queryParam("q", cityName)
		.queryParam("APPID", "294147b7d4b38678e1c81c83abac2ebd")
		.request(MediaType.APPLICATION_JSON)
		.get()
		.readEntity(Weather.class);
	}
}
