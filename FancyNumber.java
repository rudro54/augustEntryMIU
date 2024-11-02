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

    public static int isFancyWay(int n) {

        if (n == 1) {
            return 1;
        }
        int prevOne = 1;
        int prevTwo = 1;
        int currentFancy = 0;

        while (currentFancy < n) {
            currentFancy = 3 * prevOne + 2 * prevTwo;

            if (currentFancy == n) {
                return 1;
            }
            prevTwo = prevOne;
            prevOne = currentFancy;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
        System.out.println(isFancy(15));
        System.out.println("new line");
        System.out.println("new line");
        System.out.println(isFancyWay(1));
        System.out.println(isFancyWay(5));
        System.out.println(isFancyWay(17));
        System.out.println(isFancyWay(61));
        System.out.println(isFancyWay(15));
    }

}
