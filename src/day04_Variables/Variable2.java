package day04_Variables;

public class Variable2 {
    public static void main(String[] args) {
        char ch1 = 'A'; // use single semicolon and char is only for a character
              // you can use the character or the number assigned for thr letter on the ASCII table.

        char ch2 = 65; // 65 is 'A' on ASCII table

        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 872;
        char ch4 = 56879;

        System.out.println(ch3);
        System.out.println(ch4);

        char ch5 = 200+1000;// it looks for 1200
        System.out.println(ch5);

        char c1 = 'A' + 2;
        System.out.println(c1);

        int n1 = 'A' + 10; // 65 which is 'A' + 10 = 75
        System.out.println(n1);

        char c2 = '@';
        System.out.println(c2);
        System.out.println('@' + 89); // is going to give you number value of @ + 89
    }
}
