package les_18;

public class MethodsWithReturn {
    public static void main(String[] args) {

        //int sum = 10 + 5;
        calculateSum(10, 5);
        int sum = calculateSum(10, 5);
        sum = calculateSum(10, 5) + calculateSum(20, 30); // sum = 15 + 50 -> sum = 65



    } // Method area

    public static void  test(int x) {
        //
        if (x == 3);

        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void powTwo(int x)  {
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8

        boolean isPositive = x >= 0;
        //

        int result = 1;
        // x = 2
        for (int i = 1; i <= x; i++) {
            result = result * 2;
        }
    }



    public static int calculateSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;

    }

} // end class
