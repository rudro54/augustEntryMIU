public class PrimeCountMethod {

    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static int isPrime(int start, int end) {

        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                counter++;

            }

        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10, 30));
        System.out.println(isPrime(11, 29));
        System.out.println(isPrime(20, 22));
        System.out.println(isPrime(1, 1));
        System.out.println(isPrime(5, 5));
        System.out.println(isPrime(6, 2));
        System.out.println(isPrime(-10, 6));

    }

}
