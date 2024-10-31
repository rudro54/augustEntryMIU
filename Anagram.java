public class Anagram {

    public static int areAnagrams(char[] a1, char[] a2) {

        if (a1.length != a2.length) {
            return 0;
        }

        int[] frequency = new int[52];

        for (char num : a1) {

            if (num >= 'A' && num <= 'Z') {
                frequency[num - 'A']++;
            }
            if (num >= 'a' && num <= 'z') {
                frequency[num - 'a' + 26]++;
            }

        }

        for (char num : a2) {

            if (num >= 'A' && num <= 'Z') {
                frequency[num - 'A']--;
            }
            if (num >= 'a' && num <= 'z') {
                frequency[num - 'a' + 26]--;
            }

        }

        for (int count : frequency) {
            if (count != 0) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[] { 's', 'i', 't' }, new char[] { 'i', 't', 's' }));
        System.out.println(areAnagrams(new char[] { 's', 'i', 't' }, new char[] { 'i', 'd', 's' }));
        System.out.println(areAnagrams(new char[] { 's', 'i', 'g' }, new char[] { 'b', 'i', 't' }));
        System.out.println(areAnagrams(new char[] { 'b', 'o', 'g' }, new char[] { 'b', 'o', 'o' }));
        System.out.println(areAnagrams(new char[] {}, new char[] {}));
        System.out.println(areAnagrams(new char[] { 'b', 'i', 'g' }, new char[] { 'b', 'i', 'g' }));
        System.out.println(areAnagrams(new char[] { 'P', 'i', 't' }, new char[] { 'P', 't', 'i' }));

    }

}
