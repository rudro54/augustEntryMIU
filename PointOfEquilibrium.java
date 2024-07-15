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

    public static void main(String[] args) {
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 8, 3, 7, 10, 2 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 5, 3, 1, 1, 1, 1, 1, 1 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 2, 1, 1, 1, 2, 1, 7 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 2, 3 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 3, 4, 5, 10 }));
        System.out.println(PointOfEquilibriumMethod(new int[] { 1, 2, 10, 3, 4 }));
    }

}
