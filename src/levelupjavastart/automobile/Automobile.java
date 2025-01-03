package levelupjavastart.automobile;

public abstract class Automobile {
    public enum AutomobileType {
        CAR,
        TRUCK
    }

    AutomobileType automobileType;

    public Automobile(AutomobileType automobileType) {
        this.automobileType = automobileType;
    }

    public abstract String move(int distance);
}
