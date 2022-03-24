package day13_if_statements;

public class Diver {
    public static void main(String[] args) {

        int oxygenLevel = 100;

        String message;

        if(oxygenLevel > 90){
            message = ("Above 90 - Your tank is full");
        } else if(oxygenLevel > 80){
            message = ("Above 80 - Still okay");
        } else if(oxygenLevel > 70){
            message = ("Above 70 - Don't go too far");
        } else if(oxygenLevel > 60){
            message = ("Above 60 - Start to head back");
        } else if(oxygenLevel > 50){
            message = ("Above 50 - Be careful now you're at % 50");
        } else {
            message = ("DANGEROUS");
        }



    }
}
 /*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you at at 50%
     */
