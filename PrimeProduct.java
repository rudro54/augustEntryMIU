public class PrimeProduct {

    public static int isPrime(int n) {

        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;

    }

    public static int isPrimeProduct(int n) {

        if (n < 4) {
            return 0;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int factOne = i;
                int factTwo = n / i;

                if (isPrime(factOne) == 1 && isPrime(factTwo) == 1) {
                    return 1;
                }
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(15));
        System.out.println(isPrimeProduct(25));
        System.out.println(isPrimeProduct(2));
        System.out.println(isPrimeProduct(30));
        System.out.println(isPrimeProduct(49));

    }

}
