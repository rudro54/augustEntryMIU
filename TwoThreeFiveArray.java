public class TwoThreeFiveArray {

    public static int is235Array(int[] a) {

        int divBy2 = 0;
        int divBy3 = 0;
        int divBy5 = 0;
        int divByNone = 0;

        for (int num : a) {

            boolean canBedivided = false;

            if (num % 2 == 0) {
                divBy2++;
                canBedivided = true;
            }

            if (num % 3 == 0) {
                divBy3++;
                canBedivided = true;
            }

            if (num % 5 == 0) {
                divBy5++;
                canBedivided = true;
            }

            if (!canBedivided) {
                divByNone++;
            }

        }

        int total = divBy2 + divBy3 + divBy5 + divByNone;
        if (total == a.length) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(is235Array(new int[] { 2, 3, 5, 7, 11 })); // Should return 1
        System.out.println(is235Array(new int[] { 2, 3, 6, 7, 11 })); // Should return 0
        System.out.println(is235Array(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 })); // Should return 0
        System.out.println(is235Array(new int[] { 2, 4, 8, 16, 32 })); // Should return 1
        System.out.println(is235Array(new int[] { 3, 9, 27, 7, 1, 1, 1, 1, 1 })); // Should return 1
        System.out.println(is235Array(new int[] { 7, 11, 77, 49 })); // Should return 1
        System.out.println(is235Array(new int[] { 2 })); // Should return 1
        System.out.println(is235Array(new int[] {})); // Should return 1
        System.out.println(is235Array(new int[] { 7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7 })); // Should return 1
    }

}
