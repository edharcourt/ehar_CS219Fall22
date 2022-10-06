package UnladenSwallowSpeed;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class AverageSpeed {

    public static double avg_swallow_speed() {

        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;

        // read each line of the web file
        while (true) {

            if (!s.hasNextLine())
                break;

            String line = s.nextLine();  // read a line of the web site

            if (line.indexOf("#") == -1) {   // modify condition
                sum = sum + Double.parseDouble(line);
                count++;
            }

        }

        return sum / count;
    } // avg_swallow_speed

    public static void main(String [] args) {
        System.out.printf("Average swallow speeds is %.2f\n", avg_swallow_speed());
    }
}
