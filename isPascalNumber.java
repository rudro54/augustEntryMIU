public class isPascalNumber {

    public static int isPascal(int n) {

        int sum = 0;
        int j = 1;

        while (sum < n) {
            sum += j;

            if (sum == n) {
                return 1;
            }

            j++;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isPascal(1));
        System.out.println(isPascal(3));
        System.out.println(isPascal(6));
        System.out.println(isPascal(10));
        System.out.println(isPascal(7));
        System.out.println(isPascal(15));
        System.out.println(isPascal(21));
        System.out.println(isPascal(22));
    }

}
