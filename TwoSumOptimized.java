import java.util.Arrays;

public abstract class TwoSumOptimized {

    public static int[] TwoSumOptimizedMethod(int[] arr, int target) {

        int[] originalArray = arr.clone(); // 0,4,3,0

        Arrays.sort(arr); // 0,0,3,4

        for (int i = 0; i < arr.length; i++) {
            int k = target - arr[i]; // 0
            int x = Arrays.binarySearch(arr, i + 1, arr.length, k); // 1

            if (x >= 0) {
                int index1 = -1;
                int index2 = -1;

                for (int j = 0; j < originalArray.length; j++) {
                    if (originalArray[j] == arr[i] && index1 == -1) {
                        index1 = j;// 0
                    } else if (originalArray[j] == arr[x] && index2 == -1) {
                        index2 = j;

                    }
                    if (index1 != -1 && index2 != -1) {
                        break;
                    }

                }
                return new int[] { index1, index2 };
            }

        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSumOptimizedMethod(new int[] { 2, 7, 11, 15 }, 9)));

        System.out.println(Arrays.toString(TwoSumOptimizedMethod(new int[] { 3, 2, 4 }, 6)));

        System.out.println(Arrays.toString(TwoSumOptimizedMethod(new int[] { 3, 3 }, 6)));

        System.out.println(Arrays.toString(TwoSumOptimizedMethod(new int[] { 0, 4, 3, 0 }, 0)));

    }

}
