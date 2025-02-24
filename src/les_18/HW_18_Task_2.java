package les_18;

public class HW_18_Task_2 {

    public static String[] findMinMaxStrings (String[] arr) {
        if (arr == null || arr.length == 0) {
            return new String[0];
        }
        String minStr = arr[0];
        String maxStr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < minStr.length()) {
                minStr = arr[i];
            }
            if (arr[i].length() > minStr.length()) {
                maxStr = arr[i];
            }
        }
        return new String[] {minStr, maxStr};
    }

    public static void main(String[] args) {
        String[] strings = {"book", "table", "wardrobe", "bed"};
        String[] minMax = findMinMaxStrings(strings);

        if (minMax.length == 2) {
            System.out.println("The shortest line: " + minMax[0]);
            System.out.println("The longest line: " + minMax[1]);
        }
    }
}
