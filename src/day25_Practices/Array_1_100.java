package day25_Practices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {
        int[] numbers = new int[20]; // you can put any number > 0
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] =(i+1)*10;
        }
        System.out.println(Arrays.toString(num));

      /*  numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;*/

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

        }
        System.out.println(Arrays.toString(numbers));

        for (int each : numbers) {
            if (each % 2 != 0) {  //even == or odd !=
                continue;
            }
            System.out.print(each+" ");
        }

    }
}
