package Office_Hour.Practice_06_17_2020;

public class Post_VS_Pre {
    public static void main(String[] args) {
    int a = 300;
        System.out.println(++a);// a=301 pre increment
        System.out.println(++a);// a= 302
        int b = 50;
        System.out.println(--b); // b=49 pre decrement
        System.out.println(--b); // b = 48

        System.out.println("=========================");
        int x = 40;
        System.out.println(x--);//print 40 but the x value for next time will be 39.
        System.out.println(x--);// 39 the value will be 38 from now.
        System.out.println(x); // 38 (this is post decrement)

        int y = 60;
        System.out.println(y++); // print 60 (this is post increment)
        System.out.println(y); // 61
        System.out.println(y++); // print 61
        System.out.println(y); // 62




    }
}
