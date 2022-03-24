package Practice_from_videos;

import java.util.Scanner;

public class StringMethods_Part2 {
    public static void main(String[] args) {

    //replace(oldValue,newValue): replaces all the matching character(s) of the String with the with given new character(s). return type---> String
        String str1 = "Wooden Spoon";
        str1 = str1.replace("o","e"); // "Weeden Speen"

        System.out.println(str1);

        String sentence1 = "I love Java, Java is the best programming language";
        sentence1 = sentence1.replace("Java","C#"); // "I love C#, C# is the best programming language"

        System.out.println(sentence1);

        sentence1 = sentence1.replace("C#","Java");

        System.out.println(sentence1);


        System.out.println("---------------------------------------------------");

    //replaceFirst(oldValue,newValue): replaces the first matching character(s) of the String with the with given new character(s). return type---> String
        String str2 = "Wooden Spoon";
        str2 = str2.replaceFirst("o", "e");
        System.out.println(str2);


        String sentence2 = "I love Java, Java is the best programming language";
        sentence2 = sentence2.replaceFirst("Java","C#");
        System.out.println(sentence2); // "I love C#, Java is the best programming language"


        System.out.println("---------------------------------------------------");


    //substring(begIndex): creates substring starting from the given beginning index to the given ending index. return type---> String

        String str3 = "Java Programming Language";

        String result1 = str3.substring(str3.indexOf("P")); // goes from 'P' all the way to the end of the String "Programming Language"

        System.out.println(result1);


    //substring(begIndex, endIndex): creates substring starting from the given beginning index to the given ending index. return type---> String
        String result2 = str3.substring(5, 16); // ending index is excluded
        System.out.println(result2);

        String result3 = str3.substring(str3.indexOf("P"), str3.lastIndexOf(" "));
        System.out.println(result3);

        String s1 = "I love Java";
        //index:     012345
        String result4 = s1.substring(2, 6);
        System.out.println(result4);


        System.out.println("---------------------------------------------------");

    //repeat(N): repeats the String N number of times. return type ---> String
        String str4 = "Java";
        String r = str4.repeat(3); //"JavaJavaJava"
        System.out.println(r);













    }
}
