package Office_Hour.Practice_07_13_2020;

public class FrequencyOfChars1 {
    public static void main(String[] args) {


        String str = "HAJAREBRAHIM";
        String nonDup = "";

        // Remove duplicates:
        for(int i =0; i <= str.length()-1; i++ ){
            String s = ""+str.charAt(i);
            if( ! nonDup.contains(s)){ // if the character is not already exist then we concat it to the nonDup
                nonDup += s;
            }
        }
       // System.out.println(nonDup);
        String result = "";  //  to assign frequency of characters next to each character

        /*
       char ch1 = nonDup.charAt(0);  // O
        int count1 = 0; //1+1=2
        for(int i = 0; i <= str.length()-1; i++){ // counting the frequnecy of ch
           char each = str.charAt(i);   // O  O  P  Q  Q
            if(each == ch1){
                count1 += 1;
            }
        }
        result +=  ""+ch1+count1;
        char ch2 = nonDup.charAt(1); // p
        int count2 = 0; //1
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);  //   O  O  P  Q  Q
            if(each == ch2){
                count2 +=1;
            }
        }
        result += ""+ch2+count2;
       char ch3 = nonDup.charAt(2); // Q
        int count3 = 0;
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);
            if(each == ch3){
                count3++;
            }
        }
        result += ""+ch3+count3;
*/

        for(int j = 0; j <= nonDup.length()-1; j++){

            char ch1 = nonDup.charAt(j);  // O  P  Q
            int count1 = 0;
            for(int i = 0; i <= str.length()-1; i++){ // counting the frequency of ch
                char each = str.charAt(i);   // all cases are printed
                if(each == ch1){
                    count1 += 1;
                }
            }
            result +=  ""+ch1+count1;

        }

        System.out.println(result);


    }
}
