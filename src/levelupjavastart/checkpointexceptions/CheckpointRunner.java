package levelupjavastart.checkpointexceptions;

public class CheckpointRunner {
    public static void main(String[] args) {
        for (int carCount = 0; carCount < 50; carCount++) {
            Automobile automobile = Automobile.carGenerator();
            System.out.println("Type: " + automobile.getAutomobileType() + " Width: " + automobile.getWidth() + " Height: " +  automobile.getHeight() + " Length: " + " " + automobile.getLength() + " Speed: " + " " + automobile.getSpeed() + " Plate: " + automobile.getPlateNumber() + " Weight: " + automobile.getWeight());

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
