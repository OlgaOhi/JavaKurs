package les_17;

import java.util.Scanner;

public class HW_17_Task_1 {
    public static int countCharacters (String str) {
        return str.length();
    }

    public static void main(String[] args) {
        String inputString = "hello";
        int length = countCharacters(inputString);
        System.out.println("Number of characters in a line \"" + inputString + "\" equal: "+ length);
    }
}
