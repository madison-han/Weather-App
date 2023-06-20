import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherAppTest {
    @Test
    public void testTemperatureParsing() {
        String weatherData = "{\"main\":{\"temp\":293.15,\"humidity\":70}}";
        String temperature = DataParser.parseTemperature(weatherData);
        assertEquals("293.15", temperature);
    }

    @Test
    public void testHumidityParsing() {
        String weatherData = "{\"main\":{\"temp\":293.15,\"humidity\":70}}";
        String humidity = DataParser.parseHumidity(weatherData);
        assertEquals("70", humidity);
    }

    // Add more test cases for other components of the weather app
}
