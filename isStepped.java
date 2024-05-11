public class isStepped {

    public static int isSteppedMethod(int[] a) {

        int counter = 1;

        for (int i = 0; i < a.length - 1; i++) {
            int firstElement = a[i];
            if (firstElement == a[i + 1]) {
                counter++;
            } else if (firstElement > a[i + 1]) {
                return 0;
            } else if (firstElement < a[i + 1] && counter < 3) {
                return 0;

            } else if (firstElement < a[i + 1] && counter >= 3) {
                counter = 1;
            }

        }

        if (counter < 3) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {

        System.out.println(isSteppedMethod(new int[] { 1, 1, 1, 5, 5, 5, 5, 8, 8, 8 }));
        System.out.println(isSteppedMethod(new int[] { 1, 1, 5, 5, 5, 5, 8, 8, 8 }));
        System.out.println(isSteppedMethod(new int[] { 5, 5, 5, 5, 15 }));
        System.out.println(isSteppedMethod(new int[] { 3, 3, 3, 2, 2, 5, 5, 5, 5, 5 }));
        System.out.println(isSteppedMethod(new int[] { 3, 3, 3, 2, 2, 2, 1, 1, 1 }));
        System.out.println(isSteppedMethod(new int[] { 1, 1, 1, 1 }));
        System.out.println(isSteppedMethod(new int[] { 1, 1, 1, 1, 1, 1, 1 }));

    }

}
