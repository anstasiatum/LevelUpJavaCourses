package levelupjavastart.classesandmethods.calculator;

import java.util.Scanner;

public class CalculatorReader {
    public static String operationReader() {
        System.out.print("Enter the required operation: sum, subtraction, division, or multiplication. ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String numberTypeReader() {
        System.out.print("Enter the number type: integer, double, or long. ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static Converter.IntAAndB intReader() {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        return new Converter.IntAAndB(a, b);
    }

    public static Converter.DoubleAAndB doubleReader() {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.print("Enter b: ");
        double b = in.nextDouble();

        return new Converter.DoubleAAndB(a, b);
    }

    public static Converter.LongAAndB longReader() {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();

        System.out.print("Enter b: ");
        long b = in.nextLong();

        return new Converter.LongAAndB(a, b);
    }

}
