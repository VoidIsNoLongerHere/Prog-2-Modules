import java.sql.SQLOutput;

public class WeatherLogger implements Observer{
    @Override
    public void update(float temperature) {
        System.out.printf("Logger: Temperature is now: %s°", temperature);
    }
}
