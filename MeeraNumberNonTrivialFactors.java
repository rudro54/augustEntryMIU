public class MeeraNumberNonTrivialFactors {

    public static int isMeera(int n) {

        int nontrivialFactors = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                nontrivialFactors++;
            }
        }

        if (nontrivialFactors > 0 && n % nontrivialFactors == 0) {
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
