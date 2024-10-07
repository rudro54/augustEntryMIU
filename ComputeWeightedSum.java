public class ComputeWeightedSum {

    public static int result(int[] a) {

        int sum = 0;

        for (int num : a) {

            sum = (num % 2 == 0) ? (sum += 2 * num) : (sum += 3 * num);

        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(result(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(result(new int[] { 1, 3, 5 }));
        System.out.println(result(new int[] { 2, 4, 6 }));
        System.out.println(result(new int[] { 1 }));
        System.out.println(result(new int[] { 2 }));
        System.out.println(result(new int[] { 0, 0, 0, 0, 0 }));

    }

}
