package HW_27;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }
    public String toString() {
        return "Computer: " + "\nProcessor: " + processor + "\nMemory: " + memory + "\nStorage: " + storage;
    }

    public static void main(String[] args) {

        Processor processor = new Processor("Intel", "i7");
        Memory memory = new Memory("Corsair", "16GB");
        Storage storage = new Storage("Samsung", "SSD 500GB");

        Computer computer = new Computer(processor, memory, storage);

        System.out.println(computer);
    }
}
