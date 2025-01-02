package levelupjavastart.syntaxsolved;

import java.util.Scanner;

public class MathFormulaSolved {
    public static void main(String[] args) {
        System.out.print("Enter R: ");

        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();

        System.out.print("Enter H: ");
        double h = in.nextDouble();

        double s = Math.PI * r * Math.sqrt(2 * r * h - h * h);

        System.out.println("The lateral surface area of the spherical sector is " + s);
    }
}
