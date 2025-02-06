package levelupjavastart.temperatures;

public class TemperatureScaleReader {
    public enum TemperatureScale {
        CELSIUS,
        KELVIN,
        FAHRENHEIT
    }

    TemperatureScale temperatureScale;

    public static TemperatureScale scaleReader(String inputScale) {

        TemperatureScale scale;

        if (inputScale.compareToIgnoreCase("CELSIUS") == 0) {
            scale = TemperatureScale.CELSIUS;
        } else if (inputScale.compareToIgnoreCase("KELVIN") == 0) {
            scale = TemperatureScale.KELVIN;
        } else if (inputScale.compareToIgnoreCase("FAHRENHEIT") == 0) {
            scale = TemperatureScale.FAHRENHEIT;
        } else {
            throw new IllegalStateException("Wrong option.");
        }
        return scale;
    }
}
