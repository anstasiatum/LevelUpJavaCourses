package levelupjavastart.loops;

import java.util.Scanner;

public class HelloWorldLoop {
    public static void main(String[] args) {
        System.out.print("Enter the number of the repetitions: ");

        Scanner in = new Scanner(System.in);
        int repetition = in.nextInt();

        // For

        System.out.println("\"For\" loop");
        for (int forCounter = 0; forCounter < repetition; forCounter++) {
            System.out.println("Hello, World");
        }

        // While

        System.out.println("\"While\" loop");
        int whileCounter = 0;
        while (whileCounter < repetition) {
            System.out.println("Hello, World");
            whileCounter++;
        }

        // Do-While

        System.out.println("\"Do-While\" loop");
        if (repetition > 0) {
            int doWhileCounter = 0;
            do {
                System.out.println("Hello, World");
                doWhileCounter++;
            } while (doWhileCounter < repetition);
        }
    }
}
