public class CountDigit {

    public static int countDigit(int n, int digit) {

        if (n < 0 || digit < 0) {
            return -1;
        }

        int counter = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit == digit) {

                counter++;

            }

            n /= 10;
        }

        return counter;

    }

    public static void main(String[] args) {
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
        System.out.println(countDigit(543, 3));
        System.out.println(countDigit(-543, 3));
        System.out.println(countDigit(543, -3));

    }

}
