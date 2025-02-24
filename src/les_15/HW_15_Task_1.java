package les_15;

import java.util.Random;

public class HW_15_Task_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        System.out.println("Number 4: " + num4);

        int maxNumber = num1;
        if (num2 > maxNumber) {
            maxNumber = num2;
        }
        if (num3 > maxNumber) {
            maxNumber = num3;
        }
        if (num4 > maxNumber) {
            maxNumber = num4;
        }
        System.out.println("Maximal number: " + maxNumber);

    }

}
