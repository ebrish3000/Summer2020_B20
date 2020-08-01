package day29_CustomMetodes;
/*
 calculate the grade of the student based on the score
 */
public class ReturnKeyboard {
    public static void main(String[] args) {
        grade(101);

    }

    public static void grade(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' :
                (score >= 60) ? 'D' : 'F';
    }

}