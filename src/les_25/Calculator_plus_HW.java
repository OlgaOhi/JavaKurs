package les_25;

public class Calculator_plus_HW {

    public static final double PI = 3.14519;

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
    public static double circlePerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static int add(int i1, int i2) {
        return i1 + i2;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }

}
