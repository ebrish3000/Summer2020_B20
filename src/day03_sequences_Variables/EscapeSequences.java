package day03_sequences_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello everyone \nMy name is Cybertek"); // \n used for skip the one line must be given with in the double code.

        System.out.println("\tI am in Seattle\n"); // \t used to start the paragraph and must be with in the double code again.
        System.out.println("\n\nI love programming.");

        System.out.println("\\");// back slash  is concidered as skip sequence by Java so to print one back slash have to give two.
        System.out.println("/");

        System.out.println("\\\\");
        System.out.println("//");

        System.out.println("My name is \'Ebrahim\'"); // /'  ...'/ can be used like this but it is better to use just '.....' like V
        System.out.println("My name is 'Ebrahim'");

        System.out.println("My favorite TV_serius \"Game of Thrones\".");
    }
}
