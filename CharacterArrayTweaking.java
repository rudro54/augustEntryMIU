public class CharacterArrayTweaking {

    public static char[] f(char[] a, int start, int len) {

        if (a == null || start < 0 || len < 0 || start + len > a.length) {
            return null;
        }

        char[] result = new char[len];

        for (int i = 0; i < len; i++) {
            result[i] = a[start + i];
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 0, 4)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 0, 3)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 0, 2)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 0, 1)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 1, 3)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 1, 2)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 1, 1)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 2, 2)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 2, 1)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 3, 1)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, 1, 0)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, -1, 2)));
        System.out.println(java.util.Arrays.toString(f(new char[] { 'a', 'b', 'c' }, -1, -2)));
        System.out.println(java.util.Arrays.toString(f(new char[] {}, 0, 1)));

    }

}
