package les_26;

public class StringBuilderExample {

    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        //
        //

        //
        StringBuilder sb = new StringBuilder(); //
        sb = new StringBuilder("Hello");

        //
        sb.append(" "); // "Hello" + " ";

        //
        String string = sb.toString();
        System.out.println(string);

        //
        sb = new StringBuilder("Hello World"); // Hello beautiful World
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());

        //Заменить подстроку
        sb = new StringBuilder("Hello World!"); // "Hello Java"
        sb.replace(6, 11,"Java");
        System.out.println(sb.toString());

        // Удалить подстроку
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        //
        sb = new StringBuilder("Hello World");
        int index = sb.indexOf("W");
        System.out.println(index);
        index = sb.lastIndexOf("Java");
        System.out.println(index);


    }
}
