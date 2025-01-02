package levelupjavastart.classesandmethods.Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String operationType = CalculatorReader.operationReader();
        String numberType = CalculatorReader.numberTypeReader();
        String errorMessageForWrongOption = "Wrong combination. Try again.";
        String errorMessageForDivisionByZero = "Cannot divide by zero";
        switch (operationType) {
            case "sum":
                switch (numberType) {
                    case "integer":
                        Converter.IntAAndB intAAndB = CalculatorReader.intReader();
                        int intSolution = calculator.sum(intAAndB.a, intAAndB.b);
                        System.out.println(intSolution);
                        break;
                    case "double":
                        Converter.DoubleAAndB doubleAAndB = CalculatorReader.doubleReader();
                        double doubleSolution = calculator.sum(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        Converter.LongAAndB longAAndB = CalculatorReader.longReader();
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
                        Converter.IntAAndB intAAndB = CalculatorReader.intReader();
                        double intSolution = calculator.subtraction(intAAndB.a, intAAndB.b);
                        System.out.println(intSolution);
                        break;
                    case "double":
                        Converter.DoubleAAndB doubleAAndB = CalculatorReader.doubleReader();
                        double doubleSolution = calculator.subtraction(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        Converter.LongAAndB longAAndB = CalculatorReader.longReader();
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
                        Converter.IntAAndB intAAndB = CalculatorReader.intReader();
                        if (intAAndB.b == 0) {
                            System.out.println(errorMessageForDivisionByZero);
                            return;
                        }
                        double solution = calculator.division(intAAndB.a, intAAndB.b);
                        System.out.println(solution);
                        break;
                    case "double":
                        Converter.DoubleAAndB doubleAAndB = CalculatorReader.doubleReader();
                        if (doubleAAndB.b == 0) {
                            System.out.println(errorMessageForDivisionByZero);
                            return;
                        }
                        double doubleSolution = calculator.division(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        Converter.LongAAndB longAAndB = CalculatorReader.longReader();
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
                        Converter.IntAAndB aAndB = CalculatorReader.intReader();
                        int solution = calculator.multiplication(aAndB.a, aAndB.b);
                        System.out.println(solution);
                        break;
                    case "double":
                        Converter.DoubleAAndB doubleAAndB = CalculatorReader.doubleReader();
                        double doubleSolution = calculator.multiplication(doubleAAndB.a, doubleAAndB.b);
                        System.out.println(doubleSolution);
                        break;
                    case "long":
                        Converter.LongAAndB longAAndB = CalculatorReader.longReader();
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
