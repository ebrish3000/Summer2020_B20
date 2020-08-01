package day09_IfStatment;

public class Minimum {
    public static void main(String[] args) {
        double a = 1000;
        double b = 200;
        double c = 300;

        boolean aIsMin = a<b && a<c;
        boolean bIsMin = !aIsMin && b<c;

        boolean cIsMin = !aIsMin && !bIsMin;

        double min = 0; // We want to assign the minimum number to variable min.

        if(aIsMin){
            min = a;}
        if(bIsMin){
            min = b;}
        if(cIsMin){
            min=c;}
        System.out.println(min + " the minimum number.");


    }
}
