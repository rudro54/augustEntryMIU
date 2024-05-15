public class largestPrimeFactor {

    public static int largestPrimeFactorMethod(int n) {

        if (n <= 1) {
            return 0;
        }

        int i = 2;
        int largestPrime = 0;

        while (i * i <= n) {

            if (n % i != 0) {
                i++;
            } else {
                n /= i;
                largestPrime = i;
            }

        }
        if (n > 1) {
            largestPrime = n;
        }

        return largestPrime;
    }

    public static void main(String[] args) {

        System.out.println(largestPrimeFactorMethod(10));
        System.out.println(largestPrimeFactorMethod(6936));
        System.out.println(largestPrimeFactorMethod(1));

    }

}
