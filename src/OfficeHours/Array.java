package OfficeHours;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
/*
    What is an array?

    An array is a data structure that can hold multiple values

    ordered data structure (has index numbers)

    Size is fixed (disadvantage)

    Default values

    String --> null
    byte - short - int - long --> 0
    float - double --> 0.0
    boolean -- false

     */

        // declaring arrays

        //1

        String [] colors = {"Yellow","Blue","Pink"};

        // colors[3]="Purple"; we cant add element after initialization

        // 2

        int [] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        numbers[0]=1;
        numbers[1]=1;
        numbers[2]=1;

        // how can we retrieve data from array
        System.out.println(colors[0]); // yellow
        colors[0]="Red";
        System.out.println(colors[0]); // red

        // how can we reassign



        /*
        Arrays utility

            Arrays class is presented "java.util"
            -toString()


         */

        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors).replace("[","").replace("]","").toLowerCase().trim());

        // length

        System.out.println(colors.length);

        // what is the difference between length() and length ?

            // length --> This is for arrays. This is a property
            // length() --> This is for Strings. This is a method

        // get me the last element of colors []
        System.out.println(colors[colors.length-1]);

        // String methods

        // toCharArray
        String name = "Cydeo";

        char[] chars = name.toCharArray();
        // Shortcut ----> ALT+ENTER  ---> introduce local variable

        System.out.println(Arrays.toString(chars));
        // (chars[0]

        //split
        String[] split = name.split("");
        System.out.println(Arrays.toString(split));
        // split[0] --> you can use String methods without any concat

        String a ="a b c a b c a b c";

        String[] abc = a.split(" ");
        System.out.println(Arrays.toString(abc));

        // Hint for office hours Interview task

        a = "abcabcabc";

        String[] abcs = a.split("abc");


    }
}


