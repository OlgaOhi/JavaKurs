package les_13;

import java.util.Scanner;

public class HW_13 {
    public static void main(String[] args) {

        // Task 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int nameLength = name.length();
        System.out.println("Number of characters in the name: " + nameLength);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(nameLength - 1);

        int firstCharCode = (int) firstChar;
        int lastCharCode = (int) lastChar;

        System.out.println("Decimal code of the first character: " + firstCharCode);
        System.out.println("Decimal code of the last character: " + lastCharCode);


        // Task 2

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String result = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;

        System.out.println(result);
        System.out.println("Line length: " + result.length());


        // Task 2.2

        String newResult = result.replace("powerful", "super");

        System.out.println(newResult);
        System.out.println("Line length: " + newResult.length());

        boolean containsAge = newResult.contains("age");
        System.out.println("String contains substring 'age': " + containsAge);


        // Task 4

        char ch1 = 'o';
        char ch2 = 'l';
        char ch3 = 'g';
        char ch4 = 'a';

        ch1 -= 32;
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;

        System.out.println(" " + ch1 + ch2 + ch3 + ch4);








    }
}
