public class largestAdjacentSum {

    public static int largestAdjacentSumMethod(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int first = arr[i];
            int second = arr[i + 1];

            int temp = first + second;

            if (temp > sum) {
                sum = temp;
            }

        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(largestAdjacentSumMethod(new int[] { 1, 2, 3, 4 }));
        System.out.println(largestAdjacentSumMethod(new int[] { 18, -12, 9, 10 }));
        System.out.println(largestAdjacentSumMethod(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
        System.out.println(largestAdjacentSumMethod(new int[] { 1, 1, 1, 1, 1, 1, 2, 1, 1 }));
    }

}
