package day08_LogicalOperators;

public class ifStatement {
    public static void main(String[] args) {
        int a = 20;
        int b = 200;

        if(a > b){System.out.println(a+ " is the maximum number");
        }
        if(b > a){
            System.out.println(b+ " is the maximum number");
        }
        if (a==b) {
            System.out.println("Both are equal");
        }
        System.out.println("==============================");
        boolean BreakTime = true;
        if(BreakTime){
            System.out.println("Take 15 min break");
            if(BreakTime == false){
                System.out.println("Keep studying");
            }
            System.out.println("=================");


        }

    }
}
