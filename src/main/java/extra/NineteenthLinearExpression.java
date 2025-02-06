package extra;

import java.util.Scanner;

public class NineteenthLinearExpression {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        double z1 = Math.pow(((1 + a + Math.pow(a, 2)) / (2 * a + Math.pow(a, 2)) + 2 - (1 - a + Math.pow(a, 2)) / (2 * a - Math.pow(a, 2))), -1) * ( 5 - 2 * Math.pow(a, 2));
        double z2 = (4 - Math.pow(a , 2)) / 2;

        System.out.println("Solution: z1 = " + z1 + "; z2 = " + z2);
    }
}
