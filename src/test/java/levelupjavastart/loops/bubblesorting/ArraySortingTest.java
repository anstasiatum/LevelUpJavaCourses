package levelupjavastart.loops.bubblesorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static levelupjavastart.loops.bubblesorting.ArraySorting.bubbleSorting;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraySortingTest {

    @Test
    @DisplayName("Bubble sorting with unique array elements")
    void bubbleSortingWithUniqueArrayElements() {
        int[] array = new int[]{1, -5, 0, -300, 80};

        int[] actualResult = bubbleSorting(array);
        int[] expectedResult = new int[] {-300, -5, 0, 1, 80};

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Bubble sorting with repeated array elements")
    void bubbleSortingWithRepeatedArrayElements(){
        int[] array = new int[]{5, -9, 90, -301, 5};

        int[] actualResult = bubbleSorting(array);
        int[] expectedResult = new int[]{-301, -9, 5, 5, 90};

        assertArrayEquals(expectedResult, actualResult);
    }

}