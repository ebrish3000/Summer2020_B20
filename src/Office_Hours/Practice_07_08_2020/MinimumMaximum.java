package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        int max =  -2147483648;

        for(int i = 0; i < 5 ; i++ ){

            System.out.println("Enter a number");
            int n = scan.nextInt(); // 5  4  6  3  1

            if( n < min ){
                min = n ;
            }

            if(n > max){
                max=n;
            }

        }

        System.out.println("min: "+min);
        System.out.println("max: "+max);




    }
}