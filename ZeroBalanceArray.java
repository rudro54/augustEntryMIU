public class ZeroBalanceArray {

    public static int isZeroBalanced(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int num : a) {
            sum += num;
        }

        if (sum != 0) {
            return 0;
        }

        for (int num : a) {
            if (num > 0) {
                boolean hasNegative = false;

                for (int n : a) {

                    if (n == -num) {
                        hasNegative = true;
                        break;
                    }
                }
                if (!hasNegative) {
                    return 0;
                }

            }
        }
        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isZeroBalanced(new int[] { 1, 2, -2, -1 }));
        System.out.println(isZeroBalanced(new int[] { 3, 1, 2, -2, -1, -3 }));
        System.out.println(isZeroBalanced(new int[] { 3, 4, -2, -3, -2 }));
        System.out.println(isZeroBalanced(new int[] { 0, 0, 0, 0, 0, 0 }));
        System.out.println(isZeroBalanced(new int[] { 3, -3, -3 }));
        System.out.println(isZeroBalanced(new int[] { 3 }));
        System.out.println(isZeroBalanced(new int[] {}));
    }

}
