package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Muhammed";
        String lastName = "Ali";
        int age = 30;
        String citizenship1 = "USA";
        String citizenship2 = "UAE";
        String fullName = firstName+ " " +lastName;
        boolean eligibleAge = age>=18;
        boolean citizenshipToVote = citizenship1 == "USA" || citizenship2 =="USA";
        boolean eligibleToVote = eligibleAge && citizenshipToVote;
        System.out.println(fullName + " is eligible to vote for Trump: " +eligibleToVote);


    }
}
