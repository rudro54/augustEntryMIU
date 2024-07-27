public class IsHollowArray {

    public static int IsHollowArrayMethod(int[] arr) {

        if (arr == null || arr.length < 5) {
            return 0;
        }

        int leftNonZero = 0;
        int zeroElements = 0;
        int rightNonZero = 0;

        int len = arr.length;

        int i = 0;

        while (i < len && arr[i] != 0) {
            leftNonZero++;
            i++;
        }

        while (i < len && arr[i] == 0) {
            zeroElements++;
            i++;
        }

        while (i < len && arr[i] != 0) {
            rightNonZero++;
            i++;
        }

        if (zeroElements >= 3 && leftNonZero == rightNonZero && i == len) {
            return 1;
        }

        return 0;

    }

    public static int isHollow(int[] a) {

        if (a == null || a.length < 5) {
            return 0;
        }

        int i = 0;
        int len = a.length;
        int left = 0;
        int zero = 0;
        int right = 0;

        while (i < len && a[i] != 0) {
            left++;
            i++;

        }

        while (i < len && a[i] == 0) {
            zero++;
            i++;
        }

        while (i < len && a[i] != 0) {
            right++;
            i++;
        }

        if (zero >= 3 && right == left && i == len) {
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(IsHollowArrayMethod(new int[] { 1, 2, 4, 0, 0, 0, 3, 4, 5 }));
        System.out.println(IsHollowArrayMethod(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 }));
        System.out.println(IsHollowArrayMethod(new int[] { 1, 2, 4, 9, 0, 0, 0, 3, 4, 5 }));
        System.out.println(IsHollowArrayMethod(new int[] { 1, 2, 0, 0, 3, 4 }));
        System.out.println(IsHollowArrayMethod(new int[] { 1, 0, 0, 0, 3 }));
        System.out.println("checking again...");
        System.out.println(isHollow(new int[] { 1, 2, 4, 0, 0, 0, 3, 4, 5 }));
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 }));
        System.out.println(isHollow(new int[] { 1, 2, 4, 9, 0, 0, 0, 3, 4, 5 }));
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 3, 4 }));
        System.out.println(isHollow(new int[] { 1, 0, 0, 0, 3 }));
    }

}
