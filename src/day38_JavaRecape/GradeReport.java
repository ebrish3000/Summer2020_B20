package day38_JavaRecape;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 90, 85, 75, 55, 91, 73, 73, 35, 47, 69,
                87, 77, 67, 57, 97, 93, 83));
        System.out.println(list.toString()); // can be just list or list.toString it is the same
        System.out.println("++++++++++++++++++++++++");

        ArrayList<Integer> gradeA = new ArrayList<>();
        gradeA.addAll(list); // 1st ==> store all grade lists.
        gradeA.removeIf(each-> each < 90); // 2nd ==> remove the lists out of A that are not A.
        System.out.println("Grade A: "+ gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list); // 1st ==> store all grade lists.
        gradeB.removeIf(p-> p < 80 || p > 89); // 2nd ==> remove the lists out of B.
        System.out.println("Grade B: "+ gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list); // 1st ==> store all grade lists.
        gradeC.removeIf(p-> p < 70 || p > 79); // 2nd ==> remove the lists out of C.
        System.out.println("Grade C: "+ gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list); // 1st ==> store all grade lists.
        gradeD.removeIf(p-> p < 60 || p > 69); // 2nd ==> remove the lists out of D.
        System.out.println("Grade D: "+ gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list); // 1st ==> store all grade lists.
        gradeF.removeIf(p-> p > 59); // 2nd ==> remove the lists out of A.
       /* gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);gradeF.removeAll(gradeD);*/


        System.out.println("Grade F: "+ gradeF);

        System.out.println("=========================================");
        System.out.println(gradeA.size()+ " students made A");
        System.out.println(gradeB.size()+ " students made B");
        System.out.println(gradeC.size()+ " students made C");
        System.out.println(gradeD.size()+ " students made D");
        System.out.println(gradeF.size()+ " students fail");



    }
}
