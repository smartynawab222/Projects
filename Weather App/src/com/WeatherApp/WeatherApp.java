package com.WeatherApp;
import java.;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter city name: ");
    String city = scanner.nextLine();
    String apiKey = "YOUR_API_KEY"; // Replace with your OpenWeatherMap API key

    String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

    URL url = new URL(apiUrl);
    Scanner apiScanner = new Scanner(url.openStream());
    StringBuilder response = new StringBuilder();

    while (apiScanner.hasNext()) {
        response.append(apiScanner.nextLine());
    }
    apiScanner.close();

    JSONObject jsonObject = new JSONObject(response.toString());
    JSONObject main = jsonObject.getJSONObject("main");

    double temperature = main.getDouble("temp");
    int humidity = main.getInt("humidity");

    System.out.println("Temperature: " + temperature + "°C");
    System.out.println("Humidity: " + humidity + "%");
}
}
