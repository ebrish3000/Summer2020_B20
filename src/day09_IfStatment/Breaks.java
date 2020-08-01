package day09_IfStatment;

public class Breaks {
    public static void main(String[] args) {
        String itIsBreakTime = "yes";
        if (itIsBreakTime=="yes"){
            System.out.println("Take 15 minutes of break.");}
        else {
            System.out.println("Continue the class.");}

        System.out.println("==================================");
        int a = 1000;
        int b = 700;
        if(a>b){
            System.out.println(a+ " is greater number.");
        }
        else{
            System.out.println(b + " is greater.");
        }

    }
}
