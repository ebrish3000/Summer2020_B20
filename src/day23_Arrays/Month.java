package day23_Arrays;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] months = {"Jan", "Feb", "March", "April","May", "June","July", "August","Sep", "Nov", "Dec"};

        System.out.println("Enter a number between 1 and 12");
        int n = scan.nextInt();
        System.out.println(months [n-1] );

    }
}
