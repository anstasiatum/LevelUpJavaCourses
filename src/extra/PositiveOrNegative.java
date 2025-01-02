package extra;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();

        if (number > 0) {
        System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("The number is 0");
        } else {
            System.out.println("The number is negative");
        }
    }
}
