public class MeeraNumber {

    public static int isMeera(int n) {

        int nonTrivialFactor = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                nonTrivialFactor++;
            }
        }

        if (nonTrivialFactor > 0 && n % nonTrivialFactor == 0) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isMeera(6));
        System.out.println(isMeera(30));
        System.out.println(isMeera(21));
    }

}
