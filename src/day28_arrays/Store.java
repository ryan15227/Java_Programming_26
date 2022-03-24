package day28_arrays;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};
        boolean inStock1 = false;

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("jackets")){
                inStock1 = true;
                break;
            }
        }

        System.out.println(inStock1 ? "Jackets in stock" : "Jackets out of stock");

        /*
        if(inStock
         */



        // Do we have jackets in stock?

        // use scanner to ask which item they are looking for, and check if we have it



        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for");
        String item = input.nextLine();
        boolean inStock = false;

        for (int i = 0; i < item.length(); i++) {

            if(items[i].equalsIgnoreCase(item)){
                inStock = true;
                break;
            }

        }

        System.out.println(item + (inStock ? " in stock" : " out of stock"));

    }
}
