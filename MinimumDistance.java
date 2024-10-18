public class MinimumDistance {

    public static int MinimumDistanceMethod(int n) {

        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }

        int previousFactor = -1;
        int minDistance = n + 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (previousFactor != -1) {
                    int distance = i - previousFactor;
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
                previousFactor = i;
            }

        }
        return minDistance;

    }

    public static void main(String[] args) {
        System.out.println(MinimumDistanceMethod(13013));
        System.out.println(MinimumDistanceMethod(8));
    }

}
