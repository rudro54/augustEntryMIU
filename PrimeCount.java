public class PrimeCount {

    public static int PrimeCountMethod(int start, int end) {

        // so that range will be in right from
        if (start > end) {
            return 0;
        }

        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }

        return counter;

    }

    public static boolean isPrime(int n) {
        // here 1 can be used to divide any number
        if (n <= 1) {
            return false;
        }

        //
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeWay(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countPrimeWay(int start, int end) {
        if (start > end) {
            return 0;
        }

        int counter = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(PrimeCountMethod(10, 30));
        System.out.println(PrimeCountMethod(11, 29));
        System.out.println(PrimeCountMethod(20, 22));
        System.out.println(PrimeCountMethod(1, 1));
        System.out.println(PrimeCountMethod(5, 5));
        System.out.println(PrimeCountMethod(6, 2));
        System.out.println(PrimeCountMethod(-10, 6));

        System.out.println("new line");
        System.out.println("new line");

        System.out.println(countPrimeWay(10, 30));
        System.out.println(countPrimeWay(11, 29));
        System.out.println(countPrimeWay(20, 22));
        System.out.println(countPrimeWay(1, 1));
        System.out.println(countPrimeWay(5, 5));
        System.out.println(countPrimeWay(6, 2));
        System.out.println(countPrimeWay(-10, 6));

    }

}
