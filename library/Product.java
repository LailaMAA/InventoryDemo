package library;

public class Product {
    protected String name;
    protected double price;
    protected int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Display product information
    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Update quantity with a new quantity
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Overloaded method to update quantity by adding to the existing amount
    public void updateQuantity(int addedQuantity, boolean addToExisting) {
        if (addToExisting) {
            this.quantity += addedQuantity;
        } else {
            this.quantity = addedQuantity;
        }
    }

    // Get price of the product
    public double getPrice() {
        return price;
    }

    // Static method to print a welcome message
    public static void welcomeMessage() {
        System.out.println("Welcome to the Inventory Management System!");
    }
}
