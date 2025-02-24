package les_17;

public class HW_17_Tasl_3 {
    public static void main(String[] args) {

        powerOfTwo(7);
    }
    public static void powerOfTwo (int n) {

        int result = 1;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                result *= 2;
            }
        } else {
            for (int i = 0; i > n; i--) {
                result *= 2;
            }
            result = 1 / result;
        }
        System.out.println(result);
    }

}
