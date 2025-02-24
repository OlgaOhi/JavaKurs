package les_12;

public class TypeCasting {
    public static void main(String[] args) {

        byte byteVal = 123;
        int intVal;
        intVal = byteVal;
        System.out.println("intVal: " + intVal);

        double doubleVal = intVal;
        System.out.println("doubleVal: " + doubleVal);

        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2; //

        System.out.println("doubleVal2: " + doubleVal2);
        System.out.println("int1: " + int1);

        short shortVal = (short) int1; //
        System.out.println("shortVal " + shortVal);

        double bigDouble = 3_000_000_000_000_000_000.00; //

        //

        int x = 20;
        int y = 7;

        double result;
        result = x / y;
        System.out.println("result: " + result);

        result = x / 7.0;
        System.out.println("result: " + result);

        result = (float) x / y;
        System.out.println("result: " + result);

        // Приоритет математических операций

        int varC = 2 + 8 / 2;
        System.out.println("result: " + varC);

        int varC1 = (2 + 8) / 2;
        System.out.println("result: " + varC1);



    }
}
