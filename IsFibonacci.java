public class IsFibonacci {

    public static boolean isPerfectSquare(int x) {

        if (x < 0) {
            return false;

        }

        int s = (int) Math.sqrt(x);
        return s * s == x;

    }

    public static boolean isPerfectSquareTwo(int x) {
        if (x < 0) {
            return false;
        }

        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return true;
            } else if (midSquared < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;

    }

    public static int IsFibonacciMethod(int n) {

        int x1 = 5 * n * n + 4;
        int x2 = 5 * n * n - 4;

        if (isPerfectSquareTwo(x1) || isPerfectSquareTwo(x2)) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(IsFibonacciMethod(1));
        System.out.println(IsFibonacciMethod(2));
        System.out.println(IsFibonacciMethod(3));
        System.out.println(IsFibonacciMethod(4));
        System.out.println(IsFibonacciMethod(5));
        System.out.println(IsFibonacciMethod(13));
        System.out.println(IsFibonacciMethod(21));
        System.out.println(IsFibonacciMethod(22));
    }

}
