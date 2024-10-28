package library;

public class Food extends Product {
    private String expirationDate;

    // Constructor
    public Food(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    // Override displayInfo to include expiration date information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expiration Date: " + expirationDate);
    }
}
