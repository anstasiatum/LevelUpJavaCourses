package levelupjavastart.automobile;

public final class Car extends Automobile {

    public Car() {
        super(AutomobileType.CAR);
    }

    @Override
    public String move(int distance) {

        if (distance < 500) {
            return "Can still move.";
        } else {
            return "Out of petrol.";
        }
    }
}
