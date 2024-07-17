public class SumIsPower {

    public static boolean SumIsPowerMethod(int[] arr) {

        if (arr == null)
            return false;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return isPowerOfTwo(sum);

    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(SumIsPowerMethod(new int[] { 8, 8, 8, 8 }));
        System.out.println(SumIsPowerMethod(new int[] { 8, 8, 8 }));
        System.out.println(SumIsPowerMethod(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
        System.out.println(SumIsPowerMethod(new int[] { 16 }));
        System.out.println(SumIsPowerMethod(new int[] { 18 }));
        System.out.println(SumIsPowerMethod(null));
    }

}
