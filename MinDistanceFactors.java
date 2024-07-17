public class MinDistanceFactors {

    public static int MinDistanceFactorsMethod(int n) {

        if (n <= 0) {
            return 0;
        }

        int[] factorsArray = new int[n];
        int factorsCounter = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factorsArray[factorsCounter++] = i;

                // checking if duplicate square number not added
                if (i != n / i) {
                    factorsArray[factorsCounter++] = n / i;
                }
            }

        }

        // bubble sort to sort array
        for (int i = 0; i < factorsCounter - 1; i++) {
            for (int j = 0; j < factorsCounter - 1 - i; j++) {
                if (factorsArray[j] > factorsArray[j + 1]) {
                    int temp = factorsArray[j];
                    factorsArray[j] = factorsArray[j + 1];
                    factorsArray[j + 1] = temp;

                }
            }
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < factorsCounter; i++) {
            int distance = factorsArray[i] - factorsArray[i - 1];

            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance;

    }

    public static void main(String[] args) {
        System.out.println(MinDistanceFactorsMethod(13013));
        System.out.println(MinDistanceFactorsMethod(8));
    }

}
