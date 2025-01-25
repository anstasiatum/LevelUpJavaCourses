package levelupjavastart.wordfrequency;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequency {
    public static void wordFrequency(String text) {
        Map<String, Long> words =
                Stream.of(text.split("[^A-Za-zА-Яа-я0-9]+"))
                        .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        words.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Long>, Long>comparing(Map.Entry::getValue).reversed())
                .forEach(System.out::println);
    }
}
