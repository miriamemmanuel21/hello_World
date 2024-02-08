import java.util.Scanner;
public class Car {
    private String model;
    private String year;
    private double price;

    
    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Setting price to 0.");
            this.price = 0;
        }
    }

   
    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    
    public String getYear() {
        return year;
    }

    
    public void setYear(String year) {
        this.year = year;
    }

    
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Price remains unchanged.");
        }
    }

    
    public void applyDiscount(double discountPercentage) {
        double discountAmount = price * (discountPercentage / 100);
        price -= discountAmount;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", "2022", 25000.0);
        Car car2 = new Car("Honda Civic", "2023", 28000.0);

        
        System.out.println("Initial prices:");
        System.out.println("Car 1: $" + car1.getPrice());
        System.out.println("Car 2: $" + car2.getPrice());

        
        car1.applyDiscount(5); // 5% discount
        car2.applyDiscount(7); // 7% discount

       
        System.out.println("\nPrices after discounts:");
        System.out.println("Car 1: $" + car1.getPrice());
        System.out.println("Car 2: $" + car2.getPrice());
    }
}
