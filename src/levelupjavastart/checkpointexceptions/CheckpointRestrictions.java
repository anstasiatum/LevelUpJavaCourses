package levelupjavastart.checkpointexceptions;

public class CheckpointRestrictions {

    public static void speedingRestrictions(Automobile automobile) throws SpeedingException, CallThePoliceException {
        if (automobile.getSpeed() > 80 && automobile.getSpeed() <= 100)
            throw new SpeedingException("Speeding issue. The automobile is moving too fast. Speed: " + automobile.getSpeed() + "km/h");
        else if (automobile.getSpeed() > 100)
            throw new CallThePoliceException("Very high speed. Call the police! Speed: " + automobile.getSpeed() + "km/h. The plate number is: " + automobile.getPlateNumber());
    }

    public static void sizeRestrictions(Automobile automobile) throws SizeException {
        String sizeExceptionText = "The automobile cannot pass - it is too large. Plate number: " + automobile.getPlateNumber() + ", " + automobile.automobileType;

        if (automobile.getWeight() > 8)
            throw new SizeException(sizeExceptionText);
        else if (automobile.getHeight() > 4)
            throw new SizeException(sizeExceptionText);
        else if (automobile.getWidth() > 2.5)
            throw new SizeException(sizeExceptionText);
    }
}

