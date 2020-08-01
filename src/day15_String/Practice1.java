package day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next(); // Ebrahim
        char ch1 = firstName.charAt(0);
        System.out.println("Enter your last name");
        String lastName = input.next(); //Hasen
        char ch2 = lastName.charAt(0);
        System.out.println("Your initial is: "+ch1 + ch2);

        //length() ==> int
        int l = firstName.length();
        System.out.println(l);





    }
}
