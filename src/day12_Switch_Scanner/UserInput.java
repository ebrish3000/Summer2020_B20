package day12_Switch_Scanner;
import java.util.Scanner; // import specific class
//import java.util.*; // Imports  everything from the java util
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your number");
             //int num1 = input.nextInt();
        //long num2 = input.nextLong();
        double num3 = input.nextDouble();
        System.out.println("you entered: " +num3);
    }

}
