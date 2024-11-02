public class NextPerfectSquare {

    public static int isPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        }

        int root = 1;
        int perfectSquare = 1;

        while (perfectSquare <= n) {
            root++;
            perfectSquare = root * root;
        }

        return perfectSquare;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }

}
