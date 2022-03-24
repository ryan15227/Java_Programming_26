package day31_arrays;

public class AWS {
    public static void main(String[] args) {

        // app and we want to deploy on multiple zones

        String app = "etsy";
        String zones = "us-east,us-west1,us-west2,us-west3";

        String [] allZones = zones.split(",");

        for(String zone : allZones){
            System.out.println(app + " is deploying on " + zone);
        }

        System.out.println();
        System.out.println("The loop beneath is traditional loop");
        System.out.println();

        for (int i = 0; i < allZones.length; i++) {
            System.out.println(app + " is deploying on " + allZones[i]);
        }

    }
}
