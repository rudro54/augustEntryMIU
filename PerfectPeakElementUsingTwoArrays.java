public class PerfectPeakElementUsingTwoArrays {

    public static int PerfectPeakElementUsingTwoArraysMethod(int[] arr) {

        int n = arr.length;
        int[] highestItem = new int[n];
        int[] lowestItem = new int[n];

        highestItem[0] = arr[0];
        for (int i = 1; i < n; i++) {
            highestItem[i] = Math.max(arr[i], highestItem[i - 1]);
        }

        lowestItem[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            lowestItem[i] = Math.min(arr[i], lowestItem[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > highestItem[i - 1] && arr[i] < lowestItem[i + 1]) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(PerfectPeakElementUsingTwoArraysMethod(new int[] { 5, 1, 4, 3, 6, 8, 10, 7, 9 }));

        System.out.println(PerfectPeakElementUsingTwoArraysMethod(new int[] { 5, 1, 4, 4 }));

    }

}
