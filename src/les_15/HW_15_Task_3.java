package les_15;

import java.util.Scanner;

public class HW_15_Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a four-digit number:");

        String input = scanner.nextLine();

        if (input.length() != 4 || ! input.matches("\\d+")) {

            System.out.println("Error: entered value is not a four-digit number.");
            return;
        }
        int digit1 = Character.digit(input.charAt(0), 10);
        int digit2 = Character.digit(input.charAt(0), 10);
        int digit3 = Character.digit(input.charAt(0), 10);
        int digit4 = Character.digit(input.charAt(0), 10);

        int sum1 = digit1 + digit2;
        int sum2 = digit3 + digit4;

        if (sum1 == sum2) {
            System.out.println("The number is a lucky ticket");
        } else {
            System.out.println("The number is NOT a lucky ticket");

        }
    }

}
