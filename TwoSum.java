import java.util.Arrays;

public class TwoSum {

    public static int[] TwoSumMethod(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }

            }
        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(TwoSumMethod(new int[] { 2, 7, 11, 15 }, 9)));

        System.out.println(Arrays.toString(TwoSumMethod(new int[] { 3, 2, 4 }, 6)));

        System.out.println(Arrays.toString(TwoSumMethod(new int[] { 3, 3 }, 6)));

    }

}