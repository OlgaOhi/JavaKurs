package les_16;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        // "while"
    int sum = 0;
    int i = 1;

    while (i <= 100) {
        sum += i;
        i++;
    }
        System.out.println("Sum of numbers 1 to 100: " + sum);

    i = 1;

    while (i <= 21) {
        if (i % 2 == 0) {
            System.out.print(i + ", ");
        }
        i++;
    }
    System.out.println();

    System.out.println("\n=======================\n");

    String str = "Hello !";

    i = 0;
    while (i < str.length()) {
        char ch = str.charAt(i);
        System.out.println(ch);
        i++;
        }

        System.out.println("\n==============\n");

    i = 0;
    while (i < str.length()) {
        System.out.println(str.charAt(i++));
    }
        System.out.println("\n=======================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter plus number: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        while (input <= 0 ) {
            System.out.println("Enter plus number: ");
            input = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Thanks, you enter: " + input);

        int num;

        do {
            System.out.println("Enter a number greater than 0: ");
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num <= 0);

        System.out.println("Thanks, you enter: " + num);

    }
}






