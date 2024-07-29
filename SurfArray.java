public class SurfArray {

    public static int isSurf(int[] a) {

        if (a == null || a.length == 0) {
            return 1;
        }

        for (int num : a) {
            boolean numberPlusOne = checkNumber(a, num + 1);
            boolean numberMinusOne = checkNumber(a, num - 1);

            if (!numberMinusOne && !numberPlusOne) {
                return 0;
            }
        }

        return 1;
    }

    public static boolean checkNumber(int[] a, int value) {

        for (int num : a) {
            if (num == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSurf(new int[] { 2, 10, 9, 3 }));
        System.out.println(isSurf(new int[] { 2, 2, 3, 3, 3 }));
        System.out.println(isSurf(new int[] { 1, 1, 1, 2, 1, 1 }));
        System.out.println(isSurf(new int[] { 0, -1, 1 }));
        System.out.println(isSurf(new int[] { 3, 4, 5, 7 }));

    }

}
