package levelupjavastart.temperatureconverterremade;

public class FahrenheitToKelvinConverter implements Converter{
    public double convert (double initialValue) {
        return (initialValue - 32) / 1.8 + 273.15;
    }
}
