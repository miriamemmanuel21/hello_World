import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int square = num * num;
        if (num == 100 && square == 1000) {
            System.out.println("The number and its square are equal to 100.");
        }  if (num == 100 || square == 1000) {
            System.out.println("The number or its square is equal to 100.");
        }  if (num > 100 && square > 1000) {
            System.out.println("The number and its square are greater than 100.");
        }  if (num < 100 && square < 1000) {
            System.out.println("The number and its square are less than 100.");
        } else {
            System.out.println("The number and its square are not equal to 100, greater than 100, or less than 100.");
        }
    }
}