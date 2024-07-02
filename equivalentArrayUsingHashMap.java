import java.util.HashMap;

public class equivalentArrayUsingHashMap {

    public static int equivalentArrayUsingHashMapMethod(int[] a1, int[] a2) {

        HashMap<Integer, Boolean> memory1 = new HashMap<Integer, Boolean>();
        HashMap<Integer, Boolean> memory2 = new HashMap<Integer, Boolean>();
        int counter1 = 0, counter2 = 0;

        for (int i = 0; i < a1.length; i++) {
            if (!memory1.containsKey(a1[i])) {

                counter1++;

                memory1.put(a1[i], true);

            }
        }

        for (int j = 0; j < a2.length; j++) {
            if (!memory1.containsKey(a2[j])) {
                return 0;
            } else if (!memory2.containsKey(a2[j])) {
                counter2++;

                // you need to update the second map otherwise logic will not work
                memory2.put(a2[j], true);

            }

        }

        if (counter1 != counter2) {
            return 0;
        }

        return 1;

    }

    public static void main(String[] args) {

        System.out.println(equivalentArrayUsingHashMapMethod(new int[] { 0, 1, 2 }, new int[] { 2, 0, 1 }));
        System.out.println(equivalentArrayUsingHashMapMethod(new int[] { 0, 1, 2, 1 }, new int[] { 2, 0, 1 }));
        System.out.println(equivalentArrayUsingHashMapMethod(new int[] { 2, 0, 1 }, new int[] { 0, 1, 2, 1 }));
        System.out
                .println(
                        equivalentArrayUsingHashMapMethod(new int[] { 0, 5, 5, 5, 1, 2, 1 }, new int[] { 5, 2, 0, 1 }));
        System.out
                .println(
                        equivalentArrayUsingHashMapMethod(new int[] { 5, 2, 0, 1 }, new int[] { 0, 5, 5, 5, 1, 2, 1 }));
        System.out.println(equivalentArrayUsingHashMapMethod(new int[] { 0, 2, 1, 2 }, new int[] { 3, 1, 2, 0 }));
        System.out.println(equivalentArrayUsingHashMapMethod(new int[] { 3, 1, 2, 0 }, new int[] { 0, 2, 1, 0 }));
        System.out.println(
                equivalentArrayUsingHashMapMethod(new int[] { 1, 1, 1, 1, 1, 1 }, new int[] { 1, 1, 1, 1, 1, 2 }));
        System.out.println(equivalentArrayUsingHashMapMethod(new int[] {}, new int[] { 3, 1, 1, 1, 1, 2 }));
        System.out.println(equivalentArrayUsingHashMapMethod(new int[] {}, new int[] {}));

    }
}
