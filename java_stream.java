// hashmap
package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here




            List<Integer> number = Arrays.asList(2,3,4,5);


            List<Integer> square = number.stream().map(x -> x*x).toList();

            System.out.println(square);



            List<String> names =
                    Arrays.asList("Reflection","Collection","Stream");

            // demonstration of filter method
            List<String> result = names.stream().filter(a->a.startsWith("S")).
                    collect(Collectors.toList());
            System.out.println(result);


            List<String> show =
                    names.stream().sorted().collect(Collectors.toList());
            System.out.println(show);


            List<Integer> numbers = Arrays.asList(2,3,4,5,2);


        System.out.println("this is the set line\n");
            Set<Integer> squareSet =
                    numbers.stream().map(x->x*x).collect(Collectors.toSet());
            System.out.println(squareSet);


            number.stream().map(x->x*x).forEach(y->System.out.println(y));

           
            int sum =
                    number.stream().map(x->x*2).reduce(0,(a,b)->{
                        return a+b;
                    });

            System.out.println(sum);


    }
}
