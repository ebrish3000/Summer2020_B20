package day08_LogicalOperators;

public class Logical {
    public static void main(String[] args) {
        // !: opposite boolean
        boolean r1 = 9>7; // T
        boolean r2 = !r1; // F
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(!false);

        boolean r3 = !false == true; // true
        System.out.println(r3);

        boolean r5 = 9 > 5 && 9> 10;
           // true && false in and logic both has to be true to be true
            // so this is false ( and means both)
            //  ||: or logic
        boolean r8 = true == ! false || false == true;
        System.out.println(r8); // one or both true is will give us true.



    }
}
