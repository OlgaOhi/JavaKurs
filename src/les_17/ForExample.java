package les_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        // for (блок инициализаци; блок проверок условие входа; блок изменений )

        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("After the cycle FOR");

        //

        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }
        //
        Random random = new Random();

        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        // [0...len - 2] -> ", "; len - 1 -> "]\n]
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }
        // System.out.println("]");

        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) min = ints[i];
        }
        System.out.println("Min: " + min);

        System.out.println("\n================\n");

        // continue, break

        for (int i = 0; i < 7; i++) {
            if (i == 3) continue;

            System.out.print(i + ", ");
        }
        System.out.println();


        }
    }

