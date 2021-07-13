// bubble sort
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] numbers = {2,3,1,2,5,4};
        for(int i = 0;i< numbers.length;i++)
        {
            for (int j=0;j< numbers.length;j++)
            {
                if(numbers[i]< numbers[j])
                {
                    int temp;
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));

    }
}


// diagonal matrix
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] numbers = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int diagonal_count = 0;
        int check_box = 0;
        if (numbers.length ==  numbers[0].length)
        {
            for (int i=0;i< numbers.length;i++)
            {
            for (int j=0;j< numbers.length;j++)
            {
                if(i==j)
                {
                    if(numbers[i][j]<1)
                    {

                        check_box = 1;


                    }
                    else
                    {
                        diagonal_count++;

                    }
                }
                else if(numbers[i][j]>0)
                {

                    check_box = 1;
                }



            }
            }

                if(diagonal_count == numbers.length && check_box==0)
                {
                    System.out.println("its a diagonal matrix");
                }
                else
                {
                    System.out.println("Its not a diagonal matrix");
                }


        }
        else
        {
            System.out.println("Its not a diagonal matrix 2");
        }


    }
}// hashmap
package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Map<String,String> phonebook = new HashMap<>();
        phonebook.put("Neeraj","03488311613");
        phonebook.put("sagar","03483443433");
        phonebook.put("Imran","03434341613");
        phonebook.put("ali","0348834344343");
        phonebook.put("Nitesh","343434313");
        System.out.println(phonebook.get("Nitesh"));

        Set<String> Keys = phonebook.keySet();
        for (String i: Keys
         ) {
            System.out.println(i);

        }

    }
}

