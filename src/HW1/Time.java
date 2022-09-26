package HW1;

public class Time {
    public static void main(String [] args) {
        int hour = 15;
        int minute = 23;
        int sec = 20;

        // Seconds since midnight
        int ssm = hour * 60 * 60 + minute * 60 + sec;

        System.out.println("Homework 1");
        System.out.println(hour + ":" + minute + ":" + sec + " is " +
                ssm + " seconds since midnight");

        // Seconds in a day
        double sid = 24*60*60.0;

        System.out.println(Math.round(ssm/sid*100) + "% of the day has elapsed");
    }
}
