public class FindPorcupineNumber {

    public static int FindPorcupineNumberMethod(int n) {

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

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(FindPorcupineNumberMethod(0));
        System.out.println(FindPorcupineNumberMethod(138));
        System.out.println(FindPorcupineNumberMethod(139));
        System.out.println(FindPorcupineNumberMethod(400));

    }

}
