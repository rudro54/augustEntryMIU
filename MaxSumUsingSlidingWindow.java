public class MaxSumUsingSlidingWindow {

    public static int MaxSumUsingSlidingWindowMethod(int[] arr, int b) {

        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < b; i++) {
            sum = sum + arr[i];
        }
        int maxSum = sum;
        int byebye = b - 1;
        int welcome = n - 1;

        for (int i = 0; i < b; i++) {
            sum = sum - arr[byebye] + arr[welcome];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(MaxSumUsingSlidingWindowMethod(new int[] { 5, -2, 3, 1, 2 }, 3));

        System.out.println(MaxSumUsingSlidingWindowMethod(new int[] { 1, 2 }, 1));

    }

}
