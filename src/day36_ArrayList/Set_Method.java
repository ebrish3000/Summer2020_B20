package day36_ArrayList;

import java.util.ArrayList;

/*
warmup tasks:
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
    3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class Set_Method {
    public static void main(String[] args) {
                  // task 01
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.set(list.size()-1, 0);
        System.out.println(list);

        System.out.println("====================================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 1; i <= 20; i++){
            list2.add(i);
        }

        System.out.println(list2);

        // task02
        for(int i = 0; i <= list2.size()-1; i++){ // i: index numbers
            int each= list2.get(i); // each element in the list

            if( each % 2 != 0){
                list2.set(i,  each * 2 );
            }else{
                list2.set(i, each * 3);
            }

        }


        System.out.println(list2);




    }
}
