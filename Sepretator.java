import java.util.Scanner;

public class Sepretator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five-digit numbers: ");
        int num = input.nextInt();
        int digit1 = num / 10000;
        int digit2 = (num % 10000) / 1000;
        int digit3 = (num % 1000) / 100;
        int digit4 = (num % 100) / 10;
        int digit5 = num % 10;
        System.out.printf("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, digit4, digit5);
    }
}
