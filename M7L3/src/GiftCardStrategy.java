public class GiftCardStrategy implements PaymentStrategy{
    private String cardNumber, pin;

    public GiftCardStrategy(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paying $%.2f with gift card.%n", amount);
    }
}
