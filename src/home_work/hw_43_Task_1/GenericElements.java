package home_work.hw_43_Task_1;

import java.util.ArrayList;
import java.util.List;

public class GenericElements {

    public static <T> List<T> findGenericElements(List<T> list1, List<T> list2) {
        List<T> genericElements = new ArrayList<>();

        for (T element : list1) {
            if (list2.contains(element)) {

                genericElements.add(element);
            }
        }
        return genericElements;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> genericElements = findGenericElements(list1, list2);

        System.out.println("Generic elements: " + genericElements);

    }

}
