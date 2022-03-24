package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE TEMPERATURE");
        int temperature = input.nextInt();

        if(temperature >= 70) {
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("It's too cold");
            System.out.println("Code more java");
        }




    }
}
 /*

 Task:
    ask the user to enter the temperature

    if the temp is above or equal to 70
       print: It's a nice day
              Go outside, but with your laptop to code java

    if the temp is less than 70
       print: It's too cold
              Code more java

  */