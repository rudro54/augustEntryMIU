public class NiceArray {

    public static int isNice(int[] a) {

        int length = a.length;

        if (a == null || length == 0) {
            return 0;
        }

        for (int i = 0; i < length; i++) {
            int n = a[i];
            boolean foundMinus1 = contains(a, n - 1);
            boolean foundPlus1 = contains(a, n + 1);

            if (!foundMinus1 && !foundPlus1) {
                return 0;
            }
        }

        return 1;

    }

    public static boolean contains(int[] a, int value) {
        for (int num : a) {
            if (num == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNice(new int[] { 2, 10, 9, 3 }));
        System.out.println(isNice(new int[] { 2, 2, 3, 3, 3 }));
        System.out.println(isNice(new int[] { 1, 1, 1, 2, 1, 1 }));
        System.out.println(isNice(new int[] { 0, 1, 1 }));
        System.out.println(isNice(new int[] { 3, 4, 5, 7 }));
        System.out.println(isNice(new int[] { 1, 2, 3 }));
        System.out.println(isNice(new int[] { 3 }));
        System.out.println(isNice(new int[] {}));

    }

}
