package home_work.hw_44_Task_1;

import java.util.*;

public class StringUtil {

    public static List<String> getUniqueSortedWords(String text) {
        String[] words = text.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word.replaceAll("[^a-zA-Za-яА-ЯёЁ]", ""));

        }
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords, Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));

        return sortedWords;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";

        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
}
