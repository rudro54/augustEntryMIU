public class BeanArray {

    public static int isBean(int[] a) {

        boolean has9 = false;
        boolean has13 = false;
        boolean has7 = false;
        boolean has16 = false;

        for (int num : a) {
            if (num == 9) {
                has9 = true;
            } else if (num == 13) {
                has13 = true;
            } else if (num == 7) {
                has7 = true;
            } else if (num == 16) {
                has16 = true;
            }
        }

        if (has9 && !has13) {
            return 0;
        }
        if (has7 && has16) {
            return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[] { 1, 2, 3, 9, 6, 13 }));
        System.out.println(isBean(new int[] { 3, 4, 6, 7, 13, 15 }));
        System.out.println(isBean(new int[] { 1, 2, 3, 4, 10, 11, 12 }));
        System.out.println(isBean(new int[] { 3, 6, 9, 5, 7, 13, 6, 17 }));
        System.out.println(isBean(new int[] { 9, 6, 18 }));
        System.out.println(isBean(new int[] { 4, 7, 16 }));

    }

}
