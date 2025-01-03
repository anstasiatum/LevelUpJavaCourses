package levelupjavastart.automobile;

import java.util.Random;

public class AutomobileRunner {
    public static void main(String[] args) {
        Automobile[] array = new Automobile[10];

        Random randomizer = new Random();

        for (int i = 0; i < array.length; i++) {
            int carOrTruck = randomizer.nextInt(2);
            int distance = randomizer.nextInt(1000);
            if (carOrTruck == 0) {
                array[i] = new Car();
            } else {
                array[i] = new Truck();
            }
            String isMoving = array[i].move(distance);
            System.out.println(array[i].automobileType + " has run " + distance + "km. " + isMoving);
        }
    }
}
