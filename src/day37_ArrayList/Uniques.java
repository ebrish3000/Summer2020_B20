package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str = "AAAABBCDDEF";
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
