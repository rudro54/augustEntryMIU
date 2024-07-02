public class PeakElement {

    public static int isPerfectPeak(int[] a, int x) {
        int n = a.length;

        for (int i = 0; i < x; i++) {
            if (a[i] >= a[x]) {
                return 0;
            }
        }
        for (int i = x + 1; i < n; i++) {

            if (a[i] <= a[x]) {
                return 0;
            }

        }

        return 1;

    }

    public static int PeakElementMethod(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n - 1; i++) {

            int x = isPerfectPeak(arr, i);
            if (x == 1) {
                return 1;
            }

        }

        return 0;

    }

    public static void main(String[] args) {

        System.out.println(PeakElementMethod(new int[] { 5, 1, 4, 3, 6, 8, 10, 7, 9 }));

        System.out.println(PeakElementMethod(new int[] { 5, 1, 4, 4 }));

    }

}
