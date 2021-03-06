package day20_WhileLoops;

import java.util.Scanner;
/*
    3. write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = scan.nextLine();  //"ab"
        //            0123

        String result = ""; // "abcdefghi"

        /*
        for(int i = 0; i <= str.length()-1; i++  ){
              String s =  ""+str.charAt(i); // a, a, b, b
                if( result.contains(s) ){  // if the character is already contained in result, wre will not add it again
                   continue;
                }
                result += s;
        }
    */

        for(int i = 0; i <= str.length()-1; i++  ){

            String s =  ""+str.charAt(i);  //a,  b,  a,  b

            if( !result.contains(s) ){
                result += s;
            }

        }

        System.out.println(result);


    }
}
