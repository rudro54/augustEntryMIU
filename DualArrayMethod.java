public class DualArrayMethod {

    public static int isDual(int[] a) {

        if (a == null || a.length == 0) {
            return 1;
        }

        if (a.length % 2 != 0) {
            return 0;
        }

        int referenceSum = a[0] + a[1];

        for (int i = 2; i < a.length - 1; i += 2) {
            int currentSum = a[i] + a[i + 1];
            if (currentSum != referenceSum) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isDual(new int[] { 1, 2, 3, 0 }));
        System.out.println(isDual(new int[] { 1, 2, 2, 1, 3, 0 }));
        System.out.println(isDual(new int[] { 1, 1, 2, 2 }));
        System.out.println(isDual(new int[] { 1, 2, 1 }));
        System.out.println(isDual(new int[] {}));

    }

}
