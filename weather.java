import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class WeatherApp {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the name of a city: ");
            String city = reader.readLine();
            
            // Encode the city name to be used in the API URL
            String encodedCity = URLEncoder.encode(city, "UTF-8");
            
            // API URL for weather data
            String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + encodedCity + "&appid=YOUR_API_KEY";
            
            // Send a GET request to the API and retrieve the response
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader apiReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            // Read the response and print weather information
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = apiReader.readLine()) != null) {
                response.append(line);
            }
            apiReader.close();
            
            System.out.println("Weather information for " + city + ":");
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
