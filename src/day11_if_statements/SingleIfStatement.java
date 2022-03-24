package day11_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {

        if(false){
            System.out.println("Hello World");// if statement is false so it does not print

        }

        System.out.println("Second Line"); // just normal print statement, nothing to do with if statements

        if(true){
            System.out.println("today is Monday"); // the if statement is true, so it will print this value
        }

        int score = 60;
        if(score >= 75){
            System.out.println("Passing");
        }

        if(score <= 75){
            System.out.println("FAILURE");
        }

        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;// (||) means or
        if(lockdown) {
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wear mask");

        }

        if(!lockdown){   // !false -> true             !lockdown -> (NOTlockdown)
            System.out.println("DO YO THANG");
            System.out.println("Still practice java");
            System.out.println("Maybe travel");
        }

        // in the situation where the lockdown value is true | !true -> false






    }
}
