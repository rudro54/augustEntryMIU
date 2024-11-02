public class PointOfEquilibrium {

    public static int PointOfEquilibriumMethod(int[] arr) {

        int totalSum = 0;

        for (int num : arr) {

            totalSum += num;

        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += arr[i];
        }
        return -1;

    }

    public static int PointOfEquilibriumWay(int[] a) {

        int leftSum = 0;
        int totalSum = 0;

        for (int num : a) {
            totalSum += num;
        }

        for (int i = 0; i < a.length; i++) {
            totalSum -= a[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += a[i];
        }

        return -1;
    }

    public static int poeWay(int[] a) {

        if (a == null || a.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < a.length; i++) {
            sum -= a[i];
            if (leftSum == sum) {
                return i;
            }
            leftSum += a[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 8, 3, 7, 10, 2 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 5, 3, 1, 1, 1, 1, 1, 1 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 2, 1, 1, 1, 2, 1, 7 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 2, 3 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 3, 4, 5, 10 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 2, 10, 3, 4 }));
        System.out.println("new line");
        System.out.println("new line");
        System.out.println(PointOfEquilibriumWay(new int[] { 1, 8, 3, 7, 10, 2 }));
        System.out.println(PointOfEquilibriumWay(new int[] { 1, 5, 3, 1, 1, 1, 1, 1, 1 }));
        System.out.println(PointOfEquilibriumWay(new int[] { 2, 1, 1, 1, 2, 1, 7 }));
        System.out.println(PointOfEquilibriumWay(new int[] { 1, 2, 3 }));
        System.out.println(PointOfEquilibriumWay(new int[] { 3, 4, 5, 10 }));
        System.out.println(PointOfEquilibriumWay(new int[] { 1, 2, 10, 3, 4 }));
        System.out.println("new line");
        System.out.println("new line");
        System.out.println(poeWay(new int[] { 1, 8, 3, 7, 10, 2 }));
        System.out.println(poeWay(new int[] { 1, 5, 3, 1, 1, 1, 1, 1, 1 }));
        System.out.println(poeWay(new int[] { 2, 1, 1, 1, 2, 1, 7 }));
        System.out.println(poeWay(new int[] { 1, 2, 3 }));
        System.out.println(poeWay(new int[] { 3, 4, 5, 10 }));
        System.out.println(poeWay(new int[] { 1, 2, 10, 3, 4 }));
    }

}
