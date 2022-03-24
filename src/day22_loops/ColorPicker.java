package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        /*

            you are working on an art piece

            this program will help you pick some colors

            flow: ask for a color
                    get 3 unique colors by the end
         */

        Scanner input = new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors = "";

        while(colorsPicked < 3){

            System.out.println("Pick a color");
            String color = input.nextLine();
              // dont forget to increment

            if(uniqueColors.contains(color)){
                System.out.println("you already have that color");
            } else {
                uniqueColors += color + " ";
                colorsPicked++; // dont forget to increment
            }



        }

        System.out.println(uniqueColors);

    }
}
