package home_work.hw_29_Task_1;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4,6),
                new Triangle(3,4,5)
        };
        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }
        System.out.println("Total area: " + totalArea);

        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
