public class SquarePair {

    public static int SquarePairMethod(int[] arr) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j] && arr[i] > 0 && arr[j] > 0) {

                    if (isPerfectSquare(arr[i] + arr[j])) {
                        counter++;
                    }

                }
            }
        }
        return counter;

    }

    public static boolean isPerfectSquare(int n) {

        if (n < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;

    }

    public static void main(String[] args) {
        System.out.println(SquarePairMethod(new int[] { 9, 0, 2, -5, 7 }));
        System.out.println(SquarePairMethod(new int[] { 11, 5, 4, 20 }));

    }

}
