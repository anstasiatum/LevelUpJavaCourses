package levelupjavastart.checkpointexceptions;

import levelupjavastart.checkpointexceptions.exceptions.CallThePoliceException;
import levelupjavastart.checkpointexceptions.exceptions.SizeException;
import levelupjavastart.checkpointexceptions.exceptions.SpeedingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CheckpointRestrictionsTest {

    @Test
    @DisplayName("No error messages for an automobile with valid dimensions(upper bounds)")
    void validDimensionsTest() {
        Automobile automobile = new Automobile(AutomobileType.TRUCK, "100crr", 60, 8,2.5, 4, 2);
        assertDoesNotThrow(() -> CheckpointRestrictions.sizeRestrictions(automobile));
    }

    @Test
    @DisplayName("No error messages for an automobile with valid speed(upper bound)")
    void validSpeedTest() {
        Automobile automobile = new Automobile(AutomobileType.TRUCK, "100crr", 80, 7,2, 2, 1);
        assertDoesNotThrow(() -> CheckpointRestrictions.speedingRestrictions(automobile));
    }

    @Test
    @DisplayName("Error message for an automobile with 80.1 km/h speed")
    void mildSpeedingRestrictionLowerBoundTest() {
        Automobile automobile = new Automobile(AutomobileType.TRUCK, "100crr", 80.1, 8,2.5, 4, 2);
        Exception exception = assertThrows(SpeedingException.class, () -> CheckpointRestrictions.speedingRestrictions(automobile));

        String expectedMessage = "Speeding issue. The automobile is moving too fast. Speed: 80.100000 km/h";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    @DisplayName("Error message for an automobile with 100 km/h speed")
    void mildSpeedingRestrictionUpperBoundTest() {
        Automobile automobile = new Automobile(AutomobileType.TRUCK, "100crr", 100, 8,2.5, 4, 2);
        Exception exception = assertThrows(SpeedingException.class, () -> CheckpointRestrictions.speedingRestrictions(automobile));

        String expectedMessage = "Speeding issue. The automobile is moving too fast. Speed: 100.000000 km/h";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("Error message for an automobile with 100.1 km/h speed")
    void speedingRestrictionInvolvingPoliceTest() {
        Automobile automobile = new Automobile(AutomobileType.TRUCK, "100crr", 100.1, 8,2.5, 4, 2);
        Exception exception = assertThrows(CallThePoliceException.class, () -> CheckpointRestrictions.speedingRestrictions(automobile));

        String expectedMessage = "Very high speed. Call the police! Speed: 100.100000 km/h. The plate number is: 100crr";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("Error message for an automobile with unsupported weight")
    void weightRestrictionTest() {
        Automobile automobile = new Automobile(AutomobileType.TRUCK, "100crr", 70, 8.01,2.4, 2, 2);
        Exception exception = assertThrows(SizeException.class, () -> CheckpointRestrictions.sizeRestrictions(automobile));

        String expectedMessage = "The automobile cannot pass - it is too large. Plate number: 100crr, TRUCK";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    @DisplayName("Error message for an automobile with unsupported height")
    void heightRestrictionTest() {
        Automobile automobile = new Automobile(AutomobileType.CAR, "101crb", 70, 7,2.4, 4.01, 2);
        Exception exception = assertThrows(SizeException.class, () -> CheckpointRestrictions.sizeRestrictions(automobile));
        String expectedMessage = "The automobile cannot pass - it is too large. Plate number: 101crb, CAR";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    @DisplayName("Error message for an automobile with unsupported width")
    void widthRestrictionTest() {
        Automobile automobile = new Automobile(AutomobileType.CAR, "121crb", 70, 7,2.501, 3.9, 2);
        Exception exception = assertThrows(SizeException.class, () -> CheckpointRestrictions.sizeRestrictions(automobile));
        String expectedMessage = "The automobile cannot pass - it is too large. Plate number: 121crb, CAR";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    @DisplayName("Error message when all dimensions are unsupported")
    void dimensionRestrictionTest() {
        Automobile automobile = new Automobile(AutomobileType.TRUCK, "121crl", 70, 8.001,2.51, 4.001, 2);
        Exception exception = assertThrows(SizeException.class, () -> CheckpointRestrictions.sizeRestrictions(automobile));
        String expectedMessage = "The automobile cannot pass - it is too large. Plate number: 121crl, TRUCK";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}