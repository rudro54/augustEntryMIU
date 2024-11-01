public class ComputeWeightedSum {

    public static int result(int[] a) {

        int sum = 0;

        for (int num : a) {

            sum = (num % 2 == 0) ? (sum += 2 * num) : (sum += 3 * num);

        }

        return sum;

    }

    public static int computeWeightedSumMethod(int[] a) {
        int sum = 0;

        for (int num : a) {
            sum = (num % 2 == 0) ? (sum += 2 * num) : (sum += 3 * num);

        }

        return sum;
    }

    public static int ComputeWeightedSumMethodTwo(int[] a) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return 2 * evenSum + 3 * oddSum;

    }

    public static void main(String[] args) {
        System.out.println(result(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(result(new int[] { 1, 3, 5 }));
        System.out.println(result(new int[] { 2, 4, 6 }));
        System.out.println(result(new int[] { 1 }));
        System.out.println(result(new int[] { 2 }));
        System.out.println(result(new int[] { 0, 0, 0, 0, 0 }));
        System.out.println("New Line");
        System.out.println(computeWeightedSumMethod(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(computeWeightedSumMethod(new int[] { 1, 3, 5 }));
        System.out.println(computeWeightedSumMethod(new int[] { 2, 4, 6 }));
        System.out.println(computeWeightedSumMethod(new int[] { 1 }));
        System.out.println(computeWeightedSumMethod(new int[] { 2 }));
        System.out.println(computeWeightedSumMethod(new int[] { 0, 0, 0, 0, 0 }));
        System.out.println("New Line");
        System.out.println(ComputeWeightedSumMethodTwo(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(ComputeWeightedSumMethodTwo(new int[] { 1, 3, 5 }));
        System.out.println(ComputeWeightedSumMethodTwo(new int[] { 2, 4, 6 }));
        System.out.println(ComputeWeightedSumMethodTwo(new int[] { 1 }));
        System.out.println(ComputeWeightedSumMethodTwo(new int[] { 2 }));
        System.out.println(ComputeWeightedSumMethodTwo(new int[] { 0, 0, 0, 0, 0 }));

    }

}
