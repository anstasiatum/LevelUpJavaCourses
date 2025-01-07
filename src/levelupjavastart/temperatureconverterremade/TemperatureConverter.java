package levelupjavastart.temperatureconverterremade;

public class TemperatureConverter {
    public static double convertTemperature(
            TemperatureScaleReader.TemperatureScale initialScale,
            double initialValue,
            TemperatureScaleReader.TemperatureScale targetScale
    ) {

        Converter converter = switch (initialScale) {
            case CELSIUS -> switch (targetScale) {
                case CELSIUS -> new IdentityConverter();
                case FAHRENHEIT -> new CelsiusToFahrenheitConverter();
                case KELVIN -> new CelsiusToKelvinConverter();
            };
            case FAHRENHEIT -> switch (targetScale) {
                case CELSIUS -> new FahrenheitToCelsiusConverter();
                case FAHRENHEIT -> new IdentityConverter();
                case KELVIN -> new FahrenheitToKelvinConverter();
            };
            case KELVIN -> switch (targetScale) {
                case CELSIUS -> new KelvinToCelsiusConverter();
                case FAHRENHEIT -> new KelvinToFahrenheitConverter();
                case KELVIN -> new IdentityConverter();
            };
        };

        return converter.convert(initialValue);
    }
}
