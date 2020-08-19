package Office_Hours.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = !true != true;
        System.out.println(r1);

        boolean r2 =!r1;
        System.out.println(r2);
        System.out.println(!!!!!false);
        System.out.println("====================");

        boolean result1 = 9>18 || "Java" =="Java" || "A" =="a";
        // or logic(||) means to be true one condition has to be true and it is enough.
        System.out.println(result1);

        // and logic (&&) to be true all has to be true
        boolean result2 = "Java" != "Pytho" && "ebrahim" =="Ebrahim";
        System.out.println(result2);

    }
}
