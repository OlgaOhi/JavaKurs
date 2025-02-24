package les_16;

import java.util.Scanner;

public class HW_16_Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        int attempts = 0;

        while (true) {
            System.out.print("Enter word 'hello': ");
            userInput = scanner.nextLine();
            attempts++;

            if (userInput.equals("hello")) {
                System.out.println("Thank, you entered the correct word.");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else {
                System.out.println("Wrong word, try again.");
            }
        }
    }
}
