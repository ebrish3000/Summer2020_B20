package day19_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = scan.nextLine();

        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){

            reverse += str.charAt(i);

        }
        System.out.println(reverse);

       /* String reversedStr = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            reversedStr += str.charAt(i);
          //  reversedStr += str.substring(i, i+1);

        }

        System.out.println(reversedStr);

       System.out.println( str.equalsIgnoreCase(reversedStr) );*/



    }
}
