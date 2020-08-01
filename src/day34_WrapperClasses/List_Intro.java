package day34_WrapperClasses;

import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95);   //autoBoxing  0
        scores.add(100);       //        1
        scores.add(85);        //        2
        scores.add(80);
        scores.add(1, 90);
        scores.add(0, 65);
        scores.add(6,60);

        System.out.println(scores);

        System.out.println(scores.get(6));


    }
}
