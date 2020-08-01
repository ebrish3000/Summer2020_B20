package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();
        System.out.println("Enter a repeated word");
        String word = scan.next();
        int l = word.length();
        // (0,3)
        int count = 0;
        for (int i = 0; i<=str.length()-l; i++) {
            String s = str.substring(i, i + l);
            if (s.equalsIgnoreCase(word)) {
                count++;
            }

        }
        System.out.println(count);
    }
}
