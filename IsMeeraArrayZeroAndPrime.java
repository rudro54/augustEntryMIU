public class IsMeeraArrayZeroAndPrime {

    public static int isPrime(int n) {
        if (n <= 1)
            return 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static int IsMeeraArrayZeroAndPrimeMethod(int[] arr) {

        boolean hasZero = false;
        boolean hasPrime = false;

        for (int num : arr) {
            if (num == 0)
                hasZero = true;
            if (isPrime(num) == 1)
                hasPrime = true;
        }

        if (hasZero && hasPrime)
            return 1;
        if (!hasZero && !hasPrime)
            return 1;

        return 0;

    }

    public static int isPrimeNumber(int n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % 2 == 0) {

                return 0;
            }
        }

        return 1;
    }

    public static int isMeera(int[] a) {

        boolean hasZero = false;
        boolean hasPrime = false;

        for (int num : a) {
            if (num == 0) {
                hasZero = true;
            }

            if (isPrimeNumber(num) == 1) {
                hasPrime = true;
            }
        }

        if (hasZero && hasPrime) {
            return 1;
        }

        if (!hasZero && !hasPrime) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {

        System.out.println(IsMeeraArrayZeroAndPrimeMethod(new int[] { 7, 6, 0, 10, 1 }));

        System.out.println(IsMeeraArrayZeroAndPrimeMethod(new int[] { 6, 10, 1 }));

        System.out.println(IsMeeraArrayZeroAndPrimeMethod(new int[] { 7, 6, 10 }));

        System.out.println(IsMeeraArrayZeroAndPrimeMethod(new int[] { 6, 10, 0 }));

        System.out.println(IsMeeraArrayZeroAndPrimeMethod(new int[] { 3, 7, 0, 8, 0, 5 }));

        System.out.println("checking again with a new function .... ");

        System.out.println(isMeera(new int[] { 7, 6, 0, 10, 1 }));

        System.out.println(isMeera(new int[] { 6, 10, 1 }));

        System.out.println(isMeera(new int[] { 7, 6, 10 }));

        System.out.println(isMeera(new int[] { 6, 10, 0 }));

        System.out.println(isMeera(new int[] { 3, 7, 0, 8, 0, 5 }));

    }

}
