package levelupjavastart.temperatureconverterremade;

public class FahrenheitToCelsiusConverter implements Converter{
    public double convert (double initialValue) {
        return initialValue + 273.15;
    }
}
