package day08_LogicalOperators;

public class LittersToGallons {
    /*
     write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
     */
    public static void main(String[] args) {
        double litter = 1000;
        double gallon = litter/3.785;
        System.out.println(litter + " litters equal to " + gallon + " gallons.");
    }
}
