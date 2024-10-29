public class OneTwoOneArray {

    public static int is121Array(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        if (a.length < 3) {
            return 0;
        }

        int firstOnes = 0;
        int i = 0;

        while (i < a.length && a[i] == 1) {
            firstOnes++;
            i++;
        }

        if (firstOnes == 0) {
            return 0;
        }

        int middleTwos = 0;
        while (i < a.length && a[i] == 2) {
            middleTwos++;
            i++;

        }

        if (middleTwos == 0) {
            return 0;
        }

        int lastOnes = 0;

        while (i < a.length && a[i] == 1) {
            lastOnes++;
            i++;
        }

        if (i != a.length) {
            return 0;
        }

        if (firstOnes != lastOnes) {
            return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[] { 1, 2, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 1, 1, 1, 1 }));
        System.out.println(is121Array(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2 }));
        System.out.println(is121Array(new int[] { 2, 2, 2 }));
    }

}
