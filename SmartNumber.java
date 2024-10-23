public class SmartNumber {

    public static int smartNumber(int n) {
        int currentElement = 1;
        int k = 1;

        while (currentElement <= n) {
            if (currentElement == n) {
                return 1;
            }

            k++;
            currentElement = currentElement + (k - 1);

        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(smartNumber(11));
        System.out.println(smartNumber(22));
        System.out.println(smartNumber(8));
    }

}
