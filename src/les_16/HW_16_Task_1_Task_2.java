package les_16;

public class HW_16_Task_1_Task_2 {
    public static void main(String[] args) {

        // Task 1

        long product = 1;
        int i = 1;
        while (i <= 15) {
            product *= i;
            i++;
        }
        System.out.println("Product of numbers from 1 to 15: " + product);


        // Task 2

        int num = 1;
        while (num <= 10) {
            System.out.println("Task " + num);
            num++;
        }
    }
}
