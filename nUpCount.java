public class nUpCount {

    public static int nUpCountWay(int[] a, int n) {
        if (a == null || a.length == 0) {
            return 0;
        }

        int upCount = 0;
        int partialSum = 0;

        for (int i = 0; i < a.length; i++) {
            int perviousSum = partialSum;
            partialSum += a[i];

            if (perviousSum <= n && partialSum > n) {
                upCount++;
            }
        }

        return upCount;

    }

    public static void main(String[] args) {
        System.out.println(nUpCountWay(new int[] { 2, 3, 1, -6, 8, -3, -1, 2 }, 5));
    }

}
