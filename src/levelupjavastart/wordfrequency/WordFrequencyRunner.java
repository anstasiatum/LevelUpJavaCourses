package levelupjavastart.wordfrequency;

import java.util.Scanner;

public class WordFrequencyRunner {
    public static void main(String[] args) {
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        WordFrequency.wordFrequency(text);
    }
}
