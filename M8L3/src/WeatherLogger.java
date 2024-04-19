import java.sql.SQLOutput;

public class WeatherLogger implements Observer{
    @Override
    public void update(float temperature) {
        System.out.printf("Temperature is now: %s°", temperature);
    }
}
