package day07_Unary_ShortHnd;

public class ShortHand {
    public static void main(String[] args) {
       int a = 100; // what is a*a by shorthand calculation
        // a= a*a;
        a *= a;
        System.out.println(a); // will be 10000
        int b = 2;
        b *= 3;
        System.out.println(b);
        int c =300;
        c -= 100;
        System.out.println(c);

        System.out.println("===================");
        // +=; we use this most of the time in future
        int z = 300;
        z += 200; // z= z+200
        System.out.println(z);
        String schoolName = "Cybertek";
            // schoolName = schoolName+ " School";
        schoolName += " School";
        System.out.println(schoolName);
        System.out.println("=====================");

        String fullName = "Ebrahim";
                  fullName += "Emam";
        System.out.println(fullName);
        String myCommunity = "EMAS";
                myCommunity += " is very close to my house.";
        System.out.println(myCommunity); // this only works for shorthund += (only) with the text the rest only works with number
        System.out.println("===================");
        //    /= : division assignment
        int  budget = 100000;
        budget /= 2;
        System.out.println(budget);

        int q = 100;
        System.out.println(q/2);  // 50
        System.out.println(q); // 100  // but if we use division assignment to assign the number we use /=
        // %= finds the remainder and assigns
        int d = 10;
        d %= 2;
        System.out.println(d);
        double d2 = 400.5;
              d2 %= 2;
        System.out.println(d2);
        System.out.println(10/3.0);

    }
}
