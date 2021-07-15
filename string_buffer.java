package com.company;

import java.time.*;

public class string_buffer {



    public static void main(String[] args)
    {
        StringBuffer sbf = new StringBuffer("Neeraj");
        sbf.append("Hello");
        //sbf.append(2.22);
        //sbf.delete(0,2);
        sbf.indexOf("N");
        System.out.println(sbf);
        System.out.println(sbf.indexOf("l"));
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate d2 = LocalDate.of(1988, Month.APRIL,25);
        System.out.println("US TIME");
        LocalTime t = LocalTime.now(ZoneId.of("US/Eastern"));
        System.out.println(t);
        System.out.println(d2);
        System.out.println("Machine Readable Time");
        Instant i = Instant.now();
        System.out.println(i);
        /*for (String s:ZoneId.getAvailableZoneIds()
             ) {
            System.out.println(s);
        }*/

    }

}
