package home_work.hw_45_Task_1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {

    public static Map<String, Integer> FrequencyDictionary(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {

        String text = "Это текст, в котором слова повторяются, а другие нет.";

        Map<String, Integer> frequencyMap = FrequencyDictionary(text);

        System.out.println(frequencyMap);
    }
}
