class WeatherDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Weather Display: Temperature changed to " + temperature);
        // Perform specific behavior based on temperature update
    }
}