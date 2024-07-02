public class MaxSumBruitForce {

    public static int MaxSumBruitForceMethod(int[] arr, int b) {

        int maxSum = -1000000000;
        int n = arr.length;

        for (int i = 0; i <= b; i++) {

            int startingPosition = b - (i + 1); // to get b+1 iteration

            if (startingPosition == -1) {
                startingPosition = n - 1;
            }

            int sum = 0;
            int pos = startingPosition;

            int j = 0;
            while (j < b) {
                j++;
                sum = sum + arr[pos];
                pos--;
                if (pos == -1) {
                    pos = n - 1;
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {

        System.out.println(MaxSumBruitForceMethod(new int[] { 5, -2, 3, 1, 2 }, 3));

        System.out.println(MaxSumBruitForceMethod(new int[] { 1, 2 }, 1));

    }

}
