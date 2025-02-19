package levelupjavastart.numberthreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class NumbersRunner {
    public static void main(String[] args) {
        final int numberCount = 1_000_000;
        List<Integer> numbers = generateNumberList(numberCount);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture<Integer> maxValue = CompletableFuture.supplyAsync(() -> getMaxValue(numbers), executorService);
        maxValue.whenComplete((value, exception) -> {
            if (exception != null) {
                System.out.println(exception.getMessage());
            } else {
                System.out.printf("The maximum value of the list is %d%n", value);
            }
        });

        CompletableFuture<Integer> minValue = CompletableFuture.supplyAsync(() -> getMinValue(numbers), executorService);
        minValue.whenComplete((value, exception) -> {
            if (exception != null) {
                System.out.println(exception.getMessage());
            } else {
                System.out.printf("The minimum value of the list is %d%n", value);
            }
        });

        CompletableFuture<Double> averageValue = CompletableFuture.supplyAsync(() -> getAverageValue(numbers), executorService);
        averageValue.whenComplete((value, exception) -> {
            if (exception != null) {
                System.out.println(exception.getMessage());
            } else {
                System.out.printf("The average value of the list is %f%n", value);
            }
        });

        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Integer> generateNumberList(int numberCount) {
        List<Integer> numbers = new ArrayList<>(numberCount);
        Random random = new Random();
        for (int i = 0; i < numberCount; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }

    public static Integer getMaxValue(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).orElseThrow();
    }

    public static Integer getMinValue(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).orElseThrow();
    }

    public static Double getAverageValue(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average().orElseThrow();
    }
}
