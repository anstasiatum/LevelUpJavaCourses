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

        double result = TemperatureConverter.convertTemperature(initialScale, initialValue, targetScale);

        System.out.println("The result is: " + result);
    }
}
