package OfficeHours;

public class P01_ForLoopIntro {
    public static void main(String[] args) {
        /*

        for(intit;condition;frequency of iteration){

        // statements







        }

        initialization ---> int i = 0  (i-j-k) double - float



         */

        String word = "Cydeo School";

        // C y d e o

        // 0 1 2 3 4

        String result = word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) + " " + word.charAt(4);
        System.out.println(result);

        for(int i = 0; i < word.length(); i++){
            System.out.print(word.charAt(i) + " ");

        }




        System.out.println("========== with variable ==========");


        for(int i = 0; i < word.length(); i++){

            result += word.charAt(i) + " ";

        }

        System.out.println(result);


        System.out.println("========== reverse =============");

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }


        // word.length().for ---> will give you option to create for loops
        System.out.println("======== Print out only Cydeo =========");

        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == ' '){
                break;
            }

            System.out.println(word.charAt(i));

        }





        }

    }

