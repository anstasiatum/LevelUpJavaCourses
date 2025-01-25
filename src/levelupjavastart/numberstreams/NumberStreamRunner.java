package levelupjavastart.numberstreams;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStreamRunner {
    public static void main(String[] args) {
        List<Integer> numberList = Stream
                .generate(new Random()::nextInt)
                .limit(1000)
                .toList();
        System.out.println(numberList);

        int maxValue = numberList.stream().max(Integer::compare).orElseThrow();
        System.out.printf("The maximum value is: %d%n", maxValue);

        int minValue = numberList.stream().min(Integer::compare).orElseThrow();
        System.out.printf("The minimum value is: %d%n", minValue);

        double averageValue = numberList.stream()
                .mapToInt(Integer::intValue)
                .average().orElseThrow();
        System.out.printf("The average value is: %f%n", averageValue);

        long sumOfOddNumbers = numberList.stream()
                .mapToLong(Integer::longValue)
                .filter(i -> i % 2 != 0)
                .reduce(Long::sum).orElseThrow();
        System.out.printf("The sum of the odd elements is: %d%n", sumOfOddNumbers);

        Map<Integer, Integer> digitSumMap = numberList.stream()
                .collect(Collectors.toMap(Function.identity(), NumberStreamRunner::countSumOfNumberDigits));
        System.out.println(digitSumMap);
    }

    public static int countSumOfNumberDigits(Integer number) {
        return number.toString().chars()
                .filter(Character::isDigit)
                .map(k -> k - '0')
                .sum();
    }
}
