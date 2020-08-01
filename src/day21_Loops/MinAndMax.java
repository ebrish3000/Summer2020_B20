package day21_Loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        int min = 2147483647;
        for (int i = 10; i<=50; i+=10){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }


        }
        System.out.println(max+ " is the maximum number.");
        System.out.println(min+ " is the minimum number.");


    }
}
