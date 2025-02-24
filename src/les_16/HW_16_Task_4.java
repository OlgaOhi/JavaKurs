package les_16;

import java.util.Scanner;

public class HW_16_Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number1 = scanner.nextInt();
        int sum = 0;
        while (number1 > 0) {
            int digit = number1 % 10;
            sum += digit;
            number1 /= 10;
        }
        System.out.println("Sum of the digits of a number: " + sum);
    }
}
