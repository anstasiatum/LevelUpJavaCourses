package levelupjavastart.temperatures;

import java.util.Scanner;

public class ConverterRunner {
    public static void main(String[] args) {
        System.out.print("Set the initial temperature scale (CELSIUS, KELVIN, OR FAHRENHEIT): ");
        Scanner scanner = new Scanner(System.in);
        String initialInputScale = scanner.nextLine();
        TemperatureScaleReader.TemperatureScale initialScale = TemperatureScaleReader.scaleReader(initialInputScale);

        System.out.print("Set the target temperature scale (CELSIUS, KELVIN, OR FAHRENHEIT): ");
        String targetInputScale = scanner.nextLine();
        TemperatureScaleReader.TemperatureScale targetScale = TemperatureScaleReader.scaleReader(targetInputScale);

        System.out.print("Set the initial temperature value: ");
        double initialValue = scanner.nextDouble();

        String IllegalArgumentExceptionText = "Wrong option";

        TemperatureMeasurement measurementUnit;

        switch (initialScale) {
            case CELSIUS:
                measurementUnit = new CelsiusMeasurement(initialValue);
                break;
            case FAHRENHEIT:
                measurementUnit = new FahrenheitMeasurement(initialValue);
                break;
            case KELVIN:
                measurementUnit = new KelvinMeasurement(initialValue);
                break;
            default:
                throw new IllegalArgumentException(IllegalArgumentExceptionText);
        }
        double result;
        switch (targetScale) {
            case CELSIUS:
                result = measurementUnit.toCelsius();
                break;
            case FAHRENHEIT:
                result = measurementUnit.toFahrenheit();
                break;
            case KELVIN:
                result = measurementUnit.toKelvin();
                break;
            default:
                throw new IllegalArgumentException(IllegalArgumentExceptionText);
        }

        System.out.println("The result is: " + result);
    }
}
