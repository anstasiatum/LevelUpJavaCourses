package levelupjavastart.syntaxsolved;

import java.util.Scanner;

public class RoundANumberSolved {
    public static void main(String[] args) {
        System.out.print("Enter the number to be rounded: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();

        // Checking if the entered number is an integer

        int firstDigitAfterDot = (int) (number * 10) % 10;
        double digitsAfterDot = number - (int) number;
        if (digitsAfterDot == 0) {
            System.out.print("The number is already an integer");
            return;
        }

        System.out.println("""
                Choose the required option and enter its number: 
                1. Round up; 
                2. Round down; 
                3. Math round.
                """);

        int option = in.nextInt();

        // Checking if the entered number is positive or negative

        if (number > 0) {

            // Processing the chosen option for a positive number

            switch (option) {
                case 1:
                    int positiveNumberRoundedUp = (int) number;
                    positiveNumberRoundedUp++;
                    System.out.println(positiveNumberRoundedUp);
                    break;
                case 2:
                    int positiveNumberRoundedDown = (int) number;
                    System.out.println(positiveNumberRoundedDown);
                    break;

                case 3:
                    int positiveNumberMathRound = (int) number;

                    if (firstDigitAfterDot >= 5) {
                        positiveNumberMathRound++;
                    }
                    System.out.println(positiveNumberMathRound);
                    break;
                default:
                    System.out.println("Wrong option. Try again.");
                    break;
            }
        } else {
            // Processing the chosen option for a negative number
            switch (option) {
                case 1:
                    int negativeNumberRoundedUp = (int) number;
                    System.out.println(negativeNumberRoundedUp);
                    break;

                case 2:
                    int negativeNumberRoundedDown = (int) number;
                    negativeNumberRoundedDown--;
                    System.out.println(negativeNumberRoundedDown);
                    break;

                case 3:
                    int negativeNumberMathRound = (int) number;

                    if (firstDigitAfterDot * -1 > 4) {
                        negativeNumberMathRound--;
                    }
                    System.out.println(negativeNumberMathRound);
                    break;
                default:
                    System.out.println("Wrong option. Try again.");
                    break;
            }
        }
    }
}



