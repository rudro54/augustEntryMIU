public class CenteredOneIstheSmallest {

    public static int isCentered(int[] a) {

        if (a == null) {
            return 0;
        }

        int length = a.length;

        if (length % 2 == 0 || length == 0) {
            return 0;
        }

        int middleIndex = length / 2;
        int middleElement = a[middleIndex];

        for (int i = 0; i < length; i++) {
            if (i != middleIndex && a[i] <= middleElement) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(isCentered(new int[] { 3, 2, 1, 4, 5 }));
        System.out.println(isCentered(new int[] { 3, 2, 1, 4, 1 }));
        System.out.println(isCentered(new int[] { 1, 2, 3, 4 }));
        System.out.println(isCentered(new int[] {}));
        System.out.println(isCentered(new int[] { 10 }));
    }

}
