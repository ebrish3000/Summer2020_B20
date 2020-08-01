package day06_ComparisonOperators;

public class ReletinalOperators {
    public static void main(String[] args) {
        boolean r1 =10 > 9;
        System.out.println(r1);

        boolean r2 = 100<9000;
        System.out.println(r2);
        // >=
        boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        // <=
        boolean r5 = 200 <= 300;
        System.out.println(r5);
        //== equal sign for java
        boolean r6 = 900 == 800;
        System.out.println(r6);
        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "abc" == "xyz";
        System.out.println(r8);

        boolean result = 'A' == 65;
        System.out.println(result);

        boolean result2 = 100 == 100.0; // 100 is 100.0
        System.out.println(result2);

        int number =100;
        boolean even = number%2 == 0;
        System.out.println(even);
        boolean odd = number%2 !=0;
        System.out.println(odd);

        int x = 1000; // is divisible by 3
        boolean db3 = x%3 == 0;
        System.out.println(db3);




    }
}
