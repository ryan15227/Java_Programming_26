package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {

        // ex: firstName: john lastName: smith

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toLowerCase().trim();
        System.out.println("Enter your last name");
        String lastName = input.next().toLowerCase().trim();

        String id = firstName.substring(0,1);
        id += lastName.substring(0,1).toUpperCase() + lastName.substring(1,3);
        id += firstName.length() * 2;

        System.out.println(id);


        // Q How to make a character with charAt method lowercase ("" + charAt).toLowerCase()    <---

    }
}
