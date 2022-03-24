package day16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        double num1 = input.nextDouble();
        System.out.println("Pick operators: + - * / ");
        String operator = input.next();
        System.out.println("Enter number 2: ");
        double num2 = input.nextDouble();

        double result = 0;
        boolean validCalc = true;

        switch(operator) {

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by 0");
                    validCalc = false;
                }
                break;
            case "%":
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Cannot divide by 0, dummy ");
                    validCalc = false;
                }
                break;
            default:
                System.out.println(operator + " is not a valid operator for this calculator");
                validCalc = false;
        }


        if(validCalc) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}

/*

    declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num1
        / : divide num1 and num2
        any other char: "invalid operator"
 */