package les_21;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void info() {
        System.out.println("I'm dog " + name + ", my weight: " + weight);
    }

    void eat() {
        System.out.println("I'm eating, yum-yum!");
        this.weight++;
    }

    void run() {
        /*

         */

        if (weight < 3) {
            System.out.println("Sorry, I'm too thin and hungry, I need to eat");
            System.out.println("My weight now. " + weight);

            eat();
        }

        System.out.println("I'm running!");
        weight -= 2;
        System.out.println("Weight after jogging: " + weight);

    }
}
