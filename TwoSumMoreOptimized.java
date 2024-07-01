import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumMoreOptimized {

    public static int[] TwoSumMoreOptimizedMethod(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);

        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(TwoSumMoreOptimizedMethod(new int[] { 2, 7, 11, 15 }, 9)));

        System.out.println(Arrays.toString(TwoSumMoreOptimizedMethod(new int[] { 3, 2, 4 }, 6)));

        System.out.println(Arrays.toString(TwoSumMoreOptimizedMethod(new int[] { 3, 3 }, 6)));

        System.out.println(Arrays.toString(TwoSumMoreOptimizedMethod(new int[] { 0, 4, 3, 0 }, 0)));

    }

}
