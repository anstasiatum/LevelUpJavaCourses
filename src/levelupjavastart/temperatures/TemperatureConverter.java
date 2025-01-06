package levelupjavastart.temperatures;

public class TemperatureConverter {
    public static double convertTemperature(
            TemperatureScaleReader.TemperatureScale initialScale,
            double initialValue,
            TemperatureScaleReader.TemperatureScale targetScale
    ) {
        String illegalArgumentExceptionText = "Wrong option";

        TemperatureMeasurement measurement;

        switch (initialScale) {
            case CELSIUS:
                measurement = new CelsiusMeasurement(initialValue);
                break;
            case FAHRENHEIT:
                measurement = new FahrenheitMeasurement(initialValue);
                break;
            case KELVIN:
                measurement = new KelvinMeasurement(initialValue);
                break;
            default:
                throw new IllegalArgumentException(illegalArgumentExceptionText);
        }

        double result;

        switch (targetScale) {
            case CELSIUS:
                result = measurement.toCelsius();
                break;
            case FAHRENHEIT:
                result = measurement.toFahrenheit();
                break;
            case KELVIN:
                result = measurement.toKelvin();
                break;
            default:
                throw new IllegalArgumentException(illegalArgumentExceptionText);
        }
        return result;
    }
}
