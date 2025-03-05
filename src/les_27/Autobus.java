package les_27;

public class Autobus {

    private static int counter = 1;

    private final int id;

    private BusDriver driver;
    private Autopilot autopilot;

    private final int capacity;
    private int countPassengers;

    public Autobus(int capacity, BusDriver driver) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = driver;
        this.autopilot = new Autopilot("AP-v0001");
    }

    @Override
    public String toString() {
        return "Autobus {" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", capacity=" + capacity +
                '}';
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}

