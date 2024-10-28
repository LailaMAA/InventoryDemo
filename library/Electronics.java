package library;

public class Electronics extends Product {
    private String brand;
    private int warranty; // warranty in years

    // Constructor
    public Electronics(String name, double price, int quantity, String brand, int warranty) {
        super(name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }

    // Override displayInfo to include brand and warranty information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " years");
    }
}
