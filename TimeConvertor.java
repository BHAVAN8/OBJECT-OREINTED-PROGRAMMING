package time;

import java.util.Scanner;

public class TimeConvertor {
    Scanner sc = new Scanner(System.in);

    public void convertHourToMinute() {
        System.out.print("Enter Hour: ");
        double hour = sc.nextDouble();
        System.out.println("Minutes = " + (hour * 60));
    }

    public void convertMinuteToHour() {
        System.out.print("Enter Minutes: ");
        double minute = sc.nextDouble();
        System.out.println("Hours = " + (minute / 60));
    }

    public void convertHourToSeconds() {
        System.out.print("Enter Hour: ");
        double hour = sc.nextDouble();
        System.out.println("Seconds = " + (hour * 3600));
    }

    public void convertSecondsToHour() {
        System.out.print("Enter Seconds: ");
        double seconds = sc.nextDouble();
        System.out.println("Hours = " + (seconds / 3600));
    }
}
