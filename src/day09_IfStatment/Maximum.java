package day09_IfStatment;
/* warm up tasks:
     1. write a java program that accepts three numbers and return the maximum number
    2. write a java program that accepts three numbers and return the minimum number
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)*/
public class Maximum {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax = a>b && a>c;
        boolean bIsMax = b>c && b>a;
        //boolean cIsMax = c>b && c>a; // or
        boolean cIsMax = !aIsMax && !bIsMax; // the same with !(aIsMax && bIsMax)

        double max = -10; // We want to assign the maximum number to variable max.

        if(aIsMax){ //System.out.println(a);
        max = a;}
        if(bIsMax){ //System.out.println(b);
        max = b;}
        if(cIsMax){//System.out.println(c);
        max=c;}
        System.out.println(max + " the maximum number.");


    }
}
