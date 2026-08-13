package distance;

import java.util.Scanner;

public class DistanceConvertor {
    Scanner sc = new Scanner(System.in);

    public void convertMeterToKm() {
        System.out.print("Enter Meter: ");
        double meter = sc.nextDouble();
        System.out.println("Kilometer = " + (meter / 1000));
    }

    public void convertKmToMeter() {
        System.out.print("Enter Kilometer: ");
        double km = sc.nextDouble();
        System.out.println("Meter = " + (km * 1000));
    }

    public void convertMilesToKm() {
        System.out.print("Enter Miles: ");
        double miles = sc.nextDouble();
        System.out.println("Kilometer = " + (miles * 1.60934));
    }

    public void convertKmToMiles() {
        System.out.print("Enter Kilometer: ");
        double km = sc.nextDouble();
        System.out.println("Miles = " + (km / 1.60934));
    }
}
