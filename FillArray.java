import java.util.Arrays;

public class FillArray {

    public static int[] fill(int[] a, int k, int n) {

        if (k <= 0 || n <= 0) {
            return null;
        }

        int[] resultArray = new int[n];

        for (int i = 0; i < n; i++) {
            resultArray[i] = a[i % k];
        }

        return resultArray;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new int[] { 1, 2, 3, 5, 9, 12, -2, -1 }, 3, 10)));
        System.out.println(Arrays.toString(fill(new int[] { 4, 2, -3, 12 }, 1, 5)));
        System.out.println(Arrays.toString(fill(new int[] { 2, 6, 9, 0, -3 }, 0, 4)));
    }

}
