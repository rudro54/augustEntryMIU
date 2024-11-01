public class SumOddMinusSumEven {

    public static int SumOddMinusSumEvenMethod(int[] arr) {

        int sumOdd = 0;
        int sumEven = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {

            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }

        }

        return sumOdd - sumEven;

    }

    public static int f(int[] a) {

        int sum = 0;
        for (int num : a) {
            if (num % 2 == 1) {
                sum += num;
            } else {
                sum -= num;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 1 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 1, 2 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 1, 2, 3 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 1, 2, 3, 4 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 3, 3, 4, 4 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 3, 2, 3, 4 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 4, 1, 2, 3 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] { 1, 1 }));
        System.out.println(SumOddMinusSumEvenMethod(new int[] {}));
        System.out.println("new line");
        System.out.println("new line");
        System.out.println(f(new int[] { 1 }));
        System.out.println(f(new int[] { 1, 2 }));
        System.out.println(f(new int[] { 1, 2, 3 }));
        System.out.println(f(new int[] { 1, 2, 3, 4 }));
        System.out.println(f(new int[] { 3, 3, 4, 4 }));
        System.out.println(f(new int[] { 3, 2, 3, 4 }));
        System.out.println(f(new int[] { 4, 1, 2, 3 }));
        System.out.println(f(new int[] { 1, 1 }));
        System.out.println(f(new int[] {}));g

    }

}
