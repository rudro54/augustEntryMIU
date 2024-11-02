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

    public static int reverseWay(int n) {

        boolean isNegative = n < 0;

        if (isNegative) {
            n = -n;
        }

        int reversed = 0;

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

    public static int reversedMethod(int n) {
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
        System.out.println("new line");
        System.out.println("new line");
        System.out.println(reversedMethod(1234));
        System.out.println(reversedMethod(12005));
        System.out.println(reversedMethod(1));
        System.out.println(reversedMethod(1000));
        System.out.println(reversedMethod(0));
        System.out.println(reversedMethod(-12345));
        System.out.println("new line");
        System.out.println("new line");
        System.out.println(reverseWay(1234));
        System.out.println(reverseWay(12005));
        System.out.println(reverseWay(1));
        System.out.println(reverseWay(1000));
        System.out.println(reverseWay(0));
        System.out.println(reverseWay(-12345));

    }

}
