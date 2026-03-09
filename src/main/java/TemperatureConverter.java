public class TemperatureConverter {

    // Converts Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Converts Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Checks if temperature is extreme
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
}