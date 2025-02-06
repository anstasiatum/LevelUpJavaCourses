package levelupjavastart.loops.bubblesorting;

public class ArrayPrinter {
    public static void arrayPrinter(int[] sortedArrayOfNumbers) {

        System.out.println("The array is sorted as follows: ");
        for (int sortedArrayCounter = 0; sortedArrayCounter < sortedArrayOfNumbers.length; sortedArrayCounter++) {
            System.out.print(sortedArrayOfNumbers[sortedArrayCounter] + ", ");
        }
    }
}
