package levelupjavastart.loops;

public class PrimeNumbers {
    public static void main(String[] args) {
        int dividerCount = 0;

        for (int currentNumber = 0; currentNumber <= 10000; currentNumber++) {
            for (int currentDivider = 1; currentDivider <= currentNumber; currentDivider++) {
                if (currentNumber % currentDivider == 0) {
                    dividerCount++;
                }
            }
            if (dividerCount == 2) {
                System.out.println(currentNumber);
            }
            dividerCount = 0;
        }
    }
}
