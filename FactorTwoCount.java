public class FactorTwoCount {

    public static int factorTwoCountMethod(int n) {

        int count = 0;

        while (n % 2 == 0) {
            n = n / 2;
            count++;

        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(factorTwoCountMethod(48));
        System.out.println(factorTwoCountMethod(27));

    }

}
