package home_work.hw_48_Task_2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinLengthString {

    public static Optional<String> findMinLengthString(List<String> strings) {
        return strings.stream()
                .min(Comparator.comparingInt(String::length));
    }

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "kiwi", "orange", "grape");
        Optional<String> minLength = findMinLengthString(words);

        if (minLength.isPresent()) {
            System.out.println("Original list: " + words);
            System.out.println("String with minimum length: " + minLength.get());
        } else {
            System.out.println("The string list is empty.");
        }
        List<String> emptyList = List.of();
        Optional<String> minLengthEmpty = findMinLengthString(emptyList);

        if (minLengthEmpty.isPresent()) {
            System.out.println("String with minimum length in empty list: " + minLengthEmpty.get());
        } else {
            System.out.println("String list is empty, minimum string not found.");
        }
    }
}
