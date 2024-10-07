public class IsOneHeavy {

    public static int isOneHeavy(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int oneCount = 0;

        for (int num : a) {

            if (num != 0 && num != 1) {
                return 0;
            }

            if (num == 1) {
                oneCount++;
            } else {
                if (oneCount < 2) {
                    return 0;
                }
                oneCount = 0;
            }

        }

        return oneCount == 0 ? 1 : 0;

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
