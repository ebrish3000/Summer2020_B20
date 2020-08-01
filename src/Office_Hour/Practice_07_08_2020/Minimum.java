package Office_Hour.Practice_07_08_2020;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;

        for (int i =1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();
            if (n< min){
                min = n;
            }
            System.out.println("The minimum number is: " +min);
        }
        System.out.println("The minimum number is: " +min);

       /* int j = 1;
        while (j<=5){

            System.out.println("Enter a number");
            int n = scan.nextInt();
            if (n> max){
                max = n;

            }
            j++;

        }
        System.out.println("The maximum number is: " +max);
        */
    }
}
