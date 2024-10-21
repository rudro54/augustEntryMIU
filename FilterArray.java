public class FilterArray {

    public static int isFilter(int[] a) {

        if (a == null || a.length == 0) {
            return 1;
        }

        boolean has9 = false;
        boolean has11 = false;
        boolean has7 = false;
        boolean has13 = false;

        for (int num : a) {

            if (num == 9) {
                has9 = true;
            }

            if (num == 11) {
                has11 = true;
            }

            if (num == 7) {
                has7 = true;
            }

            if (num == 13) {
                has13 = true;
            }

        }

        if (has9 && !has11) {
            return 0;
        }

        if (has7 && has13) {
            return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isFilter(new int[] { 1, 2, 3, 9, 6, 11 }));
        System.out.println(isFilter(new int[] { 3, 4, 6, 7, 14, 16 }));
        System.out.println(isFilter(new int[] { 1, 2, 3, 4, 10, 11, 13 }));
        System.out.println(isFilter(new int[] { 3, 6, 5, 5, 13, 6, 13 }));
        System.out.println(isFilter(new int[] { 9, 6, 18 }));
        System.out.println(isFilter(new int[] { 4, 7, 13 }));
    }

}
