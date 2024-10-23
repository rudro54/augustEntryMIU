public class CubePerfect {

    public static boolean isCube(int n) {

        int absoluteNumber = n < 0 ? -n : n;

        for (int i = 0; i * i * i <= absoluteNumber; i++) {
            if (i * i * i == absoluteNumber) {
                return true;
            }
        }

        return false;

    }

    public static int isPerfectCube(int[] a) {

        if (a == null || a.length == 0) {
            return 1;
        }

        for (int num : a) {
            if (!isCube(num)) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isPerfectCube(new int[] { 1, 1, 1, 1 }));
        System.out.println(isPerfectCube(new int[] { 64 }));
        System.out.println(isPerfectCube(new int[] { 63 }));
        System.out.println(isPerfectCube(new int[] { 1, 0, -1 }));
        System.out.println(isPerfectCube(new int[] {}));
        System.out.println(isPerfectCube(new int[] { 3, 7, 21, 36 }));

    }

}
