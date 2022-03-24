package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid website");
        String website = input.next();
        website = website.toLowerCase();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if(validStart && validEnd){
            System.out.println(website + " is a valid website");
        } else {

            if(!validStart){
                System.out.println("url needs to start with www.");
            }

            if(!validEnd){
                System.out.println("url needs to end with .com, .edu, .net, or .gov .");
            }

        }

    }
}
    /*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
     */