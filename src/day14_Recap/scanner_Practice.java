package day14_Recap;

import java.util.Scanner;
/*task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
public class scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = input.next();
        System.out.println("Enter your age");
        int age = input.nextInt();
                  input.nextLine();
        System.out.println("Country name");
        String countryName = input.nextLine();
        System.out.println("Enter zip code");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your company name");
        String companyName = input.nextLine();

        System.out.println(fullName+ " works at ");






    }
}
