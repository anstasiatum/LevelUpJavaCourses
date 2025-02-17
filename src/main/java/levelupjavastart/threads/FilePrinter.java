package levelupjavastart.threads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilePrinter {
    public static List<String> filePrinter(String filePath) {
        List<String> fileLines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            fileLines = bufferedReader.lines()
                    .toList();
        } catch (FileNotFoundException ex) {
            System.out.println("No file was found in the specified directory");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(fileLines);
        return fileLines;
    }
}
