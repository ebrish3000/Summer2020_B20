package day10_IfStatments;

public class MultiBranch {
    public static void main(String[] args) {
        int number = -3;
        if(number > 0){
            System.out.println(number +" is positive");
        }

        if(number < 0){
            System.out.println(number+ " is negative");
        }

        if(number == 0){
            System.out.println(number + " is zero");
        }

        System.out.println("======================================");
        //efficient way of using if the multi branch if statement.

        if(number > 0){
            System.out.println(number+" is positive");
        }else if(number < 0){
            System.out.println(number+" is negative");
        } else { // number ==0
            System.out.println(number +" is zero");
        }

    }
}
