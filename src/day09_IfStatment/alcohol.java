package day09_IfStatment;
// 4. write a java program that can identify if a person is eligible to buy alcohol
public class alcohol {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 23;
        boolean eligible = hasID && age>21;
        //                  true  && false == false
        String result = "Eligible to buy alcohol";
        if(eligible == true){
            System.out.println(result);
        }

        if(eligible==false){
            //System.out.println("Go buy your milk");
            result = "You are not old enough to buy alcohol";
            System.out.println(result);
        }


    }
}
