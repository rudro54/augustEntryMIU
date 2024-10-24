public class LargestAdjacentSumMethod {

    public static int largestAdjacentSum(int[] a) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            int adjacentSum = a[i] + a[i + 1];
            if (adjacentSum > maxSum) {
                maxSum = adjacentSum;
            }

        }

        return maxSum;

    }

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[] { 1, 2, 3, 4 }));
        System.out.println(largestAdjacentSum(new int[] { 18, -12, 9, -10 }));
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1 }));

    }

}
