package les_25;

public class StaticBlockDemo {

    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10;

    static {
        System.out.println("Static Block RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

    public StaticBlockDemo() {
        System.out.println("Constructor RUN");
        if (counter == 0) {
            this.capacity = 50;
        }
        //colors[0] = "red";
        //colors[1] = "green";
        //colors[2] = "yellow";

    }

    public String toString() {
        return String.format("Title: %s, capacity: %d, static-counter",
                title, capacity, counter);
    }
}
