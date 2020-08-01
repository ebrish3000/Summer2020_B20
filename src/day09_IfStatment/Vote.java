package day09_IfStatment;

public class Vote {
    public static void main(String[] args) {
        int age = 17;
        boolean USCitizen = true;
        if(age>=18 && USCitizen){
            System.out.println("Eligible to vote for Trump.");
        }else {
            System.out.println("not eligible to vote for Trump");

        }
    }
}
