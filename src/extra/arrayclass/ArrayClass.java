package extra.arrayclass;

import java.util.Scanner;

public class ArrayClass {
    public static int setArrayBoundary() {
        System.out.print("Set the array length: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int returnArrayIndex(int arrayBoundary) {
        System.out.println("Set the element index: ");
        Scanner scanner = new Scanner(System.in);
        int arrayIndex = scanner.nextInt();

        if (arrayIndex >= arrayBoundary) {
            throw new ArrayIndexOutOfBoundsException("The specified array index is out of the array boundaries.");
        } else {
            return arrayIndex;
        }
    }

    public static int[] multiplyByScalar(int scalar, int[] array) {
        int[] multipliedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            multipliedArray[i] = array[i];
        }

        for (int i = 0; i < multipliedArray.length; i++) {
            multipliedArray[i] = multipliedArray[i] * scalar;
        }
        return multipliedArray;
    }

    public static double[] divideByScalar(int scalar, int[] array) {
        double[] dividedArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            dividedArray[i] = array[i];
        }

        for (int i = 0; i < dividedArray.length; i++) {
            dividedArray[i] = dividedArray[i] / scalar;
        }
        return dividedArray;
    }
    public static int[] addArrays(int[] array1, int[] array2) {
        int[] addedArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            addedArray[i] = array1[i] + array2[i];
        }
        return addedArray;
    }
    public static int[] subtractArrays(int[] array1, int[] array2) {
        int[] subtractedArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            subtractedArray[i] = array1[i] - array2[i];
        }
        return subtractedArray;
    }
}

