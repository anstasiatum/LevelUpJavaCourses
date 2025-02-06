package levelupjavastart.loops.bubblesorting;

public class ArraySorting {
    public static int[] bubbleSorting(int[] arrayOfNumbers) {

        int[] arrayOfNumbersToBeSorted = new int[arrayOfNumbers.length];

        for (int transferArrayCounter = 0; transferArrayCounter < arrayOfNumbers.length; transferArrayCounter++) {
            arrayOfNumbersToBeSorted[transferArrayCounter] = arrayOfNumbers[transferArrayCounter];
        }

        for (int commonArrayCounter = 0; commonArrayCounter < arrayOfNumbersToBeSorted.length; commonArrayCounter++) {
            for (int iterationArrayCounter = 0; iterationArrayCounter < arrayOfNumbersToBeSorted.length - 1; iterationArrayCounter++) {
                if (arrayOfNumbersToBeSorted[iterationArrayCounter] > arrayOfNumbersToBeSorted[iterationArrayCounter + 1]) {
                    int lesserNumber = arrayOfNumbersToBeSorted[iterationArrayCounter + 1];
                    arrayOfNumbersToBeSorted[iterationArrayCounter + 1] = arrayOfNumbersToBeSorted[iterationArrayCounter];
                    arrayOfNumbersToBeSorted[iterationArrayCounter] = lesserNumber;
                }
            }
        }
        int[] sortedArrayOfNumbers = arrayOfNumbersToBeSorted;
        return sortedArrayOfNumbers;
    }
}
