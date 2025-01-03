package levelupjavastart.automobile;

public final class Truck extends Automobile {

    public Truck() {
        super(AutomobileType.TRUCK);
    }

    @Override
    public String move(int distance) {

        if (distance < 1200) {
            return "Can still move.";
        } else {
            return "Out of petrol.";
        }
    }
}
