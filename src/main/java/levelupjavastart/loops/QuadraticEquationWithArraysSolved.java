package levelupjavastart.loops;

import java.util.Scanner;

public class QuadraticEquationWithArraysSolved {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.print("Enter b: ");
        double b = in.nextDouble();

        System.out.print("Enter c: ");
        double c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;

        try {
            SolveSquareRoot.squareRoot(discriminant);
        } catch (IllegalArgumentException e) {
            System.out.println("No Solution");
            return;
        }

        double discriminantSqrt = SolveSquareRoot.squareRoot(discriminant);

        double x1 = (-b + discriminantSqrt) / (2 * a);
        double x2 = (-b - discriminantSqrt) / (2 * a);

        if (discriminantSqrt <= 0.0001 && discriminantSqrt >= -0.0001) {
            System.out.println("Single solution. x = " + x1);
            return;
        }
        double[] solutions = {x1, x2};
        System.out.println("Solutions:");
        for (int i = 0; i < solutions.length; i++) {
            System.out.println(solutions[i]);
        }
    }
}
