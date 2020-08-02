package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Baslan");
        students.add("Dawud");
        students.add("Ramazan");

       boolean r1 = students.containsAll(Arrays.asList("Dawud",
               "Waqar", "Ramazan"));
        System.out.println(r1);

        System.out.println("================================================");

        ArrayList<String> p2Group3 = new ArrayList<>();
        students.add("Adem");
        students.add("Ali");
        students.add("Ashenafi");
        students.add("Berlinda");
        students.add("Burak");
        students.add("Cengiz");
        students.add("Dilobar");
        students.add("Ebrahim");
        students.add("Mohammed");
        students.add("Hamid");
        students.add("Mokhinur");
        students.add("Nicola");
        students.add("Omer");
        students.add("Taha");
        students.add("Ulvi");
        boolean r = p2Group3.containsAll(Arrays.asList("Ebrahim", "Ashenafi"));
        System.out.println(r);

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Muhtar", "Ahmed", "Verginia"));
        employees.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees);


    }
}
