public class SumOfOddMinusSumOfEven {

    public static int f(int[] a) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return oddSum - evenSum;

    }

    public static int fWay(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int oddSum = 0;
        int evenSum = 0;

        for (int num : a) {

            if (num % 2 != 0) {
                oddSum += num;
            }
            if (num % 2 == 0) {
                evenSum += num;
            }

        }

        return oddSum - evenSum;

    }

    public static void main(String[] args) {
        System.out.println(f(new int[] { 1 }));
        System.out.println(f(new int[] { 1, 2 }));
        System.out.println(f(new int[] { 1, 2, 3 }));
        System.out.println(f(new int[] { 1, 2, 3, 4 }));
        System.out.println(f(new int[] { 3, 3, 4, 4 }));
        System.out.println(f(new int[] { 3, 2, 3, 4 }));
        System.out.println(f(new int[] { 4, 1, 2, 3 }));
        System.out.println(f(new int[] { 1, 1 }));
        System.out.println(f(new int[] {}));
        System.out.println("New Line");
        System.out.println("New Line");
        System.out.println(fWay(new int[] { 1 }));
        System.out.println(fWay(new int[] { 1, 2 }));
        System.out.println(fWay(new int[] { 1, 2, 3 }));
        System.out.println(fWay(new int[] { 1, 2, 3, 4 }));
        System.out.println(fWay(new int[] { 3, 3, 4, 4 }));
        System.out.println(fWay(new int[] { 3, 2, 3, 4 }));
        System.out.println(fWay(new int[] { 4, 1, 2, 3 }));
        System.out.println(fWay(new int[] { 1, 1 }));
        System.out.println(fWay(new int[] {}));

    }

}
