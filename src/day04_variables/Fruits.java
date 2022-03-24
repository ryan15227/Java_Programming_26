package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 50;
        int grapes = 50;
        int bananas = 150;

        System.out.println("This is how many apples we have: " +apples);
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);
        //using the + is like saying AND in java language

        System.out.println("sold some apples");
        apples = 30; //reassigning apples to have a value of 25 (+ apples +)
        System.out.println("Apples after selling: " + apples);

        int price = 15;   // +price

        // System.out.println("The price of my 25 apples is $20"); is considered hard code

        System.out.println("The price of my " + apples + " apples is $" + price);
    }
}
