import java.util.Scanner;

public class Mulitiples1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if ((num1 * 3) % (num2 * 2) == 0) {
            System.out.println(num1 + " tripled is a multiple of " + num2 + " doubled.");
        } else {
            System.out.println(num1 + " tripled is not a multiple of " + num2 + " doubled.");
        }
    }
}
