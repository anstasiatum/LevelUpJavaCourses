package levelupjavastart.filereader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static levelupjavastart.filereader.FileReverseWriter.inputTextReverser;

class FileReverseWriterTest {

    @Test
    @DisplayName("Reversed text with existent input text")
    void inputTextReverserWithTextTest() {
        final String filePath = "src/test/resources/filereaderinputdatatest";
        List<String> actualResult = inputTextReverser(filePath);
        List<String> expectedResult = Arrays.asList("cold", "mountains", "misty", "the", "over", "Far");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Reversed text with empty input file")
    void inputTextReverserWithEmptyFileTest() {
        final String filePath = "src/test/resources/filereaderemptyfile";
        List<String> actualResult = inputTextReverser(filePath);
        List<String> expectedResult = new ArrayList<>();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Output text written into a previously non-existent target file")
    void writingIntoNonExistentFileTest() {
        List<String> inputText = List.of("cold, mountains, misty, the, over, Far");
        final String filePath = "src/test/resources/filereadernewoutputfile";
        FileReverseWriter.outputFileWriter(inputText, filePath);
        String actualResult = fileReader(filePath);

        try {
            Files.deleteIfExists(Paths.get(filePath));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Assertions.assertEquals(inputText.toString(), actualResult);
    }

    @Test
    @DisplayName("Output text written into an existent target file")
    void writingIntoExistentFileTest() {
        List<String> inputText = List.of("cold, mountains, misty, the, over, Far");
        final String filePath = "src/test/resources/filereaderexistenttargetfile";
        FileReverseWriter.outputFileWriter(inputText, filePath);
        String actualResult = fileReader(filePath);
        Assertions.assertEquals(inputText.toString(), actualResult);
    }

    private String fileReader(String filePath) {
        List<String> fileContentLines = new ArrayList<>();
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContentLines.add(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return String.join(" ", fileContentLines);
    }
}