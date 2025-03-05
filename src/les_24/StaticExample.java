package les_24;

public class StaticExample {

    int x;

    static int staticY;

    public static void staticMethod() {

        staticY++;
    }

    public void nonStaticMethod() {

        x++;
        staticY++;

        nonStaticMethod();
    }



    public static void main(String[] args) {

        staticY = 10;
        System.out.println(staticY);

        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();

        StaticExample.staticMethod();

    }
}
