public class SubstringSearch {

    public static int SubstringSearchMethod(String haystack, String needle) {

        int len_haystack = haystack.length();
        int len_needle = needle.length();

        // hey ="sadbuts,ad", needle="sad" we need to search upto s last two need not to
        // check

        for (int i = 0; i < len_haystack - len_needle + 1; i++) {

            int j = 0;
            int k = i;

            for (; j < len_needle; j++, k++) {
                if (haystack.charAt(k) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == len_needle) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(SubstringSearchMethod("sadbutsad", "sad"));
        System.out.println(SubstringSearchMethod("leetcode", "leeto"));
    }

}
