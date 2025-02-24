package les_13;

public class CharExample {
    public static void main(String[] args) {

        char a = 'A'; // переменна будет хранить букву А латинского алфавита
        char a1 = 65;
        char a2 = 0x41;
        // a2 = 0x0041;
        char a3 = '\u0041';
        char x = '\u15EE';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        char letter = 'A';
        letter++;
        System.out.println("letter: " + letter);

        char digit = 48;
        System.out.println("digit: " + digit);

        digit += 5;
        System.out.println("digit: " + digit);





    }
}
