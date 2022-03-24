package day09_scanner;

public class EligibleToVote {

    /*
        create and assign these variables;

            name
            are they citizen
            do they have criminal background
            age

        determine if they are eligible to vote,
        they can oly vote if they are a citizen,
        have no criminal background and are about age 18

     */

    public static void main(String[] args) {

        String name = "James Bond";
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        int age = 49;

        boolean isEligibleToVote = age >= 18 && isCitizen && !hasCriminalBackground;
        //                                      true      && (not)!false   !false -> true

        System.out.println(name + " eligible to vote: " + isEligibleToVote);

    }
}
