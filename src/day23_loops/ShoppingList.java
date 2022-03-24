package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        /*
            do while

            repeated steps:
                ask the user to enter the item
                add item to shopping list
                ask the user if they want to add more items

                at the end show the full shopping list
         */
        Scanner input = new Scanner(System.in);
        String list = "Shopping List:\n";
        String addMore;

        do{
            System.out.println("Enter the name of the item");
            list += "\n* " + input.nextLine();  // this could also be done separate. You can reassign to a string

            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();
        } while(addMore.equalsIgnoreCase("yes")); // if the user types 'yes' in the console, (wanting to add more items) then the loop will iterate again

        // if the user types anything besides 'yes' the equals method will give false and the loop will stop

        System.out.println(list);




    }
}
