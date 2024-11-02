public class MeeraArrayOneAndNinve {

    public static int isMeera(int[] a) {

        if (a == null || a.length == 0) {
            return 1;
        }

        boolean hasOne = false;
        boolean hasNine = false;

        for (int num : a) {
            if (num == 9) {
                hasNine = true;
            }

            if (num == 1) {
                hasOne = true;
            }

        }

        if ((hasOne && hasNine) || (!hasOne && !hasNine)) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isMeera(new int[] { 7, 9, 0, 10, 1 }));
        System.out.println(isMeera(new int[] { 6, 10, 8 }));
        System.out.println(isMeera(new int[] { 7, 6, 1 }));
        System.out.println(isMeera(new int[] { 9, 10, 0 }));
        System.out.println(isMeera(new int[] { 1, 1, 0, 8, 0, 9, 9, 1 }));
    }

}
