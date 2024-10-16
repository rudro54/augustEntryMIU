public class SumIsPowerMethod {

    public static boolean isPowerOfTwo(int n) {

        if (n < 1) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;

    }

    public static boolean sumIsPower(int[] arr) {

        if (arr == null) {
            return false;
        }

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return isPowerOfTwo(sum);

    }

    public static void main(String[] args) {
        System.out.println(sumIsPower(new int[] { 8, 8, 8, 8 }));
        System.out.println(sumIsPower(new int[] { 8, 8, 8 }));

    }

}
