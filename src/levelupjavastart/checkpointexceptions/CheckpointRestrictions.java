package levelupjavastart.checkpointexceptions;

import levelupjavastart.checkpointexceptions.exceptions.CallThePoliceException;
import levelupjavastart.checkpointexceptions.exceptions.SizeException;
import levelupjavastart.checkpointexceptions.exceptions.SpeedingException;

public class CheckpointRestrictions {

    public static void speedingRestrictions(Automobile automobile) throws SpeedingException, CallThePoliceException {
        if (automobile.getSpeed() > 80 && automobile.getSpeed() <= 100)
            throw new SpeedingException("Speeding issue. The automobile is moving too fast. Speed: %f km/h".formatted(automobile.getSpeed()));
        else if (automobile.getSpeed() > 100)
            throw new CallThePoliceException("Very high speed. Call the police! Speed: %f km/h. The plate number is: %s".formatted(automobile.getSpeed(), automobile.getPlateNumber()));
    }

    public static void sizeRestrictions(Automobile automobile) throws SizeException {
        String sizeExceptionText = "The automobile cannot pass - it is too large. Plate number: %s, %s".formatted(automobile.getPlateNumber(), automobile.getAutomobileType());

        if (automobile.getWeight() > 8) {
            throw new SizeException(sizeExceptionText);
        } else if (automobile.getHeight() > 4 || automobile.getWidth() > 2.5) {
            throw new SizeException(sizeExceptionText);
        } else if (automobile.getWidth() > 2.5) {
            throw new SizeException(sizeExceptionText);
        }
    }
}