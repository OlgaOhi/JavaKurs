package les_23_HomeWork;

class MagicalArray {

    private int[] array;
    private int size;

    public MagicalArray(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }
    public void add(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("The array is full !");
        }
    }
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            System.out.println("Incorrect index !");
            return -1;
        }
    }
    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 30, 5000);
        employee.info();

        MagicalArray magicalArray = new MagicalArray(5);
        magicalArray.add(1);
        magicalArray.add(2);
        magicalArray.add(3);

        int[] array = magicalArray.toArray();
        System.out.println("An array of MagicalArray: ");

        for (int element : array) {
            System.out.println(element + "");
        }
        System.out.println();
    }

}
