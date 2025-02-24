package les_12_homework;

public class HW_12 {
    public static void main(String[] args) {

        // Task 1

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        int sum_average = (a + b + c + d) / 4;

        System.out.println("Arithmetic mean: " + sum_average);

        // Task 2

        int[] temperatures = {2, 3, 1, 4, 5, 3, 2};
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }

        double averageTemperature = (double) sum / temperatures.length;
        System.out.println("Average temperature: " + averageTemperature);


        // Task 3

        int age = 43;
        double milkPrice = 1.49;
        String name = "Olga";

        System.out.printf("Hello ! My name is %s, I'm %d years old. I buy milk %.2f per liter. \n", name, age, milkPrice);


        // Task 4

        int myInt = 10;
        double myDouble = myInt;

        System.out.println("myDouble: " + myDouble);


        // Task 5

        double myDouble1 = 5.99;
        int myInt1 = (int) myDouble1;

        System.out.println("myInt1: " + myInt1);












    }
}



