package day28_Recap;

public class LoopShortQuiz {
    public static void main(String[] args) {

        int a = 0;
        while ((a <= 6)) {
            a+=2;
        }
        System.out.println(a);
        System.out.println("===================================");
        int i = 8;
        int j = 7;
        for (i = 0; i < j - 1; i += 2) {
            System.out.print(i + " ");
        }
            System.out.println();
            System.out.println("=======================================");
            for (int k = 0; k <= 4; ) {
                k++;
                System.out.print(k+ " ");
            }

                System.out.println();
                System.out.println("==========================================");
                int z = 5;
                for (int q = 5; q > 0; q--) {
                    z+=q;

                }
                System.out.println(z);




    }
}
