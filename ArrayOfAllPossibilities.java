public class ArrayOfAllPossibilities {

    public static int isAllPossibilities(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int n = a.length;

        boolean[] found = new boolean[n];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] >= n) {
                return 0;
            }

            found[a[i]] = true;
        }

        for (int i = 0; i < found.length; i++) {
            if (!found[i]) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] { 1, 2, 0, 3 }));
        System.out.println(isAllPossibilities(new int[] { 3, 2, 1, 0 }));
        System.out.println(isAllPossibilities(new int[] { 1, 2, 4, 3 }));
        System.out.println(isAllPossibilities(new int[] { 0, 2, 3 }));
        System.out.println(isAllPossibilities(new int[] { 0 }));
        System.out.println(isAllPossibilities(new int[] {}));
    }

}
