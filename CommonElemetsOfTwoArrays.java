
import java.util.Arrays;

public class CommonElemetsOfTwoArrays {

    public static int[] f(int[] first, int[] second) {

        if (first == null || second == null) {
            return null;
        }

        int maxLength = first.length < second.length ? first.length : second.length;
        int[] tempArray = new int[maxLength];

        int counter = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    tempArray[counter++] = first[i];
                    break;
                }
            }
        }

        int[] resultArray = new int[counter];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = tempArray[i];
        }
        return resultArray;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(new int[] { 1, 8, 3, 2 }, new int[] { 4, 2, 6, 1 })));
        System.out.println(Arrays.toString(f(new int[] { 1, 8, 3, 2, 6 }, new int[] { 2, 6, 1 })));
        System.out.println(Arrays.toString(f(new int[] { 1, 3, 7, 9 }, new int[] { 7, 1, 9, 3 })));
        System.out.println(Arrays.toString(f(new int[] {}, new int[] { 1, 2, 3 })));
        System.out.println(Arrays.toString(f(new int[] { 1, 2 }, new int[] {})));
        System.out.println(Arrays.toString(f(new int[] { 1, 2 }, null)));
        System.out.println(Arrays.toString(f(null, new int[] {})));
        System.out.println(Arrays.toString(f(null, null)));

    }

}
