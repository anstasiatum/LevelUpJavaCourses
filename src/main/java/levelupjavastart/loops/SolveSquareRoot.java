package levelupjavastart.loops;

public class SolveSquareRoot {

        public static int squareRoot(double number) {

            if (number < 0) {
                throw new IllegalArgumentException(number + " does not have a square root");
            }

            if (number == 0) {
                return 0;
            }

            double xn = number / 2;
            double xnp1 = (xn + number / xn) / 2;

            while (xn - xnp1 > 0.0001 || xn - xnp1 < -0.0001) {
                xn = xnp1;
                xnp1 = (xn + number / xn) / 2;
            }

            int numberSqrt = (int)xn;
            return numberSqrt;
        }
    }
