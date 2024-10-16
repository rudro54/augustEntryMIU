public class HollowArray {

    public static int isHollow(int[] a) {

        if (a == null || a.length < 5) {
            return 0;
        }

        int leftNonZeroElement = 0;
        int middleZeroElement = 0;
        int rightNonZeroElement = 0;

        int i = 0;

        while (i < a.length && a[i] != 0) {
            leftNonZeroElement++;
            i++;
        }

        while (i < a.length && a[i] == 0) {
            middleZeroElement++;
            i++;
        }

        while (i < a.length && a[i] != 0) {
            rightNonZeroElement++;
            i++;
        }

        if (i == a.length && middleZeroElement >= 3 && leftNonZeroElement == rightNonZeroElement) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[] { 1, 2, 5, 0, 0, 0, 3, 4, 5 }));
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 }));
        System.out.println(isHollow(new int[] { 1, 2, 4, 9, 0, 0, 0, 3, 4, 5 }));
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 3, 4 }));
    }

}
