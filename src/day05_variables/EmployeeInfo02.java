package day05_variables;

import java.util.concurrent.Callable;

public class EmployeeInfo02 {
    /*
    create a class EmployeeInfo02
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are fullTime, job title, salary, number of pto(paid time off), are they married, suite (char - A,B,C,D)
     */

    public static void main(String[] args) {

        String firstName = "Ryan";
        String lastName = "Loughlin";
        String gender = "male";
        int age = 21;
        String companyName = "Your moms house";
        boolean isFullTime = true;
        String jobTitle = "SDET";
        double salary = 125_624.98;
        int pto = 4;
        boolean isMarried = false;
        char suite = 'A';

        String fullDetails2 = "My name is " + firstName + " " + lastName + ". My gender is " + gender + " I work at " + companyName + ". \n" ;


        // example done by Siam, declaring all at once instead of doing it one by one    V

        String FirstName, LastName, CompanyName, JobTitle;
        char Gender, Suite;
        int Age, Pto;
        double Salary;
        boolean isFUllTime, isMArried;

        FirstName = "James";
        LastName = "Bond";
        CompanyName = "MI6";
        JobTitle = "Special Agent";
        Gender = 'M';
        Suite = 'D';
        Age = 40;
        Pto = 15;
        Salary = 1_000_000; //1,000,000
        isFUllTime = true;
        isMArried = false;

        String fullDetails = "Employment information for " + FirstName + " " + LastName + " Gender: " + Gender +".\n" + JobTitle + " at " + CompanyName + " currently " + Age + " years old.\n" + CompanyName + " is located in suite " + suite + ". This years salary comes to $" + Salary + ".\nOther details: PTO: " + Pto + " full time? " + isFUllTime + " married? " + isMArried;

        System.out.println(fullDetails);

        System.out.println(fullDetails2);

        }
}
