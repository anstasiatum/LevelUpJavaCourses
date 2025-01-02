package levelupjavastart.syntaxsolved;

import java.util.Scanner;


public class QuadraticEquationSolved {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.print("Enter b: ");
        double b = in.nextDouble();

        System.out.print("Enter c: ");
        double c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No solution");
            return;
        }

        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Solution: x1 = " + x1 + "; x2 = " + x2);
    }
}
