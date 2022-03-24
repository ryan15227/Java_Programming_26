package day33_methods;

public class GetCharacters {



    public static void AZ(){
        for (char AZ = 'A'; AZ <= 'Z'; AZ++){
            System.out.print(AZ + " ");
        }
        System.out.println();
    }
    public static void az(){
        for (char az = 'a'; az <= 'z'; az++){
            System.out.print(az + " ");
        }
        System.out.println();
    }
    public static void ZA(){
        for (char ZA = 'Z'; ZA >= 'A'; ZA--){
            System.out.print(ZA + " ");
        }
        System.out.println();
    }
    public static void za(){
        for (char za = 'z'; za >= 'a'; za--){
            System.out.print(za + " ");
        }
        System.out.println();
    }
    public static void zeroToNine(){
        for (int zeroToNine = 0; zeroToNine <= 9; zeroToNine++){
            System.out.print(zeroToNine + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AZ();

        az();

        za();

        ZA();

        zeroToNine();

    }


    /*

        make a method that prints all the letters from A - Z

        make a method that prints all the letters from a - z

        make a method that prints all the letters from Z - A

        make a method that prints all the letters from z - a

        make a method that prints all the numbers from 0 - 9
     */
}
