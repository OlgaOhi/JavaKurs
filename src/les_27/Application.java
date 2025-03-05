package les_27;

public class Application {

    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-456");

        Autobus bus = new Autobus(15, busDriver);

        System.out.println(bus.toString());


    }
}
