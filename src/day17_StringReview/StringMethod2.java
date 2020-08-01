package day17_StringReview;

public class StringMethod2 {
    public static void main(String[] args) {
          //     String methods:  contains,  ends, starts
            String s1 = "Cat";  // String pool
            String s2 = new String("Cat"); // heap
            String s3 =  new String("Cat");

            //equals: case sensitive
            System.out.println("1. " +s1 == s2); // false
            System.out.println("2. "+ s1.equals(s3) );  // true

            System.out.println("3. "+s2 == s3);  // false
            System.out.println("4. "+ s2.equals(s3) );  // true

            // equalsIgnoreCase: ignore case sensitivity
            String s4 = "java";
            String s5 = "Java";

            System.out.println("5. " +s4.equals(s5));  // false
            System.out.println("6. " +s4 == s5);  // false

            System.out.println("7. "+s4.equalsIgnoreCase(s5));  // true

            String s6 = "MuHtAr";
            String s7 = "muhtar";

            System.out.println("8. "+ s6.equalsIgnoreCase(s7)); // true
            System.out.println("9. " + s6.equals(s7)); //false


            // isEmpty: checks if the length of string is 0
            String str = "  ";

            System.out.println("10. " +str.isEmpty()); // false

            str = str.trim(); //""

            System.out.println("11. "+str.isEmpty());  // true

            String str2 = "Cybertek"; // lenth != 0
            System.out.println("12. "+ str2.isEmpty() ); // false

            str2 = ""; // length ==0
            System.out.println("13. "+ str2.isEmpty() );

            // contains: included or not

            String str3 = "Java, C#, Python, Ruby, C++";

            System.out.println("14. "+  str3.contains("Java") ); // true
            System.out.println("15. "+str3.contains("java")); // false

            //  System.out.println( str3.toLowerCase().contains("java")); // true

            String str4 = "DABC";

            System.out.println("17. "+str4.contains("D"));

            // startsWith & endsWith:

            String str5 = "Cybertek School";

            System.out.println(str5.startsWith("E")  || str5.startsWith("C"));
            //                  false     ||  true ==> true

            System.out.println("18. "+str5.startsWith("CybABC")); // false

            String str6 = "Today is a great day";

            System.out.println("19. "+ str6.endsWith("day"));  // true

            System.out.println("20. "+str6.endsWith("great")); // false




        }
}
