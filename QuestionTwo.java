public class QuestionTwo {

    public static int isBrownian(int n) {

        int counter = 1;
        int temp = n;

        while (temp > 0) {
            temp = temp / 10;
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

    }

}
