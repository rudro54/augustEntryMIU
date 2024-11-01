import java.util.Arrays;

public class DistinctElements {

    public static int[] DistinctElementsMethod(int[] first, int[] second) {

        if (first == null || second == null) {
            return null;
        }

        int maxLength = first.length < second.length ? first.length : second.length;
        int[] tempResult = new int[maxLength];
        int count = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {

                if (first[i] == second[j]) {
                    tempResult[count++] = first[i];
                    break;
                }

            }
        }

        int[] resultArray = new int[count];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = tempResult[i];
        }

        return resultArray;

    }

    public static int[] DistinctElementsWay(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }

        int maxLength = first.length < second.length ? first.length : second.length;

        int[] tempResult = new int[maxLength];

        int count = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    tempResult[count++] = first[i];
                    break;
                }
            }
        }

        int[] resultArray = new int[count];

        for (int i = 0; i < count; i++) {
            resultArray[i] = tempResult[i];

        }

        return resultArray;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(DistinctElementsMethod(new int[] { 1, 8, 3, 2 }, new int[] { 4, 2, 6, 1 })));
        System.out.println(Arrays.toString(DistinctElementsMethod(new int[] { 1, 8, 3, 2, 6 }, new int[] { 2, 6, 1 })));
        System.out.println(Arrays.toString(DistinctElementsMethod(new int[] { 1, 3, 7, 9 }, new int[] { 7, 1, 9, 3 })));
        System.out.println(Arrays.toString(DistinctElementsMethod(new int[] { 1, 2 }, new int[] { 3, 4 })));
        System.out.println(Arrays.toString(DistinctElementsMethod(new int[] {}, new int[] { 1, 2, 3 })));
        System.out.println(Arrays.toString(DistinctElementsMethod(new int[] { 1, 2 }, new int[] {})));
        System.out.println(Arrays.toString(DistinctElementsMethod(new int[] { 1, 2 }, null)));
        System.out.println(Arrays.toString(DistinctElementsMethod(null, new int[] {})));
        System.out.println(Arrays.toString(DistinctElementsMethod(null, null)));
        System.out.println("new line");
        System.out.println("new line");
        System.out.println(Arrays.toString(DistinctElementsWay(new int[] { 1, 8, 3, 2 }, new int[] { 4, 2, 6, 1 })));
        System.out.println(Arrays.toString(DistinctElementsWay(new int[] { 1, 8, 3, 2, 6 }, new int[] { 2, 6, 1 })));
        System.out.println(Arrays.toString(DistinctElementsWay(new int[] { 1, 3, 7, 9 }, new int[] { 7, 1, 9, 3 })));
        System.out.println(Arrays.toString(DistinctElementsWay(new int[] { 1, 2 }, new int[] { 3, 4 })));
        System.out.println(Arrays.toString(DistinctElementsWay(new int[] {}, new int[] { 1, 2, 3 })));
        System.out.println(Arrays.toString(DistinctElementsWay(new int[] { 1, 2 }, new int[] {})));
        System.out.println(Arrays.toString(DistinctElementsWay(new int[] { 1, 2 }, null)));
        System.out.println(Arrays.toString(DistinctElementsWay(null, new int[] {})));
        System.out.println(Arrays.toString(DistinctElementsWay(null, null)));

    }

}
