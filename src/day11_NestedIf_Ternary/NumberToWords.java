package day11_NestedIf_Ternary;

public class NumberToWords {
    public static void main(String[] args) {
        int num = 9;

        String result = "";


        if(num ==0){
            result = "zero";
        } else if(num ==1){
            result = "one";
        } else if(num ==2){
            result = "two";
        } else if(num == 3){
            result = "three";
        } else if(num ==4){
            result = "four";
        } else if(num == 5){
            result = "five";
        } else if(num == 6){
            result = "six";
        } else if(num==7){
            result = "seven";
        }else if(num==8){
            result = "eight";
        }else if (num ==9){
            result = "nine";
        } else { // (num < 0 || num > 9)
            result = "invalid";
        }

        System.out.println(result);
        System.out.println("==========================================");
        String result1 = (num==0) ? "Zero" : (num==1)? "One" : (num==2)? "Two":(num==3) ? "Three" : (num==4)? "Four" : (num==5)? "Five":(num==6) ? "Six" : (num==7)? "Seven" : (num==8)? "Eight": (num==9)? "Nine": "Invalid";
        System.out.println(result1);


    }
}
