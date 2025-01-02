package levelupjavastart.syntaxsolved;

import java.util.Scanner;

public class MathOperationsSolved {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        // Checking if the entered value in a number
        try {
            Double.parseDouble(a);
        } catch (NumberFormatException e) {
            System.out.println("Error: Not a number. " + e.getMessage());
            return;
        }
        double firstNumber = Double.parseDouble(a);

        System.out.print("Enter the second number: ");
        String b = in.nextLine();

        // Checking if the entered value in a number
        try {
            Double.parseDouble(b);
        } catch (NumberFormatException e) {
            System.out.println("Error: Not a number " + e.getMessage());
            return;
        }
        double secondNumber = Double.parseDouble(b);

        double sum = firstNumber + secondNumber;
        double residual = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("Sum result: " + sum);
        System.out.println("Residual result: " + residual);
        System.out.println("Multiplication result: " + multiplication);

        if (secondNumber == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            System.out.println("Division result: " + division);
        }
    }
}
