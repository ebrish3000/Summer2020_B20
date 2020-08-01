package day33_LocalDateTime;
/*
 Task03:
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. creata a method that can print out the unique characters from an array of chars
 */
public class Uniques {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 3, 4, 5, 6};
        for(int element : arr ){
            int count = 0 ;
            for(int b : arr){
                if(element == b){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

/*
        int element =  arr[0]; //2
        int count = 0 ;
        for(int b : arr){
            if(element == b){
                count++;
            }
        }
        if(count == 1){
            System.out.println(element);
        }
*/
        System.out.println("===================================");
        int[] n1 = {1, 10, 10, 1000, 1000, 70000, 2000, 20, 20};
        uniqueElements(n1);

    }

    public static void uniqueElements(int[] arr){

        for(int element : arr ){
            int count = 0 ;
            for(int b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }
    public static void uniqueElements(double[] arr){

        for(double element : arr ){
            int count = 0 ;
            for(double b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }
    public static void uniqueElements(char[] arr){

        for(char element : arr ){
            int count = 0 ;
            for(char b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }
    public static void uniqueElements(String[] arr){

        for(String element : arr ){
            int count = 0 ;
            for(String b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }




}
