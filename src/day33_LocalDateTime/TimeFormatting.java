package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    /*
            year: yy, yyyy
            Month: MM(number), MMM(three letters), MMMM(full Name)
            days: dd
            days name: E(three letters), EEEE(full name)
     */
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy, EEEE");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/d/yyyyyy, E");

        LocalDate ld = LocalDate.of(1987,06,23);

        System.out.println(ld);
        System.out.println(  ld.format(formatter)  );


    /*
        hours: hh
		minutes: mm
		seconds: ss
		am/pm: a
     */

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:m:s a");
        LocalTime now =   LocalTime.now();
        System.out.println(now);
        System.out.println( now.format(timeFormat)  );
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf);



        // May/20/2019 Dayname 4:30 pm






    }

}