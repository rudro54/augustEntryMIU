public class ProcupineNumber {

    public static boolean isPrime(int n) {

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

    public static int ProcupineNumberFinding(int n) {

        int num = n + 1;

        while (true) {
            if (isPrime(num) && num % 10 == 9) {

                int nextPrime = num + 1;

                while (!isPrime(nextPrime)) {
                    nextPrime++;
                }

                if (nextPrime % 10 == 9) {
                    return num;
                }

            }
            num++;

        }

    }

    public static void main(String[] args) {
        System.out.println(ProcupineNumberFinding(139));

    }

}
