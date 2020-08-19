package day29_CustomMetodes;
/*
task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 0~100
 */
public class Method_Practice {

    public static void main(String[] args) {

        OddNumbers();
        evenNumbers();
        System.out.println("Hello");
        OddNumbers();
        evenNumbers();
    }

        public static void OddNumbers(){
            for (int i = 1; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    public static void evenNumbers(){
        for (int i = 0; i <= 100; i += 2) {
           // System.out.print(i + " ");
        }
        System.out.println();
    }

    }

