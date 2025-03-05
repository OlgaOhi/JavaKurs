package les_25;

public class FinalDemo {

    private final int capacity;

    private final int[] ints = new int[5];

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        //this.capacity++;

        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;

    }

    public final void finalArguments (int x, int[] array) {
        x++;
    }

}
