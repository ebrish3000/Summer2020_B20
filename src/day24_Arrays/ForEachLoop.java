package day24_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2, -3};
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("============================");

        for (int each: arr){
            System.out.print(each + " ");
        }


    }

}
