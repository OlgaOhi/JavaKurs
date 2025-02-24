package les_18;


public class HW_18_Task_1 {

    public static int[] copyOfArray (int[] array, int newLength) {

        int[] newArray = new int[newLength];
        for (int i = 0; i < Math.min(array.length, newLength); i++) {
            newArray[i] = array[i];
        }
        System.out.print("{");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        return newArray;
    }

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6};
        copyOfArray(array1, 3);

        int[] array2 = {0, 1, 2};
        copyOfArray(array2, 5);
    }
}

