public class IsFibonacciMethod {

    public static int IsFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        int a = 1;
        int b = 1;

        if (n == 1) {
            return 1;
        }

        int nextFibo = a + b;

        while (nextFibo <= n) {
            if (nextFibo == n) {
                return 1;
            }

            a = b;
            b = nextFibo;
            nextFibo = a + b;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(IsFibonacci(8));
        System.out.println(IsFibonacci(6));
    }

}
