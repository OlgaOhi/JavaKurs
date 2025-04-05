package home_work.hw_47_Task_1;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {

    public static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .filter(number -> number > 10)
                .filter(number -> number < 100)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4, 13, 26, 32, 98, 1011, 93, 6, 52, 44, 29, 128);
        List<Integer> filteredNumbers = filterNumbers(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Filtered List: " + filteredNumbers);
    }
}
