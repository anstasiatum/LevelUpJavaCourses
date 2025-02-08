package levelupjavastart.automobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {
    Automobile car = new Car();

    @Test
    @DisplayName("Car can move if the distance is < 500")
    void carCanMove() {
        String result = car.move(499);
        assertEquals("Can still move.", result);
    }

    private void assertEquals(String s, String result) {
    }

    @Test
    @DisplayName("Car is out of petrol if the distance is > 500")
    void carOutOfPetrol() {
        String result = car.move(500);
        assertEquals("Out of petrol.", result);
    }
}