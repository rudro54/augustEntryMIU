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

    public static boolean isPerfectSquareNumber(int x) {

        if (x < 0) {
            return false;
        }

        int s = (int) Math.sqrt(x);

        return s * s == x;

    }

    public static boolean isPerfectSquareNumberBinary(int x) {

        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midSquared = mid * mid;

            if (midSquared == x) {
                return true;
            }
            if (midSquared < x) {
                left = mid + 1;
            }
            if (midSquared > x) {
                right = mid - 1;
            }

        }

        return false;
    }

    public static int isFibonacci(int n) {

        int x1 = 5 * n * n + 4;
        int x2 = 5 * n * n - 4;

        // if (isPerfectSquareNumber(x1) || isPerfectSquare(x2)) {
        // return 1;
        // }

        if (isPerfectSquareNumberBinary(x1) || isPerfectSquareNumberBinary(x2)) {
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

        System.out.println("Checking something new with another function ..");

        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(3));
        System.out.println(isFibonacci(4));
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(21));
        System.out.println(isFibonacci(22));
    }

}
