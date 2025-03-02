package les_24;

public class Calculator {

    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is unacceptable");
        } else {
            return (double) x / y;
        }
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int add = Calculator.add(x, y);
        int subtract = Calculator.subtract(x, y);
        int multiply = Calculator.multiply(x, y);
        double divide = Calculator.divide(x, y);

        System.out.println("Add: " + add);
        System.out.println("Subtract: " + subtract);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);
    }
}
