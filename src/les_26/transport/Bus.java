package les_26.transport;

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    //

    public Bus(String model, int year, int capacity) {

        //
        super(model, year);
        //
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassengers() {
        if (countPassengers < capacity) {
            countPassengers++;

            System.out.println("Passenger entered the bus: " + model);

            return true;
        }
        System.out.printf("In bus %s, %d", model, countPassengers);
        return false;
    }
}

