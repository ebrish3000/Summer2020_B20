package day33_LocalDateTime;

import java.util.Arrays;

/*
Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order
 */
public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5};
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

       /* arr2[0] = arr[arr.length - 1];
        arr2[1] = arr[arr.length - 2];
        arr2[2] = arr[arr.length - 3];
        arr2[3] = arr[arr.length - 4];
        arr2[4] = arr[arr.length - 5];*/

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }


    }

    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];


        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static double[] sortDescending(double[] arr) {
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static String[] sortDescending(String[] arr) {
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];


        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static char[] sortDescending(char[] arr) {
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];


        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }


}
