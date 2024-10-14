public class PointOfEquilibriumInAnArray {

    public static int f(int[] a) {

        int totalSum = 0;

        for (int num : a) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < a.length; i++) {
            totalSum -= a[i];

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += a[i];
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(f(new int[] { 1, 8, 3, 7, 10, 2 }));
        System.out.println(f(new int[] { 1, 5, 3, 1, 1, 1, 1, 1, 1 }));
        System.out.println(f(new int[] { 2, 1, 1, 1, 2, 1, 7 }));
        System.out.println(f(new int[] { 1, 2, 3 }));
        System.out.println(f(new int[] { 3, 4, 5, 10 }));
        System.out.println(f(new int[] { 1, 2, 10, 3, 4 }));
    }

}
