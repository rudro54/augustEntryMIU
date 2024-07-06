public class MadhabArray {

    public static int MadhabArrayMethod(int[] arr) {

        int n = 0;

        while (n * (n + 1) / 2 < arr.length) {
            n++;
        }

        if (n * (n + 1) / 2 != arr.length) {
            return 0;
        }

        int index = 1;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += arr[index++];
            }
            if (sum != arr[0]) {
                return 0;
            }
        }
        return 1;

    }

    public static void main(String[] args) {

        System.out.println(MadhabArrayMethod(new int[] { 2, 1, 1 }));
        System.out.println(MadhabArrayMethod(new int[] { 2, 1, 1, 4, -1, -1 }));
        System.out.println(MadhabArrayMethod(new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 }));
        System.out.println(MadhabArrayMethod(new int[] { 18, 9, 10, 6, 6, 6 }));
        System.out.println(MadhabArrayMethod(new int[] { 6, -3, -3, 8, -5, -4 }));
        System.out.println(MadhabArrayMethod(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 }));
        System.out.println(MadhabArrayMethod(new int[] { 3, 1, 2, 3, 0 }));
    }

}
