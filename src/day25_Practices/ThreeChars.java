package day25_Practices;

public class ThreeChars {
    public static void main(String[] args) {
        String[] words = {"Hajar", "Dania", "Hasen", "Semir", "Emmam", "Ebrah"};
       /* System.out.println(words[0].substring(0, 3));
        System.out.println(words[1].substring(0, 3));
        System.out.println(words[2].substring(0, 3));
        System.out.println(words[3].substring(0, 3));
        System.out.println(words[4].substring(0, 3));*/
       for (int i = 0; i < words.length; i++) {
        System.out.println(words[i].substring(0, 3));}
        System.out.println("============================================");
        for (String each : words) {
            System.out.println(each.substring(0, 3));
        }
    }
}
