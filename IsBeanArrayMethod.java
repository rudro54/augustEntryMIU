public class IsBeanArrayMethod {

    public static int isBeanArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && (Math.abs(a[i] - a[j]) == 1 || a[i] == a[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        int[] array1 = { 2, 10, 9, 3 }; // Bean array
        int[] array2 = { 2, 2, 3, 3, 3 }; // Bean array
        int[] array3 = { 1, 2, 3, 4, 5 }; // Bean array
        int[] array4 = { 1, 3, 5, 7 }; // Not a bean array

        System.out.println(isBeanArray(array1)); // Output: 1
        System.out.println(isBeanArray(array2)); // Output: 1
        System.out.println(isBeanArray(array3)); // Output: 1
        System.out.println(isBeanArray(array4)); // Output: 0

    }

}
