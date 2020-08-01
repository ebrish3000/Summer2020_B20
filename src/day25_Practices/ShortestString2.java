package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {

        String[] arr = {"Hajar", "Danu", "Ebrahim", "Samira", "Ilm", "Ali ", "Haj"};
        int minLength = arr[0].length();

        for (String each: arr) {  //

            if (each.length() < minLength) {
                minLength = each.length();
            }
        }
        //System.out.println(minLength);

        for (String each: arr) {
            if (each.length() == minLength) {
                System.out.println(each);
            }
        }

    }
}
