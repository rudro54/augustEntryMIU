public class NiceArrayMethod {

    public static int isNice(int[] a) {

        for (int num : a) {

            boolean nPlusOne = false;
            boolean nMinusOne = false;

            if (contains(a, num + 1)) {
                nPlusOne = true;
            }
            if (contains(a, num - 1)) {
                nMinusOne = true;
            }

            if (!nPlusOne && !nMinusOne) {
                return 0;
            }
        }

        return 1;

    }

    public static boolean contains(int[] arr, int value) {

        for (int num : arr) {
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
        System.out.println(isNice(new int[] { 0, -1, 1 }));
        System.out.println(isNice(new int[] { 3, 4, 5, 7 }));

    }
}
