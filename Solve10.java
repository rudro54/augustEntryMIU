public class Solve10 {

    // Method to compute factorials from 0! to 10!
    public static long[] computeFactorials() {
        long[] factorials = new long[10];
        factorials[0] = 1; // 0! = 1
        for (int i = 1; i < 10; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
        return factorials;
    }

    // Method to find the two numbers whose factorials sum to 10!
    public static long[] solve10Method() {
        long[] factorials = computeFactorials();
        long target = factorials[9]; // 10! = 3628800

        // Loop through all possible x and y
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (target == factorials[x] + factorials[y]) {
                    // Return the pair (x, y) whose factorials sum to 10!
                    return new long[] { x, y };
                }
            }
        }

        // If no pair is found, return an error indicator
        return new long[] { -1, -1 };
    }

    public static void main(String[] args) {
        long[] result = solve10Method();
        if (result[0] != -1) {
            System.out.println("x = " + result[0] + ", y = " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
