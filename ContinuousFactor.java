public class ContinuousFactor {

    public static int isContinuousFactor(int n) {

        for (int i = 2; i < n; i++) {
            int product = i;
            int j = i + 1;

            while (product < n) {
                product *= j;
                j++;

                if (product == n) {
                    return 1;
                }
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isContinuousFactor(6));
        System.out.println(isContinuousFactor(60));
        System.out.println(isContinuousFactor(120));
        System.out.println(isContinuousFactor(90));
        System.out.println(isContinuousFactor(99));
        System.out.println(isContinuousFactor(121));
        System.out.println(isContinuousFactor(2));
        System.out.println(isContinuousFactor(13));

    }

}
