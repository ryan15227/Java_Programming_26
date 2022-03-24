package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the address");
        String address = input.nextLine();
        System.out.println("Please enter the name of the owner");
        String nameOfOwner = input.nextLine();
        System.out.println("Number of units");
        int numberOfUnits = input.nextInt();
        System.out.println("Average size of each unit");
        double size = input.nextDouble();
        System.out.println("Monthly rent amount");
        double monthlyRent = input.nextDouble();
        System.out.println("Number of washers");
        int numberOfWashers = input.nextInt();
        System.out.println("Number of driers");
        int numberOfDriers = input.nextInt();
        System.out.println("Allows pets?");
        boolean allowsPets = input.nextBoolean();
        System.out.println("Has a pool?");
        boolean hasPool = input.nextBoolean();
        System.out.println("Length of lease");
        input.nextLine();
        String leaseLength = input.nextLine();
        System.out.println("Total number of residents in building");
        int totalResidents = input.nextInt();
        input.nextLine();
        System.out.println("Phone number of owner");
        String phoneNumber = input.nextLine();
        System.out.println("Near a gas station?");
        boolean isNearGasStation = input.nextBoolean();
        System.out.println("Number of floors");
        int numberOfFloors = input.nextInt();
        System.out.println("is there a basement?");
        boolean hasBasement = input.nextBoolean();
        System.out.println("Has available units for rent");
        boolean unitsForRent = input.nextBoolean();
        System.out.println("Has air conditioning");
        boolean hasAC = input.nextBoolean();
        System.out.println("Number of parking spots");
        double parkingSpots = input.nextDouble();
        System.out.println("Has wheelchair access");
        boolean wheelchairAccess = input.nextBoolean();
        System.out.println("Review out of 5 *");
        int review = input.nextInt();
        double tenPercent = monthlyRent - (0.1 * monthlyRent);
        double twentyPercent = monthlyRent - (0.2 * monthlyRent);
        int avgNumberOfResidents = totalResidents / numberOfUnits;
        double avgNumberOfParkingSpots = parkingSpots / numberOfUnits;
        double avgNumberOfUnits = numberOfUnits / numberOfFloors;
        System.out.println("Monthly rent after 3 years (10% off original rent)");
        System.out.println(tenPercent);
        System.out.println("Monthly rent after 6 years (20% off original rent)");
        System.out.println(twentyPercent);
        System.out.println("Average number of residents per unit");
        System.out.println(avgNumberOfResidents);
        System.out.println("Average number of parking spots per unit");
        System.out.println(avgNumberOfParkingSpots);
        System.out.println("Average number of units per floor");
        System.out.println(avgNumberOfUnits);



    }
}

/*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheelchair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */


        /*
        String address, nameOfOwner, ownersPhoneNumber
         */

/*
Scanner input = new Scanner(System.in);
        System.out.println("Please enter the address");
        String address = input.nextLine();
        System.out.println("Please enter the name of the owner");
        String nameOfOwner = input.nextLine();
        System.out.println("Number of units");
        int numberOfUnits = input.nextInt();
        System.out.println("Average size of each unit");
        double size = input.nextDouble();
        System.out.println("Monthly rent amount");
        double monthlyRent = input.nextDouble();
        System.out.println("Number of washers");
        int numberOfWashers = input.nextInt();
        System.out.println("Number of driers");
        int numberOfDriers = input.nextInt();
        System.out.println("Allows pets?");
        boolean allowsPets = input.nextBoolean();
        System.out.println("Has a pool?");
        boolean hasPool = input.nextBoolean();
        System.out.println("Length of lease");
        input.nextLine();
        String leaseLength = input.nextLine();
        System.out.println("Total number of residents in building");
        int totalResidents = input.nextInt();
        input.nextLine();
        System.out.println("Phone number of owner");
        String phoneNumber = input.nextLine();
        System.out.println("Near a gas station?");
        boolean isNearGasStation = input.nextBoolean();
        System.out.println("Number of floors");
        int numberOfFloors = input.nextInt();
        System.out.println("is there a basement?");
        boolean hasBasement = input.nextBoolean();
        System.out.println("Has available units for rent");
        boolean unitsForRent = input.nextBoolean();
        System.out.println("Has air conditioning");
        boolean hasAC = input.nextBoolean();
        System.out.println("Number of parking spots");
        double parkingSpots = input.nextDouble();
        System.out.println("Has wheelchair access");
        boolean wheelchairAccess = input.nextBoolean();
        System.out.println("Review out of 5 *");
        int review = input.nextInt();
        double tenPercent = monthlyRent - (0.1 * monthlyRent);
        double twentyPercent = monthlyRent - (0.2 * monthlyRent);
        int avgNumberOfResidents = totalResidents / numberOfUnits;
        double avgNumberOfParkingSpots = parkingSpots / numberOfUnits;
        double avgNumberOfUnits = numberOfUnits / numberOfFloors;
        System.out.println("Monthly rent after 3 years (10% off original rent)");
        System.out.println(tenPercent);
        System.out.println("Monthly rent after 6 years (20% off original rent)");
        System.out.println(twentyPercent);
        System.out.println("Average number of residents per unit");
        System.out.println(avgNumberOfResidents);
        System.out.println("Average number of parking spots per unit");
        System.out.println(avgNumberOfParkingSpots);
        System.out.println("Average number of units per floor");
        System.out.println(avgNumberOfUnits);


    }
}
 */