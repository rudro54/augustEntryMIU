public class isSequencedArray {

    public static int isSequencedMethodArrayMethod(int[] arr, int m, int n) {

        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];

        if (firstElement != m || lastElement != n) {
            return 0;
        } else {

            int matched = 0;

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] == arr[i + 1]) {
                    matched = 1;
                    continue;
                } else if (arr[i] > arr[i + 1]) {
                    return 0;
                } else if (matched != 1 && arr[i] + 1 != arr[i + 1]) {
                    return 0;
                }

            }

            return 1;

        }

    }

    public static void main(String[] args) {

        System.out.println(isSequencedMethodArrayMethod(new int[] { 1, 2, 3, 4, 5 }, 1, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 1, 3, 4, 2, 5 }, 1, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { -5, -5, -4, -4, -4, -3, -3, -2, -2, -2 }, -5, -2));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 0, 1, 2, 3, 4, 5 }, 1, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 1, 2, 3, 4 }, 1, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 1, 2, 5 }, 1, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 5, 4, 3, 2, 1 }, 1, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 2, 2, 3, 4, 4, 4, 5 }, 2, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 2, 2, 3, 5, 5, 5 }, 1, 5));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 0, 2, 2, 3, 3 }, 2, 3));
        System.out.println(isSequencedMethodArrayMethod(new int[] { 1, 1, 3, 2, 2, 4 }, 1, 4));

    }

}
