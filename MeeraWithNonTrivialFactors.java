public class MeeraWithNonTrivialFactors {

    public static int isMeera(int n) {
        int nonTrivialFactors = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                nonTrivialFactors++;
            }
        }

        if (nonTrivialFactors > 0 && n % nonTrivialFactors == 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isMeera(6));
        System.out.println(isMeera(30));
        System.out.println(isMeera(21));
        System.out.println(isMeera(7));
        System.out.println(isMeera(1));
        System.out.println(isMeera(10));
    }

}
