public class HodderNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int isHodder(int n) {

        if (!isPrime(n)) {
            return 0;
        }

        int power = 2;
        int hodderCandidate = (1 << power) - 1;

        while (hodderCandidate < n) {
            power++;
            hodderCandidate = (1 << power) - 1;
        }

        return hodderCandidate == n ? 1 : 0;

    }

    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));
        System.out.println(isHodder(15));
        System.out.println(isHodder(16));
    }

}
