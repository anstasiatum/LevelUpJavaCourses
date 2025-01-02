package levelupjavastart.classesandmethods;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String operationType = calculator.operationReader();
        String numberType = calculator.numberTypeReader();
        String errorMessageForWrongOption = "Wrong combination. Try again.";
        String errorMessageForDivisionByZero = "Cannot divide by zero";
        switch (operationType) {
            case "sum":
                switch (numberType) {
                    case "integer":
                        IntAAndB intAAndB = calculator.intReader();
                        int intSolution = calculator.sum(intAAndB.a, intAAndB.b);
                        System.out.println(intSolution);
                        break;
                    case "double":
                        DoubleAAndB doubleAAndB = calculator.doubleReader();
                        double doubleSolution = calculator.sum(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        LongAAndB longAAndB = calculator.longReader();
                        long longSolution = calculator.sum(longAAndB.a, longAAndB.b);
                        System.out.println(longSolution);
                        break;
                    default:
                        System.out.println(errorMessageForWrongOption);
                        break;
                }
                break;
            case "subtraction":
                switch (numberType) {
                    case "integer":
                        IntAAndB intAAndB = calculator.intReader();
                        double intSolution = calculator.subtraction(intAAndB.a, intAAndB.b);
                        System.out.println(intSolution);
                        break;
                    case "double":
                        DoubleAAndB doubleAAndB = calculator.doubleReader();
                        double doubleSolution = calculator.subtraction(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        LongAAndB longAAndB = calculator.longReader();
                        long longSolution = calculator.subtraction(longAAndB.a, longAAndB.b);
                        System.out.println(longSolution);
                        break;
                    default:
                        System.out.println(errorMessageForWrongOption);
                        break;
                }
                break;
            case "division":
                switch (numberType) {
                    case "integer":
                        IntAAndB intAAndB = calculator.intReader();
                        if (intAAndB.b == 0) {
                            System.out.println(errorMessageForDivisionByZero);
                            return;
                        }
                        double solution = calculator.division(intAAndB.a, intAAndB.b);
                        System.out.println(solution);
                        break;
                    case "double":
                        DoubleAAndB doubleAAndB = calculator.doubleReader();
                        if (doubleAAndB.b == 0) {
                            System.out.println(errorMessageForDivisionByZero);
                            return;
                        }
                        double doubleSolution = calculator.division(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        LongAAndB longAAndB = calculator.longReader();
                        if (longAAndB.b == 0) {
                            System.out.println(errorMessageForDivisionByZero);
                            return;
                        }
                        double longSolution = calculator.division(longAAndB.a, longAAndB.b);
                        System.out.println(longSolution);
                        break;
                    default:
                        System.out.println(errorMessageForWrongOption);
                        break;
                }
                break;
            case "multiplication":
                switch (numberType) {
                    case "integer":
                        IntAAndB aAndB = calculator.intReader();
                        int solution = calculator.multiplication(aAndB.a, aAndB.b);
                        System.out.println(solution);
                        break;
                    case "double":
                        DoubleAAndB doubleAAndB = calculator.doubleReader();
                        double doubleSolution = calculator.multiplication(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        LongAAndB longAAndB = calculator.longReader();
                        long longSolution = calculator.multiplication(longAAndB.a, longAAndB.b);
                        System.out.println(longSolution);
                        break;
                    default:
                        System.out.println(errorMessageForWrongOption);
                        break;
                }
                break;
            default:
                System.out.println(errorMessageForWrongOption);
                break;
        }

    }

    public String operationReader() {
        System.out.print("Enter the required operation: sum, subtraction, division, or multiplication. ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String numberTypeReader() {
        System.out.print("Enter the number type: integer, double, or long. ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public class IntAAndB {
        int a;
        int b;

        IntAAndB(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public class DoubleAAndB {
        double a;
        double b;

        DoubleAAndB(double a, double b) {
            this.a = a;
            this.b = b;
        }
    }

    public class LongAAndB {
        long a;
        long b;

        LongAAndB(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    public IntAAndB intReader() {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        return new IntAAndB(a, b);
    }

    public DoubleAAndB doubleReader() {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.print("Enter b: ");
        double b = in.nextDouble();

        return new DoubleAAndB(a, b);
    }

    public LongAAndB longReader() {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();

        System.out.print("Enter b: ");
        long b = in.nextLong();

        return new LongAAndB(a, b);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public long subtraction(long a, long b) {
        return a - b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double division(long a, long b) {
        return (double) a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public long multiplication(long a, long b) {
        return a * b;
    }

}
