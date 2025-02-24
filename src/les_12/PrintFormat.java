package les_12;

public class PrintFormat {
    public static void main(String[] args) {

        double result = 20.0 / 7;
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", Age: " + age + ", score: " + result);

        System.out.printf("Name: %s, Age: %d, Score: %f", name, 100, result);

        
    }
}
