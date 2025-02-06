package levelupjavastart.checkpointexceptions;

import java.util.Random;

public class Automobile {

    private AutomobileType automobileType;
    private String plateNumber;
    private double speed;
    private double weight;
    private double width;
    private double height;
    private double length;

    private static final Random RANDOM = new Random();

    public static Automobile carGenerator() {
        Automobile automobile = new Automobile();
        automobile.automobileType = RANDOM.nextBoolean() ? AutomobileType.TRUCK : AutomobileType.CAR;

        StringBuilder stringBuilderForCarPlateLetters = new StringBuilder(3);
        for (int i = 0; i < 3; i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            stringBuilderForCarPlateLetters.append((char) randomLimitedInt);
        }
        String carPlateLetters = stringBuilderForCarPlateLetters.toString();

        automobile.plateNumber = RANDOM.nextInt(100, 1000) + carPlateLetters;
        automobile.width = RANDOM.nextDouble(1.5, 3);
        automobile.height = RANDOM.nextDouble(1, 5);
        automobile.length = RANDOM.nextDouble(3, 7.5);
        automobile.speed = RANDOM.nextDouble(50, 120);
        automobile.weight = RANDOM.nextDouble(1, 10);
        return automobile;
    }

    public AutomobileType getAutomobileType() {
        return automobileType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}
