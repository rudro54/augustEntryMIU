public class FancyNumber {

    public static int isFancy(int n) {

        if (n == 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int currentFancy = 0;

        while (currentFancy < n) {
            currentFancy = 3 * prev1 + 2 * prev2;

            if (currentFancy == n) {
                return 1;
            }

            prev2 = prev1;
            prev1 = currentFancy;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
        System.out.println(isFancy(15));
    }

}
