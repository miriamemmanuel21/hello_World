import java.util.Scanner;

public class Circle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        System.out.printf("Diameter is %d%n", 2 * radius);
       // System.out.printf("Circumference is %d%n", 2 * 3.14159 * radius);
        //System.out.printf("Area is %.2d%n", 3.14159 * radius * radius);
    }
}