package levelupjavastart.filereader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReverseWriter {
    public static void main(String[] args) {
        List<String> reversedFileContents = inputTextReverser("src/main/resources/textreverser/inputfile.txt");
        System.out.println(reversedFileContents);

        System.out.println("Enter the required output file path: ");
        Scanner scanner = new Scanner(System.in);
        String outputFilePath = scanner.nextLine();

        outputFileWriter(reversedFileContents, outputFilePath);
    }

    public static List<String> inputTextReverser(String fileDirectory) {
        List<String> fileLines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileDirectory))) {
            fileLines = bufferedReader.lines()
                    .flatMap(e -> Stream.of(e.split("[^A-Za-zА-Яа-я0-9]+")))
                    .toList()
                    .reversed();
        } catch (FileNotFoundException ex) {
            System.out.println("No file was found in the specified directory");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return fileLines;
    }

    public static void outputFileWriter(List<String> text, String path) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(text.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
