package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {
        String[] arr = {"Hajar", "Danu", "Ebrahim", "Samira", "Ali ", "Haj"};
        int minLength = arr[0].length();

        for (int i = 0; i < arr.length; i++) {  //
            int length = arr[i].length();
            if (length < minLength) {
                minLength = length;
            }
        }
        //System.out.println(minLength);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == minLength) {
                System.out.println(arr[i]);
            }
        }


    }
}
