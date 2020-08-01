package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "SAMIRA";
        String lastName = "MESHALLA";
        int age = 27;
        String citizenship = "USA";
        boolean eligibleToVote = age>=18 && citizenship == "USA";
        System.out.println(eligibleToVote);

        String fullName = firstName +" "+ lastName;
        System.out.println(fullName+ " is eligible to vote: " + eligibleToVote);
    }
}
