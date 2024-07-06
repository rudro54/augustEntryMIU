public class IntertialArray {

    public static int IntertialArrayMethod(int[] arr) {

        boolean hasOdd = false;

        for (int num : arr) {
            if (num % 2 != 0) {
                hasOdd = true;
                break;
            }
        }

        if (!hasOdd) {
            return 0;
        }

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        if (max % 2 != 0) {
            return 0;
        }

        for (int odd : arr) {
            if (odd % 2 != 0) {
                for (int even : arr) {
                    if (even % 2 == 0 && even != max && odd <= even) {
                        return 0;

                    }
                }
            }
        }

        return 1;

    }

    public static void main(String[] args) {

        System.out.println(IntertialArrayMethod(new int[] { 1 }));
        System.out.println(IntertialArrayMethod(new int[] { 2 }));
        System.out.println(IntertialArrayMethod(new int[] { 1, 2, 3, 4 }));
        System.out.println(IntertialArrayMethod(new int[] { 1, 1, 1, 1, 1, 1, 2 }));
        System.out.println(IntertialArrayMethod(new int[] { 2, 12, 4, 6, 8, 11 }));
        System.out.println(IntertialArrayMethod(new int[] { 2, 12, 12, 4, 6, 8, 11 }));
        System.out.println(IntertialArrayMethod(new int[] { -2, -4, -6, -8, -11 }));
        System.out.println(IntertialArrayMethod(new int[] { 2, 3, 5, 7 }));
        System.out.println(IntertialArrayMethod(new int[] { 2, 4, 6, 8, 10 }));
        // from question
        System.out.println(IntertialArrayMethod(new int[] { 11, 4, 20, 9, 2, 8 }));
        System.out.println(IntertialArrayMethod(new int[] { 12, 11, 4, 9, 2, 3, 10 }));

    }

}
