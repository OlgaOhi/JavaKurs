package home_work.hw_30_Task_1;

public class Triathlete implements Swimmer, Runner {

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " swims");
    }

    @Override
    public void swim() {
        System.out.println(name + " runs");
    }

    public static void main(String[] args) {

        Triathlete athlete1 = new Triathlete("Oleksandr");
        Triathlete athlete2 = new Triathlete("Daniil");

        athlete1.run();
        athlete2.swim();
    }
}
