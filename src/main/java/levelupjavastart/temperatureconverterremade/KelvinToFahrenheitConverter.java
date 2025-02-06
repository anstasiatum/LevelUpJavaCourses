package levelupjavastart.temperatureconverterremade;

public class KelvinToFahrenheitConverter implements Converter {
    @Override
    public double convert(double initialValue) {
        return 1.8 * (initialValue - 273.15) + 32;
    }
}
