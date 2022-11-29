package ZipCodeDB;

public class WeatherObservation {

    private double humidity;
    private double windspeed;
    private double temperature;
    private String clouds;

    public WeatherObservation(double humidity, double windspeed, double temperature, String clouds) {
        this.humidity = humidity;
        this.windspeed = windspeed;
        this.temperature = temperature;
        this.clouds = clouds;
    }

    @Override
    public String toString() {
        return "WeatherObservation{" +
                "humidity=" + humidity +
                ", windspeed=" + windspeed +
                ", temperature=" + temperature +
                ", clouds='" + clouds + '\'' +
                '}';
    }
}
