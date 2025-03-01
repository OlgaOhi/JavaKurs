package les_21_HomeWork;

public class Parrot {

    String name;
    String color;
    int age;

    public Parrot(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void speak(String phrase) {
        System.out.println(name + " speak: " + phrase);
    }

    public void fly() {
        System.out.println(name + " fly !");
    }

    public void eat(String food) {
        System.out.println(name + " eat " + food);
    }

    public void displayInfo() {
        System.out.println("Name: " + name +  ". Color: " + color + ". Age: " + age + " years.");
    }

    public static void main(String[] args) {
        Parrot kesha = new Parrot("Kesha", "green", 3);

        kesha.displayInfo();
        kesha.speak("Hello!");
        kesha.fly();
        kesha.eat("corn");
    }

}
