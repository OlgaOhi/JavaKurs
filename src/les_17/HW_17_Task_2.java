package les_17;

public class HW_17_Task_2 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 6, 7};
        reversePrint(arr);
        reversePrint(arr, 2);

    }

    public static void reversePrint (int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void reversePrint (int[] array, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ", ");
        }
        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i]);
            if (i > index) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
