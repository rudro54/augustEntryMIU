public class MagicArray {

    public static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    public static int isMagicArray(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {

                sum += a[i];

            }
        }

        if (sum == a[0] || a[0] == 0) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isMagicArray(new int[] { 21, 3, 7, 9, 11, 4, 6 }));
        System.out.println(isMagicArray(new int[] { 13, 4, 4, 4, 4 }));
        System.out.println(isMagicArray(new int[] { 10, 5, 5 }));
        System.out.println(isMagicArray(new int[] { 0, 6, 8, 20 }));
        System.out.println(isMagicArray(new int[] { 3 }));
        System.out.println(isMagicArray(new int[] { 8, 5, -5, 5, 3 }));
    }

}
