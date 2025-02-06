package levelupjavastart.checkpointexceptions;

import levelupjavastart.checkpointexceptions.exceptions.CallThePoliceException;
import levelupjavastart.checkpointexceptions.exceptions.SizeException;
import levelupjavastart.checkpointexceptions.exceptions.SpeedingException;

public class CheckpointRunner {
    public static void main(String[] args) {
        for (int carCount = 0; carCount < 50; carCount++) {
            Automobile automobile = Automobile.carGenerator();
            System.out.printf("Type: %s, Width: %f, Height: %f, Length: %f, Speed: %f, Plate: %s, Weight: %f ", automobile.getAutomobileType(), automobile.getWidth(), automobile.getHeight(), automobile.getLength(), automobile.getSpeed(), automobile.getPlateNumber(), automobile.getWeight());

            try {
                CheckpointRestrictions.speedingRestrictions(automobile);
            } catch (SpeedingException | CallThePoliceException e) {
                System.out.println(e.getMessage());
            }

            try {
                CheckpointRestrictions.sizeRestrictions(automobile);
            } catch (SizeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
