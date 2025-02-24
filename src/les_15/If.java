package les_15;

import java.util.Random;

public class If {
    public static void main(String[] args) {

        // "if"

        int age = 20;

        if (age > 18) System.out.println("You are an adult");

        System.out.println("Continuation");

        if (age > 11) {
            System.out.println("IF");
            System.out.println("You are not a child anymore");
        } else {
            System.out.println("ELSE");
            System.out.println("Now age = " + age);
        }

        Random rand = new Random();

        int score = rand.nextInt(101);

        if (score >= 90) {
            System.out.println("Super!" + score);
        } else if (score >= 75) {
            System.out.println("Gut!" + score);
        } else if (score >= 50) {
            System.out.println("Normal" + score);
        } else {
            System.out.println("Bad!" + score);
        }

    }
}
