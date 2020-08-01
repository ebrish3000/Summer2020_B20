package day15_String;

public class String_Method {
    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             01234567

        // charAt(index):
        char ch1 = name.charAt(0); //'C'
        char ch2 = name.charAt(5); //'t'
        System.out.println(ch1);
        System.out.println(ch2);

        // length() ==> int
        int l =   name.length();
        System.out.println(l);

        // last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(Str): concatenation
        String schoolName = "Cybertek";

        schoolName = schoolName.concat(" School");   //"Cybertek School"

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 +'A';   //123
        System.out.println(r1);
        System.out.println("*********************");

        String r2 = "Cybertek".concat("123");
        System.out.println(r2);

        //toLowercase():
        String name1 = "CYBERTEK SCHOOL";
             name1= name1.toLowerCase();   // "cybertec school
        System.out.println(name1);

        //toUppercase(): changes to upper case
        String name2 = "EBRAHIM Hasen";
        name2= name2.toUpperCase();   // "EBRAHIM HASEN
        System.out.println(name2);
         //trim(): Removes the unused space not between the words.
        String p = "     Cybertek      School   ";
       p=  p.trim(); //"Cybertek      School"

        System.out.println(p);










    }
}
