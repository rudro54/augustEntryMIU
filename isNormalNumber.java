public class isNormalNumber {

    public static int isNormal(int n) {

        if (n <= 2) {
            return 1;
        }

        for (int i = 3; i < n; i += 2) {

            if (n % i == 0) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isNormal(1));
        System.out.println(isNormal(2));
        System.out.println(isNormal(3));
        System.out.println(isNormal(4));
        System.out.println(isNormal(5));
        System.out.println(isNormal(6));
        System.out.println(isNormal(7));
        System.out.println(isNormal(8));
        System.out.println(isNormal(9));
        System.out.println(isNormal(10));
    }

}
