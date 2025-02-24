package les_13;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        String greeting = "Hello World !";
        System.out.println(greeting);

        int length = greeting.length();
        System.out.println("length(): " + length);

        System.out.println("Hello". length());

        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        System.out.println("\n=========================\n");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        //  Конкатенация 1
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        System.out.println(1 + 3);

        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2

        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2: " + concatStr2);

        // Конкатенация 3

        String concatStr5 = String.join(" - ","Hello", "World", "Test");
        System.out.println("concatStr5: " + concatStr5);

        int a = 1;
        int b = 2;
        String str = "Sum a + b = " + a + b;
        System.out.println("str: " + str);

        str = "Sum a + b = " + (a + b);
        System.out.println("str: " + str);

        System.out.println("\n================\n");

        String digits = "0123456789";
        System.out.println("digits.length(): " + digits.length());

        char symbol = digits.charAt(4);
        System.out.println("symbol: " + symbol);

        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() - 1);

        System.out.println("first: " + first);
        System.out.println("last: " + last);

        System.out.println("\n===================\n");

        //
        String subString = digits.substring(2);
        System.out.println("subString(2): " + subString);
        System.out.println("digits: " + digits);

        String subString2 = digits.substring(2, 7);

        System.out.println("\n=================\n");

        String string = "One World One";
        String replStr = string.replace("One", "WWW");
        System.out.println("replStr: " + replStr);

        replStr = string.replaceFirst("One", "WWW");
        System.out.println("replStr: " + replStr);

        replStr = string.replaceAll("One", "WWW");
        System.out.println("replStr: " + replStr);








    }
}
