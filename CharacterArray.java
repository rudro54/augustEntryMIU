public class CharacterArray {

    public static char[] CharacterArrayMethod(char[] arr, int start, int length) {

        if (arr == null || start < 0 || length < 0 || start + length > arr.length) {
            return null;
        }

        char[] resultArray = new char[length];

        for (int i = 0; i < length; i++) {
            resultArray[i] = arr[start + i];
        }

        return resultArray;

    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 0, 4)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 0, 3)));

        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 0, 2)));

        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 0, 1)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 1, 3)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 1, 2)));

        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 1, 1)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 2, 2)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 2, 1)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 3, 1)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, 1, 0)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, -1, 2)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] { 'a', 'b', 'c' }, -1, -2)));
        System.out.println(java.util.Arrays.toString(CharacterArrayMethod(new char[] {}, 0, 1)));

    }
}
