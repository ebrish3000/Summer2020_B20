package day37_ArrayList;

public class ClassNotes {

    /*
    08/01/2020
Topics: ArrayList Continue
        Recap
Package name: day37_ArrayList
Warmup Tasks:
        1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D
        2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2
Arrays Utility:
        Arrays.asList(): takes non-primitive array or array of values
                    RETURNS COLLECTION TYPE
ArrayList Methods:
        Bulk Operations: designed for CollectionTypes
                containsAll(CollectionType): verifies if all elements are contained in the list. boolean
                addAll(CollectionType): add multiple elements at the same time to arraylist
                removeAll(CollectionType): removes all the matching elements
                retainAll(CollectionType): removes all the NOT matching elements
        removeIf(Predicate): removes the elements that are matching with the if condition
                Predicate: applied to the CollectionTypes
                        Predicate<DataType>    name  =  p ->  Boolean Expression
Collections Class:
        Collections.frequency(CollectionType, Element): returns the frequency of element
        Collections.swap(CollectionType, index1, index2): swap the elements
        Collections.sort(CollectionType): sorts it in ascending order
        Collections.max(CollectionType): returns the maximum
        Collections.min(CollectionType): return the minimum
        Collections.replaceAll(CollectionType):
tasks:
    1. write a program that can remove all the names named 'Ahmed' from the list of names
    2. write a program that can remove the elements that are not unique from the ArrayList
            NOTE:
                DO NOT USE:
                        for loop
                        while loop
                        for each loop
                        do-while
                        list: {1,1,2,2,3,3,4,5,6,7}
                        output: {4,5,6,7}
    3. write a program that can remove digits and letters for an ArrayList of characters
            list: {a,b,c,3,4,5,6,&,%,@,#,*}
            output: {&,%,@,#,*};

     */

}
