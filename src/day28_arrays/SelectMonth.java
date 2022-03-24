package day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month number");
        int mon = input.nextInt(); // 4

        String [] months = {"January" + "February" + "March" + "April" + "May" + "June" + "July" + "August" + "September" + "October" + "November" + "December"};

        System.out.println(mon - 1);

        // months [3]





    }
}
/*
ask the user the month number the want, print the month name
 */