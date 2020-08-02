package day23_Arrays;

import java.util.Scanner;

/*
warm up tasks:
    1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers.
    then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
         but while the answer is not a valid answer (not yes or no),
         the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop     */
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {


            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 + num2;
            System.out.println(result);

            System.out.println("Do you want to continue?");
            String a = input.next().toLowerCase();// one option of dropping case sensitivity

            while (!(a.equals("yes")||a.equals("no"))) {
                System.out.println("Invalid answer, please enter yes or no");
                a = input.next().toLowerCase();
            }

            if (a.equalsIgnoreCase("no")){
                break;
            }

        }



    }
}