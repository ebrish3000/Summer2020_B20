package Office_Hour.Practice_07_07_2020;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String result = "";

        for(int i = 0; i<= str.length()-1; i++){

            String s = "" +str.charAt(i); // s: e ,m, a, m

            if (result.contains(s)){
                continue;
            }else {
                result+=s;
            }

        }
        System.out.println(result);

        
    }
}
