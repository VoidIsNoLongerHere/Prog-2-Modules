
public class Main {
    // Usage
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Set the payment strategy dynamically
        cart.setPaymentStrategy(new CreditCardStrategy("1234 5678 9012 3456", "12/23", "123"));
        cart.checkout(100.0);

        // Change the payment strategy at runtime
        cart.setPaymentStrategy(new PayPalStrategy("example@example.com", "password"));
        cart.checkout(50.0);

        // Gift card
        cart.setPaymentStrategy(new GiftCardStrategy("1234567890", "1234"));
        cart.checkout(200.5);
    }

}
