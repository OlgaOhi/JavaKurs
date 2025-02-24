package les_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {
    public static void main(String[] args) {

        String data = "3.14 42.7";
        Scanner sc = new Scanner(data).useLocale(Locale.US);

        System.out.println(Locale.getDefault());
        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());

    }
}
