package home_work.hw_48_Task_3;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessEvenNumbers {

    public static List<Integer> processList(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> processedNumbers = processList(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Processed list (even numbers multiplied by 2): " + processedNumbers);
    }
}
