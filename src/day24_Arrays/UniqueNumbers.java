package day24_Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3,10,9, 3};

        for (int j = 0; j < arr.length; j++) {

            int num1 = arr[j];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                int each = arr[i];
                if (each == num1) {
                    count+=1;
                }
            }
            if (count ==1) {
                System.out.print(num1 + " ");
            }

        }


    }
}
