public class NiceArrayWhichDealsWithN {

    public static int isNice(int[] a) {

        if (a == null || a.length == 0) {
            return 1;
        }

        for (int num : a) {

            boolean hasNumberPlusOne = checkNumber(a, num + 1);
            boolean hasNumberMinusOne = checkNumber(a, num - 1);

            if (!hasNumberPlusOne && !hasNumberMinusOne) {
                return 0;
            }
        }

        return 1;

    }

    public static boolean checkNumber(int[] arr, int value) {
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
