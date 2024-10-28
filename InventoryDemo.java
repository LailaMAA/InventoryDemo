import library.*;

public class InventoryDemo {
    public static void main(String[] args) {
        Product.welcomeMessage();
        
        Electronics laptop = new Electronics("Laptop", 1200.00, 10, "TechBrand", 2);
        laptop.displayInfo();

        Food apple = new Food("Apple", 0.50, 200, "12-31-2024");
        apple.displayInfo();

        System.out.println("\nUpdating quantities...");
        laptop.updateQuantity(5, true);
        laptop.displayInfo();

        apple.updateQuantity(100);
        apple.displayInfo();
    }
}
