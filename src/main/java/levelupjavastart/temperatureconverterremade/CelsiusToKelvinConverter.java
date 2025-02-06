package levelupjavastart.temperatureconverterremade;

public class CelsiusToKelvinConverter implements Converter{

    public double convert(double initialValue) {
        return initialValue + 273.15;
    }
}
