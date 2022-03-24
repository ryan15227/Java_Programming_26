package Practice_from_videos;

import java.util.Scanner;

public class StringMethods_Part3 {
    public static void main(String[] args) {

    //isEmpty(): checks if the String' length is zero. return type---> boolean
        String str = "    ";
        boolean r1 = str.isEmpty();
        System.out.println(r1); //false



        System.out.println("---------------------------------------------------");

    //isBlank(): checks iif the String is blank. return type---> boolean (blank means it does not contain ladders, digits or any other special characters besides space)
        String str2 = "    ";
        boolean r2 = str2.isBlank();
        System.out.println(r2); //true




        System.out.println("---------------------------------------------------");

    //equals(String): compares the content of the two Strings. return type---> boolean
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //if they have the same text you'll get TRUE, if they don't FALSE  //true

        System.out.println("---------------------------------------------------");

    //equalsIgnoreCase(String): compares the content of the two Strings irrespective of the case sensitivity. return type ---> boolean
        String word1 = "JAVA";
        String word2 = "java";

        System.out.println(word1.equals(word2)); //false (checks case sensitivity)
        System.out.println(word1.equalsIgnoreCase(word2)); //true (IGNORES case sensitivity)



        System.out.println("---------------------------------------------------");
    //contains(String): checks if the given String is contained in the String. return type--> boolean
        String sentence = "I love Java programming language";
        boolean hasCSharp = sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);
        
        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);



        System.out.println("---------------------------------------------------");
    //startsWith(String): checks if the String started with the given character(s). return type---> boolean
        String name = "Wooden Spoon";
        boolean result1 = name.startsWith("Wood"); //true
        System.out.println("result1 = " + result1);

        boolean result2 = name.startsWith("Spoon"); //false
        System.out.println("result2 = " + result2);

        System.out.println("---------------------------------------------------");
    //endsWith(String): checks if the String ends with the given character(s). return type---> boolean

        boolean result3 = name.endsWith("Spoon"); //true
        System.out.println(result3);

        String word = "ooo";

        if(word.startsWith("x") || word.startsWith("X")){
            System.out.println();
        }





        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word3 = scan.next();

        //WRITE YOUR CODE BELOW:

        if(word3.substring(0,2).contains("java")){
            exists = true;

        } else {
            exists = false;
        }
        System.out.println(exists);

    }
}
