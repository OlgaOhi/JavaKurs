package lists_hw_31;

import java.util.Arrays;

public class MagicalArrayList <T> {

    private T[] array;
    private int size;
    private int capacity;
    public MagicalArrayList() {
        this(10);
    }

    public MagicalArrayList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }
    public void add(T element) {
        if (size == capacity) {
            increaseCapacity();
        }
        array[size++] = element;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }
    public int size() {
        return size;
    }

    public T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(array, size, a.getClass());
        }

        System.arraycopy(array, 0, a, 0, size);

        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }
    private void increaseCapacity() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void main(String[] args) {

        MagicalArrayList<Integer> magicalArray = new MagicalArrayList<>(5);
        magicalArray.add(1);
        magicalArray.add(2);
        magicalArray.add(3);

        Integer[] array = magicalArray.toArray(new Integer[magicalArray.size()]);
        System.out.println("An array of MagicalArray: ");

        for (int element : array) {
            System.out.println(element + "");
        }
        System.out.println();
    }

}
