public class checkConcatenatedSum {

    static int concatenatedDigit(int digit, int catlen) {
        int result = 0;

        for (int i = 0; i < catlen; i++) {
            result = result * 10 + digit;
        }

        return result;
    }

    public static int checkConcatenatedSumMethod(int n, int catlen) {

        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int concatenatedDigit = concatenatedDigit(digit, catlen);
            sum += concatenatedDigit;
            n = n / 10;
        }

        return originalNumber == sum ? 1 : 0;

    }

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSumMethod(198, 2));
        System.out.println(checkConcatenatedSumMethod(198, 3));
        System.out.println(checkConcatenatedSumMethod(2997, 3));
        System.out.println(checkConcatenatedSumMethod(2997, 2));
        System.out.println(checkConcatenatedSumMethod(13332, 4));
        System.out.println(checkConcatenatedSumMethod(9, 1));

    }

}
