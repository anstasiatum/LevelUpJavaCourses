package levelupjavastart.syntaxsolved;

import java.util.Scanner;

public class LinearEquationSolved {
    public static void main(String[] args) {
        boolean aIsANumber = true;
        boolean bIsANumber =  true;

        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        String stringA = in.nextLine();

        // Checking if a is a number

        try {
            Double.parseDouble(stringA);
        } catch (NumberFormatException e) {
            aIsANumber = false;
        }

        System.out.print("Enter b: ");
        String stringB = in.nextLine();

        // Checking if b is a number
        try {
            Double.parseDouble(stringB);
        } catch (NumberFormatException e) {
            bIsANumber = false;
        }

        if (!aIsANumber || !bIsANumber) {
            System.out.println("Error: Not a number");
            return;
        }
        double doubleA = Double.parseDouble(stringA);
        double doubleB = Double.parseDouble(stringB);

        if (doubleA == 0) {
            System.out.print("Cannot divide by 0");
        } else {

            double x = doubleB / -doubleA;
            System.out.print("x = " + x);
        }
    }
}
