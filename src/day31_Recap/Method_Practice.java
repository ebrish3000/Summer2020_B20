package day31_Recap;

public class Method_Practice {
    public static void main(String[] args) {
        max(10, 20);
        System.out.println(max2(40, 50));
    }

    public static void max(int a, int b) {
        int max = a>b ? a:b;
        System.out.println(max);
    }

    public static int max2(int a, int b) {
        int max2 = a>b ? a:b;
        return max2;
    }



}
