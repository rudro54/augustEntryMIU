public class isRapidlyIncreasing {

    public static int isRapidlyIncreasingMethod(int[] arr) {

        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int firstElement = arr[i];

            if (firstElement > sum * 2) {
                sum += firstElement;
            } else {
                return 0;
            }

        }

        return 1;

    }

    public static void main(String[] args) {

        System.out.println(isRapidlyIncreasingMethod(new int[] { 1, 3, 9, 27 }));
        System.out.println(isRapidlyIncreasingMethod(new int[] { 1, 3, 200, 500 }));
        System.out.println(isRapidlyIncreasingMethod(new int[] { 1 }));
        System.out.println(isRapidlyIncreasingMethod(new int[] { 1, 3, 9, 26 }));
        System.out.println(isRapidlyIncreasingMethod(new int[] { 1, 3, 7, 26 }));
        System.out.println(isRapidlyIncreasingMethod(new int[] { 1, 3, 8, 27 }));

    }

}
