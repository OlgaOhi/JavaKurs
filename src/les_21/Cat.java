package les_21;

public class Cat {
    // характеристики будущих объектов
    String name;  //поле класса
    String color;
    int age;

    /*
    Конструктор класса

    Особенности конструктора
     */

    // конструктор по умолчанию
    public Cat() {
        // все поля получают значения по умолчанию для своего типа данных

    }

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;

        // ключевое слово "this"

    }

    public Cat(String name, String color, int age) {
        //
        this(name, color); // вызов другого конструктора класса

        this.name = name;
        this.color = color;
        this.age = age;
    }


    // поведение будущих объектов
    public void sleep() {
        System.out.println("I'm sleeping !");
    }

    public void sayMeow() {
        System.out.println("Meow !");
    }

    public void run() {
        System.out.println("I'm running !");
    }

    public void whoAmI() {
        System.out.printf("I'm cat %s, age: %d, my color %s\n", name, age, color);
    }


}
