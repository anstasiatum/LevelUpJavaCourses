package levelupjavastart.temperatures;

public class CelsiusMeasurement extends TemperatureMeasurement {

    public CelsiusMeasurement(double value) {
        super(value, TemperatureScaleReader.TemperatureScale.CELSIUS);
    }

    @Override
    public double toCelsius() {
        return this.value;
    }

    @Override
    public double toKelvin() {
        return this.value + 273.15;
    }

    @Override
    public double toFahrenheit() {
        return this.value * 1.8 + 32;
    }
}
