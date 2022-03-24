package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE CHOOSE A LANGUAGE: \n1 - English\n2 - Spanish\n3 - Turkish\n4 - Russian\n5 - French");
        int option = input.nextInt();
        String output;
        if (option == 1) {
            output = "hello, thank for your call";
        } else if (option == 2) {
            output = "hola, gracias para llamar";
        } else if (option == 3) {
            output = "merhaba, aradiginiz icin tesekkurler";
        } else if (option == 4) {
            output = "privet, spasibo za vash zvonok";
        } else if (option == 5) {
            output = "Merci ,pour votre appel";
        } else {
            output = "We will use English by default";
        }
    }
}

/*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message:

    1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
     */