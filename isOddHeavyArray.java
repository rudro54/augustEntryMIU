public class isOddHeavyArray {

    public static int isOddHeavy(int[] a) {

        int length = a.length;

        if (a == null || length == 0) {
            return 0;
        }

        boolean hasOdd = false;
        boolean hasEven = false;
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for (int num : a) {
            if (num % 2 == 0) {
                hasEven = true;
                if (num > maxEven) {
                    maxEven = num;
                }

            } else {
                hasOdd = true;
                if (num < minOdd) {
                    minOdd = num;
                }
            }
        }

        if (!hasOdd) {
            return 0;
        }

        if (!hasEven || minOdd > maxEven) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[] { 11, 4, 9, 2, 8 }));
        System.out.println(isOddHeavy(new int[] { 11, 4, 9, 2, 3, 10 }));
        System.out.println(isOddHeavy(new int[] { 1 }));
        System.out.println(isOddHeavy(new int[] { 2 }));
        System.out.println(isOddHeavy(new int[] { 1, 1, 1, 1 }));
        System.out.println(isOddHeavy(new int[] { 2, 4, 6, 8, 11 }));
        System.out.println(isOddHeavy(new int[] { -2, -4, -6, -8, -11 }));
    }

}
