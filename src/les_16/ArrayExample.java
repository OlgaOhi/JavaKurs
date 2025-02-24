package les_16;

public class ArrayExample {
    public static void main(String[] args) {

        int x;
        x = 10;

        int[] array;
        // int array1[];// alternative, !! no recommend
        String[] strings;

        array = new int[4];
        strings = new String[10];

        int[] array2 = new int[8];
        boolean[] bools = new boolean[3];

        int value = array2[0];
        System.out.println("array2[0]: " + value);
        System.out.println("array2[7]: " + array2[7]);

        System.out.println("bools[1]: " + bools[1]);

        int[] numbers = new int[]{45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444};

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100;
        int len = numbers.length;
        System.out.println("numbers.length: " + len);

        System.out.println("Вывести все значения массиве ");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();

        int min = numbers [0];
        i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[1];
            }
            i++;
        }
        System.out.println("Minimum: " + min);



    }
}
