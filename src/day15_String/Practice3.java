package day15_String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
         /*
    1. write a program that ask user to enter sentence.
		then print out the first and last characters
     */
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your sentence: ");
            String sentence = scan.nextLine();

            int lastIndexNum = sentence.length() -1;

            System.out.println( "" + sentence.charAt(0)  +   sentence.charAt( lastIndexNum )  );
            //                       "J"            +            'n' ==> Jn




        }
}
