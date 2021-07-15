// hashmap
package com.company;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here

    List <laptop> laps = new ArrayList<>();
    laps.add(new laptop("dell",16,800));
    laps.add(new laptop("Apple",8,1200));
    laps.add(new laptop("Acer",12,700));

       Collections.sort(laps);
        System.out.println("This is laptop seciton");
        System.out.println(laps);
        for (laptop l: laps
             ) {
            System.out.println(l);
        }




    }
}
