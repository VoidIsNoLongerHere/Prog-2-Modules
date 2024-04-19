class MobileApp implements Observer {
    public void update(float temperature) {
        System.out.println("Mobile App: Temperature changed to " + temperature);
        // Perform specific behavior based on temperature update
    }
}