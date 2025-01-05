package extra.shape;

import java.util.Scanner;

public class VolumePrinter {
    public static void main(String[] args) {

        // Ball Volume

        System.out.print("Enter the ball radius: ");
        Scanner scanner = new Scanner(System.in);
        double ballRadius = scanner.nextDouble();
        Ball ball = new Ball(ballRadius);
        double ballVolume = ball.getVolume();

        System.out.println("The ball volume is: " + ballVolume);

        // Cylinder Volume

        System.out.print("Enter the cylinder radius: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the cylinder height: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        double cylinderVolume = cylinder.getVolume();

        System.out.println("The ball volume is: " + cylinderVolume);

        // Pyramid Volume

        System.out.print("Enter the pyramid base square: ");
        double pyramidS = scanner.nextDouble();
        System.out.print("Enter the cylinder height: ");
        double pyramidH = scanner.nextDouble();
        Pyramid pyramid = new Pyramid(pyramidS, pyramidH);
        double pyramidVolume = pyramid.getVolume();

        System.out.println("The pyramid volume is: " + pyramidVolume);

    }
}
