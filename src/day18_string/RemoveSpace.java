package day18_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String s = "   Saturday   ";
        System.out.println(s);
        System.out.println(s.length());

        s = s.trim();  // gets rid of spaces at the beginning or the end of the line

        System.out.println(s);
        System.out.println(s.length());

        String str = "  java is fun.... sometimes    ";
      //  System.out.println(str.trim());
        str = str.trim();
        System.out.println(str.startsWith("java"));


    }
}
