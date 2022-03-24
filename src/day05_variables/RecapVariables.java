package day05_variables;

public class RecapVariables {

    public static void main(String[] args) {

        // Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

        // We can't print the variables because they don't have a value
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentsInClass);


        // Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentsInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        System.out.println(numberOfCoffeeCups + "\t" + totalStudentsInClass);  // we use concatenation to print values of two variables at the same time


        // Declare and assign

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("\nThis is my temperature: " + temperature);
        System.out.println("It is day: " + javaDays + " In java class");


    }
}
