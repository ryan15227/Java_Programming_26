package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Samsung";
        String model = "Galaxy S20 Ultra";
        String color = "Black";
        double price = 1199.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have a " + model + " from " + brand);
        System.out.println("It came in the color " + color + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $" +price);

        // approach 2 with String variable

        String fullMessage = "\nI have a " + model + " from " + brand + "\nIt came in the color " + color + " and it has " + storage + "GB \nFor the sim type " + sim + " with a camera " + hasCamera + " the total price was $" +price;

        System.out.println(fullMessage);

        //samsung, galaxy s20 ultra, black, 1199.99, 128gb, true

        //you struggled a little with this, if you see this please re-visit day05 on canvas if you're still behind/struggling
    }
}
