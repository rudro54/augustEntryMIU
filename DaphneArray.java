public class DaphneArray {

    public static int isDaphne(int[] a) {

        boolean hasOdd = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOdd = true;
                break;
            }
        }

        if (!hasOdd) {
            return 0;
        }

        int startEvenCounter = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                startEvenCounter++;
            } else {
                break;
            }
        }

        int endEvenCounter = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                endEvenCounter++;
            } else {
                break;
            }
        }

        if (startEvenCounter == endEvenCounter) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[] { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 }));
        System.out.println(isDaphne(new int[] { 2, 4, 6, 8, 6 }));
        System.out.println(isDaphne(new int[] { 2, 8, 7, 10, -4, 6 }));
    }

}
