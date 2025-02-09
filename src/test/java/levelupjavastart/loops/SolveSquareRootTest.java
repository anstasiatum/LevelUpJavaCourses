package levelupjavastart.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static levelupjavastart.loops.SolveSquareRoot.squareRoot;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SolveSquareRootTest {

    @Test
    @DisplayName("Square root for a positive integer argument")
    void squareRootForPositiveIntegerArgument() {
        int actualResult = squareRoot(49);
        int expectedResult = 7;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Square root for a positive fractional argument")
    void squareRootForPositiveFractionalArgument() {
        int actualResult = squareRoot(35.56);
        int expectedResult = 5;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Square root for 0")
    void squareRootForZero() {
        int actualResult = squareRoot(0);
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Square root for a negative argument")
    void squareRootForPositiveNegativeArgument() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> squareRoot(-37));

        String actualMessage = exception.getMessage();
        String expectedMessage = "-37.0 does not have a square root";

        assertEquals(expectedMessage, actualMessage);
    }
}