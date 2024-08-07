public class IsBeanArray {

    public static int IsBeanArrayMethod(int[] arr) {

        int length = arr.length;

        if (arr == null || arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < length; i++) {

            int n = arr[i];
            boolean found = false;

            for (int j = 0; j < length; j++) {
                if (arr[j] == n + 1 || arr[j] == n - 1) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                return 0;
            }

        }

        return 1;

    }

    public static int isBean(int[] a) {

        int length = a.length;

        if (a == null || length == 0) {
            return 0;
        }

        for (int i = 0; i < length; i++) {

            int currentNumber = a[i];
            boolean checked = false;

            for (int j = 0; j < length; j++) {
                if (currentNumber == a[j] + 1 || currentNumber == a[j] - 1) {
                    checked = true;
                    break;
                }
            }

            if (!checked) {
                return 0;
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(IsBeanArrayMethod(new int[] { 2, 10, 9, 3 }));
        System.out.println(IsBeanArrayMethod(new int[] { 2, 2, 3, 3, 3 }));
        System.out.println(IsBeanArrayMethod(new int[] { 1, 1, 1, 2, 1, 1 }));
        System.out.println(IsBeanArrayMethod(new int[] { 0, -1, 1 }));
        System.out.println(IsBeanArrayMethod(new int[] { 3, 4, 5, 7 }));

        System.out.println("checking another time ..");

        System.out.println(isBean(new int[] { 2, 10, 9, 3 }));
        System.out.println(isBean(new int[] { 2, 2, 3, 3, 3 }));
        System.out.println(isBean(new int[] { 1, 1, 1, 2, 1, 1 }));
        System.out.println(isBean(new int[] { 0, -1, 1 }));
        System.out.println(isBean(new int[] { 3, 4, 5, 7 }));

    }

}
