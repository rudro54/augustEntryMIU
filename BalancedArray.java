public class BalancedArray {

    public static int isBalanced(int[] a) {

        int length = a.length;

        if (a == null || length == 0) {
            return 1;
        }

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                if (a[i] % 2 != 0) {
                    return 0;
                }
            } else {
                if (a[i] % 2 == 0) {
                    return 0;
                }
            }

        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[] { 2, 3, 6, 7 }));
        System.out.println(isBalanced(new int[] { 6, 7, 2, 3, 12 }));
        System.out.println(isBalanced(new int[] { 7, 15, 2, 3 }));
        System.out.println(isBalanced(new int[] { 16, 6, 2, 3 }));
        System.out.println(isBalanced(new int[] { 2, 3, 4, 5, 6, 7 }));
        System.out.println(isBalanced(new int[] { 1 }));
        System.out.println(isBalanced(new int[] { 2 }));
        System.out.println(isBalanced(new int[] {}));
    }

}
