package les_23;

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);

        cat.sayMeow();

        System.out.println(cat.toString());

        System.out.println(cat.age);

        cat.age = -1000;

        cat.weight = 1500;

        cat.name = null;

        System.out.println(cat.toString());

        Cat cat2 = new Cat(null, 150, -20);

        int catAge = cat.getAge();
        System.out.println("Next year the cat will be: " + (catAge + 1));
        System.out.println("Weight: " + cat.getWeight());
        System.out.println("Name: " + cat.getName());

        cat.setAge(15);
        cat.setAge(-10);
        cat.setWeight(15);
        cat.setWeight(100);
        cat.setWeight(-5);
        System.out.println(cat.toString());


    }
}
