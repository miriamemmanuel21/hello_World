import java.util.Scanner;

public class SmallestLargest {
  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    int number1;
    int number2;
    int number3;
    int sum;
    int average;
    int product;
    int largest;
    int smallest;

    System.out.print ("Enter First Number: ");
    number1 = input.nextInt ();
    System.out.print ("Enter Second Number: ");
    number2 = input.nextInt ();
    System.out.print ("Enter Third Number: ");
    number3 = input.nextInt ();

    sum = number1 + number2 + number3;
    average = sum / 3;
    product = number1 * number2 * number3;

    largest = number1;
    smallest = number1;

    if (number2 > largest)
      largest = number2;
    if (number3 > largest)
      largest = number3;
    if (number2 < smallest)
      smallest = number2;
    if (number3 < smallest)
      smallest = number3;

    System.out.println ("The sum is " + sum);
    System.out.println ("The average is " + average);
    System.out.println ("The product is " + product);
    System.out.println ("The smallest number is " + smallest + " and the largest number is " + largest + ".");
  }
}