package levelupjavastart.checkpointexceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Random;

@Getter
@RequiredArgsConstructor
public class Automobile {

    private final AutomobileType automobileType;
    private final String plateNumber;
    private final double speed;
    private final double weight;
    private final double width;
    private final double height;
    private final double length;

    private static final Random RANDOM = new Random();

    public static Automobile carGenerator() {

        AutomobileType carAutomobileType = RANDOM.nextBoolean() ? AutomobileType.TRUCK : AutomobileType.CAR;

        StringBuilder stringBuilderForCarPlateLetters = new StringBuilder(3);
        for (int i = 0; i < 3; i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            stringBuilderForCarPlateLetters.append((char) randomLimitedInt);
        }
        String carPlateLetters = stringBuilderForCarPlateLetters.toString();

        String carPlateNumber = RANDOM.nextInt(100, 1000) + carPlateLetters;
        double carWidth = RANDOM.nextDouble(1.5, 3);
        double carHeight = RANDOM.nextDouble(1, 5);
        double carLength = RANDOM.nextDouble(3, 7.5);
        double carSpeed = RANDOM.nextDouble(50, 120);
        double carWeight = RANDOM.nextDouble(1, 10);
        return new Automobile(carAutomobileType, carPlateNumber, carSpeed, carWeight, carWidth, carHeight, carLength);
    }
}
