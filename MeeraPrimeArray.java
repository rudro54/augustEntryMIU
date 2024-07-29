public class MeeraPrimeArray {

    public static int isMeera(int[] a) {

        if (a == null || a.length == 0) {
            return 1;
        }

        boolean has1 = false;
        boolean hasPrime = false;

        for (int num : a) {
            if (num == 1) {

                has1 = true;

            }
            if (isPrime(num)) {
                hasPrime = true;

            }
        }

        if ((has1 && hasPrime) || (!has1 && !hasPrime)) {
            return 1;

        }

        return 0;

    }

    public static boolean isPrime(int n) {

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

    public static void main(String[] args) {
        System.out.println(isMeera(new int[] { 7, 6, 10, 1 }));
        System.out.println(isMeera(new int[] { 7, 6, 10 }));
        System.out.println(isMeera(new int[] { 3, 7, 1, 8, 1 }));
    }

}
