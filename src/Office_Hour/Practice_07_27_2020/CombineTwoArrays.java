package Office_Hour.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        char[] a1 = {'A', 'B', 'C'};
        char[] a2 = {'D', 'E', 'F', 'H', 65, 390, 3, 50, 64};

        char[] a3 = new char[a1.length + a2.length];
        int i = 0;
        for (char each : a1) {
           a3[i] =each;
           i++;
        }
        for (char each : a2) {
            a3[i] =each;
            i++;
        }


        System.out.println(Arrays.toString(a3));
    }
}
