package day25_Practices;

public class LongestString {
    public static void main(String[] args) {

        String[] arr = {"Hajar", "Danu", "Ebrahim", "Samira", "Ilm", "Ali ", "Haj"};
        int maxLength = arr[0].length();

        for (String each : arr) {  //

            if (each.length() > maxLength) {
                maxLength = each.length();
            }
        }
        System.out.println(maxLength);

        for (String each : arr) {
            if (each.length() == maxLength) {
                System.out.println(each);
            }

        }
    }
}
