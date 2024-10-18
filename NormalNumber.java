public class NormalNumber {

    public static int normalNumber(int n) {

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0 && i != n) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(normalNumber(1));
        System.out.println(normalNumber(2));
        System.out.println(normalNumber(3));
        System.out.println(normalNumber(4));
        System.out.println(normalNumber(5));
        System.out.println(normalNumber(7));
        System.out.println(normalNumber(8));
        System.out.println(normalNumber(6));
        System.out.println(normalNumber(9));

    }

}
