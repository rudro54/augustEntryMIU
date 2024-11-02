public class IsBeanNewQuestion {

    public static int isBean(int[] a) {
        for (int i = 0; i < a.length; i++) {

            boolean hasThatValue = false;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == 2 * a[i] || a[j] == 2 * a[i] + 1 || (a[j] == a[i] / 2)) {
                    hasThatValue = true;
                    break;
                }
            }

            if (!hasThatValue) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[] { 4, 9, 8 }));
        System.out.println(isBean(new int[] { 2, 2, 5, 11, 23 }));
        System.out.println(isBean(new int[] { 7, 7, 3, 6 }));
        System.out.println(isBean(new int[] { 0 }));
        System.out.println(isBean(new int[] { 3, 8, 4 }));
    }

}
