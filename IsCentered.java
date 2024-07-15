public class IsCentered {

    public static int IsCenteredMethod(int[] arr) {

        if (arr == null) {
            return 0;
        }

        int length = arr.length;

        if (length % 2 == 0 || length == 0) {
            return 0;

        }

        int middleIndex = length / 2;
        int middleElement = arr[middleIndex];

        for (int i = 0; i < length; i++) {
            if (i != middleIndex && arr[i] <= middleElement) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(IsCenteredMethod(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(IsCenteredMethod(new int[] { 3, 2, 1, 4, 5 }));
        System.out.println(IsCenteredMethod(new int[] { 3, 2, 1, 4, 1 }));
        System.out.println(IsCenteredMethod(new int[] { 1, 2, 3, 4 }));
        System.out.println(IsCenteredMethod(new int[] {}));
        System.out.println(IsCenteredMethod(new int[] { 10 }));

    }

}
