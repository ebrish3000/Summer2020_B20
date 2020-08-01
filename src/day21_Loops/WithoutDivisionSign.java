package day21_Loops;
/*
 3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
 */
public class WithoutDivisionSign {
    public static void main(String[] args) {
        int a = 20; //2
        int b = 3;

        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }


        int count = 0; //3

        while(a >= b){
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);
    }
}
