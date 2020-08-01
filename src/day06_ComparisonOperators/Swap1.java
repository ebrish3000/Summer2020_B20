package day06_ComparisonOperators;

public class Swap1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 15;

        int c = b; // c=15
        b=a;
        a=c;
        System.out.println(a); //15
        System.out.println(b); //10
        /* this is using temporary variable
        but the question says with out
        we will do that on class swap2
        */

    }
}
