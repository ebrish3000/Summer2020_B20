package day18_For_Loop;
/*
07/01/2020
Topics: For loop
package name: day18_ForLoop
Warmup tasks
1. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method
2. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
3. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
come back at: 8:15
Canvas -> Java -> modules -> day18 -> String short quiz
due by 8:35pm
loops: repeated statement
for loop: only gets executed if the condition is true
          stops when condition is false

        for(initialization; Condition; Iterator ){
                statements;
        }
        initialization: starting point
                    int i = 0;
        condition: ending point, based on initialization
                i == 0;
                i < 100;
                ...
        Iterator: Co-related to the condition. MUST be capable enough to make the condition false
        tasks:
            1. write a program that can print all even numbers between 0 ~ 1000
            2. write a program that can print all odd numbers between 0 ~ 1000
            3. write a program that can print a~z
            4. write a program that can print A~Z
 */
public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++){
            System.out.println("My name is Ebrahim");
        }
        System.out.println("===========================");
        for (int i=1; i<=20; i+=2){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("hello world");

        System.out.println("====================================");

        for (int i = 100; i>= 1; i-=10){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Ebrahim");

    }
}
