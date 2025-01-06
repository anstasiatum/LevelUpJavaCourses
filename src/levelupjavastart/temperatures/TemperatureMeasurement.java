package levelupjavastart.temperatures;

public abstract class TemperatureMeasurement implements Convertable{
    protected double value;
    protected TemperatureScaleReader.TemperatureScale unit;

    public TemperatureMeasurement(double value, TemperatureScaleReader.TemperatureScale unit) {
        this.value = value;
        this.unit = unit;
    }
}
