package day33_methods;

import java.util.Scanner;

public class Age {
    /*
    Make a method that calculates and prints the age
    take the birth year
     */

    public static void getAge(int birthYear) {
        System.out.println("Age: " + (2022 - birthYear));
    }

    public static void main(String[] args) {

        getAge(2000);

        int year = 1990;
        getAge(year);

        Scanner input = new Scanner(System.in);
        System.out.println("What year were you born?");
        getAge(input.nextInt());

    }
}




//public class Age {
//    /*
//    Make a method that calculates and prints the age
//    take the birth year
//     */
//
//    public static void getAge(int birthYear) {
//        System.out.println("Your birthYear is " + birthYear);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("What year were you born?");
//        int year = input.nextInt();
//        int ageCalculated = year + 22;
//        getAge(ageCalculated);
//
//    }
//}
