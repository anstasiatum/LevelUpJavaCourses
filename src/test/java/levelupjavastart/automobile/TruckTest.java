package levelupjavastart.automobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {
    private final Automobile truck = new Truck();

    @Test
    @DisplayName("Truck can still move if the distance is < 1200")
    void truckCanMove() {
        String result = truck.move(1199);
        assertEquals("Can still move.", result);
    }

    @Test
    @DisplayName("Truck is out of petrol if the distance is > 1200")
    void truckOutOfPetrol() {
        String result = truck.move(1200);
        assertEquals("Out of petrol.", result);
    }
}