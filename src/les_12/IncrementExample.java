package les_12;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;


        x += 5; // x = x + 5;
        System.out.println("x: " + x);
        x -= 2; // x = x - 2
        x *= 2; // x = x * 2
        x /= 5; // x = x / 5
        System.out.println("x: " + x);

        // Инкремент, декремент
        x++; // x = x + 1; x += 1 // Инкремент - увеличить текущее значение в переменно х на 1

        System.out.println("x: " + x);

        x--; // x + x - 1; // x -= 1 // Декремент - уменьшить  текущее значение в переменно х на 1

        System.out.println("x: " + x);

        int var = 100;
        System.out.println("var: " + var++);
        System.out.println("var: " + var);

        int y = 100;
        System.out.println("y: " + ++y);
        System.out.println("y: " + y);



    }
}
