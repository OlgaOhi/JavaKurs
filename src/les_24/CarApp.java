package les_24;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("After ... 1 car: " + Car.totalCars);

        Car bmw = new Car("BMW", 200);
        System.out.println("static totalCars. " + Car.totalCars);

        System.out.println(bmw.toString());

        Car vw = new Car("VW", 300);

        System.out.println(vw.toString());
        System.out.println("After ... 2-x: " + bmw.toString());

        System.out.println("Static variable: " + Car.totalCars);
    }
}
