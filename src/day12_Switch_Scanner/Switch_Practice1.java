package day12_Switch_Scanner;
 /*
    write a program to display days
    1 - monday
    2 - tuesday
    3 - wednesday
    4 - thursday
    5- friday
    6 - saturday
    7- sunday
     */

public class Switch_Practice1 {
    public static void main(String[] args) {
        long c = 10; // 10L       no long, float, double and boolean in switch
        float f = 10;  //10.0f
        double d = 10; // 10.0


        int num = 1;
        String result = "";
        String value = "";

        switch(num){
            case 1:
                result = "Monday";
                value="5";
                value= "12";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid";
            case 12:

        }

        System.out.println(result);
        System.out.println(value);


    }
}
