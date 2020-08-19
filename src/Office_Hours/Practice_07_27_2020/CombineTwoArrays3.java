package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays3 {
    public static void main(String[] args) {
        String[] a1 = {"Hajar", "Maria", "Dania"};
        String[] a2 = {"Muaz", "Mahi", "Said", "Bilal", "Mahir"};

        String[] a3 = new String[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        for (int j = 0; j < a2.length; j++) {
            a3[j+ a1.length] = a2[j];
        }
        System.out.println(Arrays.toString(a3));

    }
}
