public class VesuvianNumber {

    public static int isVesuvian(int n) {

        int pairCount = 0;

        for (int a = 0; a * a < n; a++) {
            int aSquared = a * a;
            int bSquared = n - aSquared;

            // Check for valid b values manually without using Math.sqrt
            for (int b = 0; b * b <= bSquared; b++) {
                if (b * b == bSquared) {
                    pairCount++;
                    // As soon as we find two pairs, return 1
                    if (pairCount == 2) {
                        return 1;
                    }
                }
            }
        }

        return 0; // Return 0 if fewer than two unique pairs were found
    }

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));

    }

}
