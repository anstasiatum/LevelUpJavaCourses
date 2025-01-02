package extra;

import java.util.Scanner;

public class SeventeenthLinearExpression {
    public static void main(String[] args) {
        System.out.print("Enter m: ");
        Scanner in = new Scanner(System.in);
        double m = in.nextDouble();

        double z1 = (Math.sqrt((3 * m + 2) * (3 * m + 2) - 24 * m)) / (3 * Math.sqrt(m) - 2 / Math.sqrt(m));
        double z2 = -Math.sqrt(m);

        System.out.println("Solution: z1 = " + z1 + "; z2 = " + z2);
    }
}
