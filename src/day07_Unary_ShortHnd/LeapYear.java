package day07_Unary_ShortHnd;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2017;
        boolean result = year % 4 == 0;

        System.out.println("Year "+ year + " is a leap year: " + result);
    }
}
