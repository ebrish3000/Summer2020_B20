package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Practice1 {
    public static void main(String[] args) {

        String[] family = {"Hasen", "Ebrahim", "Samira", "Dania", "Hajar"};
        LocalDate[] birthDays  = {
                LocalDate.of(1933,12,26) ,
                LocalDate.of(1989, 06,23),
                LocalDate.of(1992,02,19),
                LocalDate.of(2018,01,19),
                LocalDate.of(2019,8,16)
        };



        for(int i =0; i <= family.length-1; i++){
            System.out.println( family[i]  +" : "+ birthDays[i] );
        }

        System.out.println("===================================================");

        for(LocalDate each  : birthDays ){
            if(each.isLeapYear() ){
                continue;
            }
            System.out.println(each);
        }


    }
        }