package extra.arrayclass;

import java.util.Random;
import java.util.Scanner;

public class ArrayClassRunner {
    public static void main(String[] args) {
        int arrayLength = ArrayClass.setArrayBoundary();
        int[] array = new int[arrayLength];
        int[] array2 = new int[arrayLength];

        Random randomizer = new Random();

        for(int i = 0; i < arrayLength; i++) {
            array[i] = randomizer.nextInt(100);
        }
        for(int i = 0; i < arrayLength; i++) {
            array2[i] = randomizer.nextInt(1000);
        }
        System.out.println("The initial randomized array:");

        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("The second array:");

        for (int a : array2) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Set the scalar: ");
        Scanner scanner = new Scanner(System.in);
        int scalar = scanner.nextInt();

        System.out.println("Multiplied array:");
        int[] multipliedArray = ArrayClass.multiplyByScalar(scalar, array);
        for (int i = 0; i < multipliedArray.length; i++) {
            System.out.print(multipliedArray[i] + " ");
        }

        System.out.println();

        System.out.println("Divided array:");
        double[] dividedArray = ArrayClass.divideByScalar(scalar, array);
        for (int i = 0; i < dividedArray.length; i++) {
            System.out.print(dividedArray[i] + " ");
        }

        System.out.println();

        System.out.println("Added arrays:");
        int[] addedArrays = ArrayClass.addArrays(array, array2);
        for (int i = 0; i < addedArrays.length; i++) {
            System.out.print(addedArrays[i] + " ");
        }
        System.out.println();

        System.out.println("Subtracted arrays:");
        int[] subtractedArrays = ArrayClass.subtractArrays(array, array2);
        for (int i = 0; i < subtractedArrays.length; i++) {
            System.out.print(subtractedArrays[i] + " ");
        }
        System.out.println();

        int arrayIndex;
        try {
            arrayIndex = ArrayClass.returnArrayIndex(arrayLength);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("The array element is " + array[arrayIndex]);

    }
}
