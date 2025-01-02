package levelupjavastart.loops;

import java.util.Scanner;

public class SquareRootLoop {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();

        if (number < 0) {
            System.out.println(number + " does not have a square root");
            return;
        }
        double xn = number / 2;
        double xnp1 = (xn + number / xn) / 2;

        while (xn - xnp1 > 0.0001 || xn - xnp1 < -0.0001) {
            xn = xnp1;
            xnp1 = (xn + number / xn) / 2;
        }

        int numberSqrt = (int)xn;
        System.out.println(numberSqrt);
    }
}
