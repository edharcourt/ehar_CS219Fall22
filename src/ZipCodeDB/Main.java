package ZipCodeDB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton",
                                  75.16, 44.59, 11781);
        System.out.println(z1.toString());

        Zipcode z2 = new Zipcode("13502", "NY",
                "Utica", 75.23,43.10, 36632);
        System.out.println(z2);

        Database db = new Database();

        System.out.println(db.findByZip("12901"));
        System.out.println(db.findByZip("hello"));

        System.out.println(db.search("43221"));

        WeatherObservation wob = db.search("13617").getWeatherData();
        System.out.println(wob);
        return;
    }
}
