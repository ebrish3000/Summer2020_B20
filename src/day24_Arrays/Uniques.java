package day24_Arrays;

import java.util.Scanner;

/*
warmup tasks:
    1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
    2. write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them into an array variable, and then write the program that can return maximum and minimum numbers

 */
public class Uniques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str  = input.next();

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            int  first = str.indexOf(ch);
            int  last = str.lastIndexOf(ch);
            if (first==last){
                unique += ch;

            }
        }
        System.out.println(unique);
        // this method is only finding unique char from the string does not work for unique word.

    }
}
