package day05_ArtimeticOperators;

public class EmployeeInfo2 {

    public static void main(String[] args){
        //firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
        String firstName = "Ebrahim";
        String lastName = "Emam";
        int age = 30;
        String companyName = "Amazon";
        char gender = 'M';
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;
        String fullName = firstName+" " + lastName; //"Ebrahim Emam"

        System.out.println("Employee' full name is: " + fullName );
        System.out.println( fullName + "' gender is: "  + gender );
        System.out.println( fullName +"' age is: " + age + " years old" );
        System.out.println( fullName  + " works at: "+companyName );
        System.out.println(fullName + "' job title is: " + jobTitle);
        System.out.println(fullName +"' salary is: $"+salary );
        System.out.println( fullName +" is full time employee: "+ isFullTime);
        System.out.println( fullName +" is married: " + isMarried);




    }





}
