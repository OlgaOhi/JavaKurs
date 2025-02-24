package les_16;

import java.util.Arrays;
import java.util.Random;

public class HW_16_Task_5 {
    public static void main(String[] args) {

        Random random = new Random();
        int arrayLength = random.nextInt(11) + 5;
        int[] myArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = random.nextInt(101) - 50;
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(myArray));

        int minValue = myArray[0];
        for (int i = 1; i < arrayLength; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];

            }
        }
        System.out.println("Минимальное значение: " + minValue);

        int maxValue = myArray[0];
        for (int i = 1; i < arrayLength; i++) {
            if (myArray[i] > maxValue) {
                minValue = myArray[i];
            }
        }
        System.out.println("Максимальное значение: " + maxValue);

        double sum = 0;
        for (int value : myArray) {
            sum += value;
        }
        double average = sum / arrayLength;
        System.out.println("Среднее арифметическое: " + average);

    }
}
