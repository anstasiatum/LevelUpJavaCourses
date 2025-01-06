package levelupjavastart.temperatures;

public abstract class TemperatureMeasurement implements Convertable{
    double value;
    TemperatureScaleReader.TemperatureScale unit;

    public TemperatureMeasurement(double value, TemperatureScaleReader.TemperatureScale unit) {
        this.value = value;
        this.unit = unit;
    }
}
