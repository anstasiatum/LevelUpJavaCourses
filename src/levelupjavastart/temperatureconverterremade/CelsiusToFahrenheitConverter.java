package levelupjavastart.temperatureconverterremade;

public class CelsiusToFahrenheitConverter implements Converter{
    public double convert(double initialValue) {
        return initialValue + 1.8 + 32;
    }
}
