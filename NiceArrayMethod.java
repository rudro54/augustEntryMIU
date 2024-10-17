public class NiceArrayMethod {

    public static int isNice(int[] a) {

        for (int num : a) {

            boolean plus = false;
            boolean minus = false;

            if (contains(a, num + 1)) {
                plus = true;
            }

            if (contains(a, num - 1)) {
                minus = true;
            }

            if (!plus && !minus) {
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
        System.out.println(isNice(new int[] { 3, 4, 5, 7 }));

    }
}
