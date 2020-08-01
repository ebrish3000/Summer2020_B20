package day07_Unary_ShortHnd;

public class Unary {
    public static void main(String[] args) {
        System.out.println(-1 + -10);
        System.out.println(-11 - -10);

        int a = 20;
        // a = a-1; //19 -- this sign is called decrement which decreases 1 from the value.
        --a;
        System.out.println(a);

        int b = 10; // b= b+1 // using increment ++
        ++b;
        System.out.println(b); // two type of increment and decrement // pre and post the above is pre which is before the variable.
        // post place the increment or decrement value after the variable the difference is performance
        // pre is immediately post is eventually.
        // post a-- or a++
        int c = 100;
        c++;
        c--;
        System.out.println(c);
    }
}
