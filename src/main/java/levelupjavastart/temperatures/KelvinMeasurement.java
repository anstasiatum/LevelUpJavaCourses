package levelupjavastart.temperatures;

public class KelvinMeasurement extends TemperatureMeasurement{

    public KelvinMeasurement(double value) {
        super(value, TemperatureScaleReader.TemperatureScale.KELVIN);
    }

    @Override
    public double toCelsius() {
        return this.value - 273.15;
    }

    @Override
    public double toKelvin() {
        return this.value;
    }

    @Override
    public double toFahrenheit() {
        return 1.8 * (this.value - 273.15) + 32;
    }
}
