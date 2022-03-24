package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {

        // examples of tabbing/indentation (\t)
        System.out.println("This was not tabbed/indented");
        System.out.println("\tThis was tabbed/indented once");
        System.out.println("\t\tThis was tabbed/indented twice");
        System.out.println("    This was tabbed/indented once without escape character");

        System.out.println("\t\t\t\texample");
        System.out.println("                example");

        // examples of next lines (\n)
        System.out.println();
        System.out.println("1) Go to store");
        System.out.println("2) Grab milk");
        System.out.println("3) wash car");

        System.out.println("\n1) Go to store\n2) Grab milk\n3) wash car");
    }
}
