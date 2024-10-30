import java.util.Arrays;

public class HMS {

    public static int[] computeHMS(int seconds) {

        int[] hms = new int[3];

        hms[0] = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        hms[1] = remainingSeconds / 60;
        hms[2] = remainingSeconds % 60;

        return hms;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

}
