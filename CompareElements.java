public class CompareElements {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        CompareElements ce = new CompareElements();

        // ce.compareElements(arr);
        ce.findPairs(arr);

    }

    public void compareElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    // Compare arr[i] with arr[j]
                    System.out.println(arr[i] + " compared with " + arr[j]);
                }
            }
        }
    }

    public void findPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Check if arr[i] and arr[j] satisfy a condition
                if ((arr[i] + arr[j]) % 2 == 0) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }

}
