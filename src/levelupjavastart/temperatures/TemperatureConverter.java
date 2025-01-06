package levelupjavastart.temperatures;

public class TemperatureConverter {
    public static double converter(TemperatureScaleReader.TemperatureScale initialScale, double value, TemperatureScaleReader.TemperatureScale targetScale) {
        double result;
        switch (initialScale) {
            case KELVIN :
                switch (targetScale) {
                    case FAHRENHEIT:
                        result = 1.8 * (value - 273.15) + 32;
                        break;
                    case CELSIUS:
                        result = value - 273.15;
                        break;
                    default: throw new IllegalStateException("Wrong option.");
                }
                break;
            case CELSIUS:
                switch (targetScale) {
                    case FAHRENHEIT:
                        result = value * 1.8 + 32;
                        break;
                    case KELVIN:
                        result = value + 273.15;
                        break;
                    default: throw new IllegalStateException("Wrong option.");
                }
                break;
            case FAHRENHEIT:
                switch (targetScale) {
                    case CELSIUS:
                        result = (value - 32) / 1.8;
                        break;
                    case KELVIN:
                        result = (value - 32) / 1.8 + 273.15;
                        break;
                    default: throw new IllegalStateException("Wrong option.");
                }
                break;
            default: throw new IllegalStateException("Wrong option.");
        }
        return result;
    }
}
