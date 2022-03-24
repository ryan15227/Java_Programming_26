package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What day would you like to know about?");
        String day = input.next();
        String information = "";


        switch (day){
            case "Monday":
                information = "We have Java with Saim at 7 pm EST";
                break;
            case "Tuesday":
            case "Wednesday":
                information = "We have Java with Saim at 7 pm EST, but we also have office at 5:30";
                break;

            case "Thursday":
                information = "We have soft skills with Nadir at 7 pm EST";
                break;
            case "Friday":
                information = "Today is day off, or as Nadir says soft skills studying day";
                break;
            case "Saturday":
            case "Sunday":
                information = "We have full day of Java with Saim from 10 am to 5 pm EST";
                break;
            default:
                information = "INVALID INFORMATION";
        }



    }
}

/*
Task:

    Ask the user to enter which day it is
    print which class we have on that day, and the time of the class
    show if there are office hours



 */