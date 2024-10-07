public class IsOneHeavy {

    public static int isOneHeavy(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int oneCounter = 0;

        for (int num : a) {

            if (num != 0 && num != 1) {
                return 0;
            }

            if (num == 1) {
                oneCounter++;
            } else {
                if (oneCounter < 2) {
                    return 0;
                }

                oneCounter = 0;

            }

        }

        return oneCounter == 0 ? 1 : 0;

    }

    public static void main(String[] args) {
        System.out.println(isOneHeavy(new int[] { 1, 1, 0, 1, 1, 1, 0 }));
        System.out.println(isOneHeavy(new int[] { 1, 1, 0, 1, 1, 0 }));
        System.out.println(isOneHeavy(new int[] { 1, 1, 0, 1, 1, 0, 1, 1, 1, 0 }));
        System.out.println(isOneHeavy(new int[] { 1, 1, 1, 1, 1, 1, 1, 0 }));
        System.out.println(isOneHeavy(new int[] { 1, 0 }));
        System.out.println(isOneHeavy(new int[] { 1, 1, 0, 1, 0, 1, 1, 1, 0 }));
        System.out.println(isOneHeavy(new int[] { 3, 3, 3, 0, 3, 3, 0 }));
        System.out.println(isOneHeavy(new int[] { 1, 1, 1, 1, 1, 1 }));
        System.out.println(isOneHeavy(new int[] { 1, 1, 1, 1, 1, 1, 0, 0 }));
        System.out.println(isOneHeavy(new int[] { 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0 }));

    }

}
