package levelupjavastart.temperatures;

public class FahrenheitMeasurement extends TemperatureMeasurement {

    public FahrenheitMeasurement(double value) {
        super(value, TemperatureScaleReader.TemperatureScale.FAHRENHEIT);
    }

    @Override
    public double toCelsius() {
        return (this.value - 32) / 1.8;
    }

    @Override
    public double toKelvin() {
        return (this.value - 32) / 1.8 + 273.15;
    }

    @Override
    public double toFahrenheit() {
        return this.value;
    }
}
