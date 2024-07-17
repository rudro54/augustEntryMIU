import java.util.Arrays;

public class FillArrayWithNumbersAndLength {

    public static int[] FillArrayWithNumbersAndLengthMethod(int[] arr, int k, int len) {
        if (k <= 0 || len <= 0) {
            return null;
        }

        int[] resultArray = new int[len];

        for (int i = 0; i < len; i++) {
            resultArray[i] = arr[i % k];
        }

        return resultArray;

    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(FillArrayWithNumbersAndLengthMethod(new int[] { 1, 2, 3, 5, 9, 12, -2, -1 }, 3, 10)));
        System.out.println(
                Arrays.toString(FillArrayWithNumbersAndLengthMethod(new int[] { 4, 2, -3, 12 }, 1, 5)));
        System.out.println(
                Arrays.toString(FillArrayWithNumbersAndLengthMethod(new int[] { 2, 6, 9, 0, -3 }, 0, 4)));
    }

}
