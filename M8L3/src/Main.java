public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer weatherDisplay = new WeatherDisplay();
        Observer mobileApp = new MobileApp();
        Observer weatherLogger = new WeatherLogger();

        weatherStation.addObserver(weatherDisplay);
        weatherStation.addObserver(mobileApp);
        weatherStation.addObserver(weatherLogger);

        // Simulate temperature change
        weatherStation.setTemperature(25.0f);
        System.out.println();
        // Simulate temperature change again
        weatherStation.setTemperature(30.0f);
        System.out.println();

        // Unregister an observer
        weatherStation.setTemperature(33.0f);
        weatherStation.removeObserver(mobileApp);
        System.out.println();
        System.out.println("Now we have removed the Mobile App Observer");
        weatherStation.setTemperature(33.0f);
    }
}