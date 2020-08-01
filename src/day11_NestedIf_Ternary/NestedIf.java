package day11_NestedIf_Ternary;
/*
            90 ~ 100 ==> A
            80 ~ 89 ==> B
            70 ~ 79 ==> C
            60 ~ 69 ==> D
            0 ~ 59 ==> F
            other ==> Invalid
 */
public class NestedIf {
    public static void main(String[] args) {
        int score  = 100;
        String result = "";

        if(score >=0 && score <= 100){  // valid score

            if(score >= 90  ){
                result = "A";
            } else if(score >= 80){
                result = "B";
            }else if(score >= 70 ){
                result = "C";
            } else if(score >= 60 ){
                result = "D";
            }else{
                result = "F";
            }

        }else{  // invalid score
            result = "Invalid";
        }

        System.out.println(result);





    }
}
