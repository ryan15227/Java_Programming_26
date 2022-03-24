package day15_switch;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = input.nextLine();
        System.out.println("Enter your URL");
        String url = input.nextLine();

        switch(browser){

            case "Chrome":
                System.out.println("opening " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in Safari");
                System.out.println("Loading...");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in Firefox");
               System.out.println("Loading...");
                System.out.println("Loading....");
                System.out.println("Loading.....");
                System.out.println("Loading......");
                System.out.println("Why use firefox so bad");
                System.out.println("Still Loading.......");
                System.out.println("Opening " + url + " in Firefox");
                break;
            default:
                System.out.println(browser + " iS nOt A vAlId BrOsWeR");


        }

    }
}
