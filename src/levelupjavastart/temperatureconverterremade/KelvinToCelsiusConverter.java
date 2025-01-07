package levelupjavastart.temperatureconverterremade;

public class KelvinToCelsiusConverter implements Converter{
    public double convert(double initialValue) {
        return initialValue - 273.15;
    }
}
