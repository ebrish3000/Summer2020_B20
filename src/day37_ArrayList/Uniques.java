package day37_ArrayList;
/*
 task 01. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D
 */
import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str = "EBRAHIMHASENEMAMHAJARDANIASAMIRA";
        String unique = "";

        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")) {
            list.add(each);
        }

        for (String each: list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                unique +=each;
            }
        }
        System.out.println(unique);
    }
}
