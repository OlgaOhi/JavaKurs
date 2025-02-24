package les_14;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);

        int x = 10;
        int y = 5;

        boolean b1 = x == y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        b1 = x != y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        y = 10;
        b1 = x > y;
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        //
        x = 7;
        b1 = x < y;
        System.out.printf("%s < %s -> %s\n", x, y, b1);

        //
        b1 = x <= y;
        System.out.printf("%s <= %s -> %s\n", x, y, b1);

        //

        String str = "Java is the best";
        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\"): " + contains);
        System.out.println("str.contains(\"java\"):" + str.contains("java"));

        //
        boolean startWith = str.startsWith("Ja");
        System.out.println("str.startsWith(\"Ja\"): " + startWith);
        System.out.println("str.startsWith(\"ava\"): " + str.startsWith("ava"));

        boolean endsWith = str.endsWith("best");
        System.out.println("str.endsWith(\"best\"): " + endsWith);
        System.out.println("str.endsWith(\"Java\"): " + str.endsWith("Java"));

        //логическое НЕ

        boolean b2 = !false;
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);


        // "&"
        b2 = true & true;
        System.out.println("true & true: " + b2);

        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " + b2);

        input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 150: " + b2);

        // oder ""
        b2 = true | false;
        System.out.println("true | false: " + b2);
        System.out.println("false | true: " + (false | true));
        System.out.println("true | true: " + (true | true));
        System.out.println("false | false: " + (false | false));

        // oder "^"
        b2 = true ^ false;
        System.out.println("true ^false: " + b2);
        System.out.println("false ^ true: " + (false | true));
        System.out.println("true ^ true: " + (true | true));
        System.out.println("false ^ false: " + (false | false));

        System.out.println("\n===============\n");

        









    }
}
