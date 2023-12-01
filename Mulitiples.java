import java.util.Scanner;

public class  Mulitiples{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int first = input.nextInt();

    System.out.print("Enter the second number: ");
    int second = input.nextInt();

    if ((first * 3) % (second * 2) == 0) {
      System.out.println(first * 3 + " is a multiple of " + second * 2);
    } else {
      System.out.println(first * 3 + " is not a multiple of " + second * 2);
    }
  }
}