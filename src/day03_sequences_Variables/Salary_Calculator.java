package day03_sequences_Variables;

public class Salary_Calculator {
    public static void main(String[] args) {
        // salary, tax: total tax = salary - tax
        // salary after tax = salary - total tax
        // given salary = $100000 tax 2.8%
        int salary = 100000;
        double $tax = 0.28;
        double tota_lTax = salary * $tax;
        double salartAfterTax = salary - tota_lTax;

        System.out.println(tota_lTax);
        System.out.println(salartAfterTax);

    }
}
