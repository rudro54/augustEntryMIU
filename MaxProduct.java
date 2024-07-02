import java.util.Arrays;

public class MaxProduct {

    public static int MaxProductMethod(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        return Math.max(arr[0] * arr[1] * arr[n - 1], arr[n - 1] * arr[n - 2] * arr[n - 3]);
    }

    public static void main(String[] args) {

        System.out.println(MaxProductMethod(new int[] { 1, 2, 3, 4 }));

        System.out.println(MaxProductMethod(new int[] { 0, -1, 3, 100, 70, 50 }));

        System.out.println(MaxProductMethod(new int[] { -300, -200, 10, 20, 30, 40 }));

    }

}
