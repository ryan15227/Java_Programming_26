package weekend_practice;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married? T/F");
        boolean isMarried = scan.nextBoolean();
        System.out.println();

        String contact = workPhoneNumber + ", " + personalPhoneNumber + ", " + email;
        String fullName = firstName + lastName;
        String address = street + ", " + city + ", " + state + ", " + zipCode;

        System.out.println("Patient information");
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "ft.");
        System.out.println("Weight: " + weight + "lbs.");
        System.out.println("Married: " + isMarried);

        // continue for city



    }
}
