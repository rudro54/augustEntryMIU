public class BrownianNumber {

    public static int isBrownian(int n) {

        int counter = 1;

        int temp = n;

        while (temp > 0) {
            temp /= 10;
            counter *= 10;
        }

        int square = n * n;

        if (n == square % counter) {
            return 1;
        }

        return 0;

    }

    public static int isBrownianMethod(int n) {
        int counter = 1;
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            counter *= 10;
        }
        int square = n * n;
        if (n == square % counter) {
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isBrownian(1));
        System.out.println(isBrownian(5));
        System.out.println(isBrownian(25));
        System.out.println(isBrownian(76));
        System.out.println(isBrownian(376));
        System.out.println(isBrownian(16));
        System.out.println(isBrownian(18));
        System.out.println("new line");
        System.out.println(isBrownianMethod(1));
        System.out.println(isBrownianMethod(5));
        System.out.println(isBrownianMethod(25));
        System.out.println(isBrownianMethod(76));
        System.out.println(isBrownianMethod(376));
        System.out.println(isBrownianMethod(16));
        System.out.println(isBrownianMethod(18));

    }

}
