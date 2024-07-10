public class RemoveDuplicateItems {

    public static int RemoveDuplicateItemsMethod(int[] arr) {

        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;

            }

        }
        return k;

    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicateItemsMethod(new int[] { 1, 1, 2, 4, 6, 6, 7 }));
        System.out.println(RemoveDuplicateItemsMethod(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));

    }

}
