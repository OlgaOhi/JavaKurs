package les_14;

import java.util.Random;
import java.util.Scanner;

public class HW_14 {
    public static void main(String[] args) {

        // Task 1
        String text = "Programming is fun";
        boolean containsFun = text.contains("fun");

        System.out.println(containsFun);


        // Task 2
        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(101);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean areEqual = a == b;
        System.out.println("a is equal to b: " + areEqual);

        boolean areNotEqual = a != b;
        System.out.println("a is not equal to b: " + areNotEqual);

        boolean moreThan = a > b;
        System.out.println("a more than b: " + moreThan);

        boolean lessThan = a < b;
        System.out.println("a less than b: " + lessThan);


        // Task 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isEvenAndDivisibleBy3 = isEven && isDivisibleBy3;

        System.out.println("Number: " + number + ". Even: " + isEven + ". Multiple of 3: " + isDivisibleBy3 + ". Even and multiple of 3: " + isEvenAndDivisibleBy3);


        // Task 4
        




    }
}
