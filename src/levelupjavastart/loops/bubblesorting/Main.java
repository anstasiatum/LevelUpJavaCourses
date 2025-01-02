package levelupjavastart.loops.bubblesorting;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray;

        try {
            unsortedArray = ArrayReader.reader();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid array size value");
            return;
        }

        int[] sortedArrayOfNumbers = ArraySorting.bubbleSorting(unsortedArray);
        ArrayPrinter.arrayPrinter(sortedArrayOfNumbers);
    }
}
