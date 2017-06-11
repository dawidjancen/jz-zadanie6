package jerseyclientdemo;

import rest.WeatherClient;
import domain.Weather;

public class Program {
	public static void main(String[] args) {
		WeatherClient client = new WeatherClient();

		printWeather(client.get("warsaw"));
		printWeather(client.get("gdansk"));
		printWeather(client.get("krakow"));
		printWeather(client.get("wroclaw"));
		printWeather(client.get("poznan"));
		printWeather(client.get("lodz"));
		printWeather(client.get("katowice"));
	}
	
	public static void printWeather(Weather w) {
		System.out.println("--- --- --");
		System.out.println(w.getId());
		System.out.println(w.getName());
		System.out.println(w.getMain().getTemp());
		System.out.println(w.getWind().getSpeed());
		System.out.println(w.getClouds().getAll());
		System.out.println("--- --- --");
	}
}
