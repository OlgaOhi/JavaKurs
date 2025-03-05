package les_23;

public class Cat {

    String name;
    public int age;
    public int weight;
    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 30) {
            //
        } else {
            this.age = age;
        }
    }
    public void setWeight(int weight) {
        if (weight < 0) {
            this.weight = 0;
        }
        if ((weight > 50)) {
        } else {
            // code 2
        }
    }

    void sayMeow() {
        System.out.println("Meow! " + name);
    }

    public void testMethod() {
        System.out.println("Test!");
    }

    public String toString() {
        //System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
        String result = String.format("Cat %s, age: %d, weight %d", name, age, weight);
                return result;
    }
}
