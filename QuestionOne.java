public class QuestionOne {

    public static int computeWeightedSum(int[] a) {

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

    public static int computeWeightedSumTwo(int[] a) {
        int sum = 0;

        for (int num : a) {
            sum = (num % 2 == 0) ? (sum + num * 2) : (sum + num * 3);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(computeWeightedSum(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(computeWeightedSum(new int[] { 1, 3, 5 }));
        System.out.println(computeWeightedSum(new int[] { 2, 4, 6 }));
        System.out.println(computeWeightedSum(new int[] { 1 }));
        System.out.println(computeWeightedSum(new int[] { 2 }));
        System.out.println(computeWeightedSum(new int[] { 0, 0, 0, 0, 0 }));
        System.out.println(computeWeightedSum(new int[] {}));

        System.out.println("new line");

        System.out.println(computeWeightedSumTwo(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(computeWeightedSumTwo(new int[] { 1, 3, 5 }));
        System.out.println(computeWeightedSumTwo(new int[] { 2, 4, 6 }));
        System.out.println(computeWeightedSumTwo(new int[] { 1 }));
        System.out.println(computeWeightedSumTwo(new int[] { 2 }));
        System.out.println(computeWeightedSumTwo(new int[] { 0, 0, 0, 0, 0 }));
        System.out.println(computeWeightedSumTwo(new int[] {}));

    }

}
