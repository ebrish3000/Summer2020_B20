package day23_Arrays;
/*
int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array
 */
public class MaxMin {
    public static void main(String[] args) {

        int [] arr = {5000, -2, 654332, -10548, -200, 3000, -345, 500};

         int max = arr[6];
        int min = arr[5];
       for (int i = 0; i < arr.length; i++){

                if (arr[i]>max){
                    max = arr[i];

                if (arr[i]<min){
                    min = arr[i];
                }
            }

        }


        for (int i =1; i<= arr.length-1; i++) {
           if (arr[i] > max) { // compares the array, and assign the maximum number to the variable max.
              max = arr[i];}
            if (arr[i] < min) { // compares the array, and assign the minimum number to the variable min.
                    min = arr[i];
                }



        }
       System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min );
    }
}
