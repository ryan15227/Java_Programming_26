package day30_arrays;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {

        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days = s.split(",");
       // System.out.println(Arrays.toString(days));

        for(String day : days){
            System.out.println(day);
        }

        System.out.println();

        String [] withoutDay =s.split("day");

        for(String each : withoutDay){
            System.out.println(each);
        }

        String str = "Jan-Feb-Mar-Apr-May-June-Jul-Aug-Sep-Oct-Nov-Dec";
        String [] months = str.split("-");

        for(String each: months){
            System.out.println(each);
        }




    }
}
