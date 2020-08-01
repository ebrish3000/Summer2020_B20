package day03_sequences_Variables;
// DataType VariableName = Data
public class Variables {
    public static void main(String[] args) {
        //  arectangle with length: 2 width 4 area== 8

        byte length = 20;
        byte width = 40;
        System.out.println(length * width);
        //byte, short, int, long, float, double, boolean, char.
        //byte num1 = 140; error cause over the range of byte.

        short num1 =140;
        //short num2 = 45000; over the range of short.
        int num2 = 45000;
        //int num3 = 54000.0; error case only integer numbers no decimal
        double num3 = 54000.0;// double is for decimals like float
        long largerNumber = 9999999999999l; // give letter l at the end for long integers
        // common int for integers and double for decimals

        // PI = 3.14
        //byte PI = 3.14; Error cause no decimals with byte, short,int and long all whole number only. Flout and double for decimal.
        double PI = 3.14;
        System.out.println(PI);
        float decimal = 3.5f; // each time when we use flout we use f at the end.

        //byte < short < int < long < float < double



    }
}
