package day30_CustomMethod;

import Library.Util;

class MethodCalls {

    public static void main(String[] args) {
        String str = "aaaabbbbbbbbccccccccccd";
        String str2 = Util.removeDup(str);
        String str3= Util.uniques(str);

        System.out.println(str2);
        System.out.println(str3);


    }





}
