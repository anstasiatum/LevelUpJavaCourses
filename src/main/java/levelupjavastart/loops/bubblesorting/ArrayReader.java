package levelupjavastart.loops.bubblesorting;

import java.util.Scanner;

public class ArrayReader {
    public static int[] reader() {

        System.out.print("Enter the array size: ");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();

        if (arraySize <= 0) {
            throw new IllegalArgumentException("Invalid array size value");
        }

        int[] arrayOfNumbers = new int[arraySize];
        System.out.print("Enter the array of numbers: ");

        for (int arrayInputCounter = 0; arrayInputCounter < arrayOfNumbers.length; arrayInputCounter++) {
            arrayOfNumbers[arrayInputCounter] = in.nextInt();
        }

        return arrayOfNumbers;
    }
}
