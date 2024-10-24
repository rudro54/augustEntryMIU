public class LayeredArray {

    public static int isLayered(int[] a) {

        if (a.length < 2) {
            return 0;
        }

        int counter = 1;

        for (int i = 1; i < a.length; i++) {

            if (a[i] < a[i - 1]) {
                return 0;
            }

            if (a[i] == a[i - 1]) {
                counter++;
            } else {
                if (counter < 2) {
                    return 0;
                }
                counter = 1;
            }

        }

        if (counter < 2) {
            return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isLayered(new int[] { 1, 1, 2, 2, 2, 3, 3 }));
        System.out.println(isLayered(new int[] { 3, 3, 3, 3, 3, 3, 3 }));
        System.out.println(isLayered(new int[] { 1, 2, 2, 2, 3, 3 }));
        System.out.println(isLayered(new int[] { 2, 2, 2, 3, 3, 1, 1, }));
        System.out.println(isLayered(new int[] { 2 }));
        System.out.println(isLayered(new int[] {}));
    }

}
