package home_work.hw_48_Task_1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedByLastDigit {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 12, 25, 9, 88, 105, 90, 16, 57, 111, 3);

        List<Integer> sortedByLastDigit = numbers.stream()
                .filter(number -> number > 10)
                .sorted(Comparator.comparingInt(number -> number % 10))
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Filtered and sorted list by last digit: " + sortedByLastDigit);
    }
}
