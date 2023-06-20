import org.json.JSONObject;

public class DataParser {
    public static String parseTemperature(String weatherData) {
        JSONObject json = new JSONObject(weatherData);
        JSONObject main = json.getJSONObject("main");
        return main.getString("temp");
    }

    public static String parseHumidity(String weatherData) {
        JSONObject json = new JSONObject(weatherData);
        JSONObject main = json.getJSONObject("main");
        return main.getString("humidity");
    }

    // Add more parsing methods as per your requirement
}
