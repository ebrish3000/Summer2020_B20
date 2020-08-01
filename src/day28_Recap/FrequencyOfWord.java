package day28_Recap;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "javajavacatC++JAVA".toLowerCase();
        // substring(0,4)  java
        // substring (1,5)  avaj .....
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            String s = str.substring(i, i+4);
            if (s.contains("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
