public class isGutherie {

    public static int isGutherieMethod(int n) {
        int k = 1;
        int currentElement = 1;

        while (currentElement <= n) {
            if (currentElement == n) {
                return 1;

            }
            k++;
            currentElement = currentElement + k - 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isGutherieMethod(22));
        System.out.println(isGutherieMethod(8));
    }

}
