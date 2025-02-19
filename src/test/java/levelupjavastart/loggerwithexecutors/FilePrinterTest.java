package levelupjavastart.loggerwithexecutors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static levelupjavastart.loggerwithexecutors.FilePrinter.filePrinter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoggerTest {
    @Test
    @DisplayName("Writing logs to an existent file")
    void writingLogsToAnExistentFile() {
        String filePath = "src/test/resources/LoggerWithExecutors/WriteToAnExistentFile";
        Logger logger = new Logger(LogLevels.DEBUG, "DEBUG message");
        logger.logWriter(filePath);
        List<String> fileLines = new ArrayList<>();
        String fileContents = "1";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            fileLines = bufferedReader.lines()
                    .toList();
            fileContents = String.join(", ", fileLines);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        assertTrue(fileContents.contains("DEBUG main DEBUG message"));
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filePath);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    @DisplayName("Writing logs to a non-existent file")
    void writingLogsToAnNonExistentFile() {
        String filePath = "src/test/resources/LoggerWithExecutors/NonExistentFile";
        Logger logger = new Logger(LogLevels.DEBUG, "DEBUG message");
        logger.logWriter(filePath);
        List<String> fileLines = new ArrayList<>();
        String fileContents = "1";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            fileLines = bufferedReader.lines()
                    .toList();
            fileContents = String.join(", ", fileLines);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        assertTrue(fileContents.contains("DEBUG main DEBUG message"));
        try {
            Files.deleteIfExists(Paths.get(filePath));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    @DisplayName("Reading text from an existent file")
    void readingLogsFromExistentFile() {
        List<String> actualResult = filePrinter("src/test/resources/LoggerWithExecutors/ReadFromFile");
        assertEquals(List.of("test"), actualResult);
    }

    @Test
    @DisplayName("Reading text from a non-existent file")
    void readingLogsFomNonExistentFile() {
        List<String> actualResult = filePrinter("test");
        assertEquals(List.of(), actualResult);
    }
}