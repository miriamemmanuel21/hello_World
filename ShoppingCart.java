import java.util.ArrayList;
import java.util.Scanner;

class ShoppingCart {
    private String name;
    private double price;
    private int quantity;

    public ShoppingCart(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ShoppingCart> cart = new ArrayList<>();

        System.out.print("Enter product name: ");
        String product1Name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double product1Price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int product1Quantity = scanner.nextInt();

        ShoppingCart product = new ShoppingCart(product1Name, product1Price, product1Quantity);
        cart.add(product);

        System.out.println("\nCustomer Invoice:");
        System.out.println("Product\t\tQuantity\tPrice\tTotal");
        System.out.println("---------------------------------------");
        for (ShoppingCart p : cart) {
            System.out.printf("%s\t\t%d\t\t%.2f\t%.2f%n", p.getName(), p.getQuantity(), p.getPrice(), p.getTotalPrice());
        }

        double total = 0;
        for (ShoppingCart p : cart) {
            total += p.getTotalPrice();
        }

        double discountedTotal = 0.25 * total;
        double vat = 0.75 * discountedTotal;

        System.out.println("\nTotal Price (after discount): $" + discountedTotal);
        System.out.println("VAT (0.075%): $" + vat);
    }
}


