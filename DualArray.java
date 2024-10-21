public class DualArray {

    public static int dualArray(int[] a) {

        if (a.length % 2 != 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count != 2) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(dualArray(new int[] { 1, 2, 1, 3, 3, 2 }));
        System.out.println(dualArray(new int[] { 2, 5, 2, 5, 5 }));
        System.out.println(dualArray(new int[] { 3, 1, 1, 2, 2 }));
        System.out.println(dualArray(new int[] { 1, 1, 2, 2, 3, 3, 4, 4 }));
    }

}
