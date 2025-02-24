package les_15;

public class TernaryOperator {
    public static void main(String[] args) {

        // "if-else"

        int age = 20;
        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Несовершеннолетий";
        }
        System.out.println(status);

        //

        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетий";

        int x = 10;

        System.out.println("Значени в переменной х " + ((x >= 0) ? "положительное" : "отрицательно"));

    }
}
