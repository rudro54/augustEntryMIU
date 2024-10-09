public class ReverseANumberEvenNegative {

    public static int reverseNumber(int n) {

        int reverse = 0;

        boolean isNegative = n < 0;

        if (isNegative) {
            n = -n;
        }

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (isNegative) {
            reverse = -reverse;
        }

        return reverse;

    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
        System.out.println(reverseNumber(12005));
        System.out.println(reverseNumber(1));
        System.out.println(reverseNumber(1000));
        System.out.println(reverseNumber(0));
        System.out.println(reverseNumber(-12345));

    }

}
