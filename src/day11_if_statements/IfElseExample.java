package day11_if_statements;

public class IfElseExample {

    public static void main(String[] args) {



/*


        int score = 60;
        if(score >= 75) {
            System.out.println("Passing");
        }

        if(score < 75) {
            System.out.println("Failing");
        }

                                                                            */

        int year = 2021;
        boolean lockdown = year == 2020 || year == 2021;

        if (lockdown) {
            System.out.println("STAY AT HOME");
            System.out.println("PRACTICE JAVA");
            System.out.println("WEAR MASK");
        }else{
            System.out.println("PARTY");
            System.out.println("STILL PRACTICE JAVA");
            System.out.println("MAYBE TRAVEL");
        }








        /*


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
 */

    }
}