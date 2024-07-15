public class ReverseANumber {

    public static int ReverseANumberMethod(int n) {
        int reversed = 0;
        boolean isNegative = n < 0;

        if (isNegative) {
            n = -n;
        }

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;

        }
        if (isNegative) {
            reversed = -reversed;
        }

        return reversed;

    }

    public static void main(String[] args) {
        System.out.println(ReverseANumberMethod(1234));
        System.out.println(ReverseANumberMethod(12005));
        System.out.println(ReverseANumberMethod(1));
        System.out.println(ReverseANumberMethod(1000));
        System.out.println(ReverseANumberMethod(0));
        System.out.println(ReverseANumberMethod(-12345));
    }

}
