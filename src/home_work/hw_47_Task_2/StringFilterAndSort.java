package home_work.hw_47_Task_2;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilterAndSort {

    public static List<String> filterAndSortString(List<String> strings, String startLetter) {
        return strings.stream()
                .filter(s -> s.startsWith(startLetter))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> words = List.of("Dog", "Book", "Apple", "Elephant", "Cat", "Ant", "Adventure", "Flower", "Artist");

        String start = "A";

        List<String> filteredAndSorted = filterAndSortString(words, start);

        System.out.println("Original list: " + words);
        System.out.println("Filtered and sorted list (start with '" + start + "'): " + filteredAndSorted);

    }
}
