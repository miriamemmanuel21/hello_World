import java.util.Scanner;

public class Squares {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int number1 = input.nextInt();

System.out.print("Enter second number: ");
int number2 = input.nextInt();

int square1 = number1 * number1;
int square2 = number2 * number2;
int sum = square1 + square2;
int difference = square1 - square2;

System.out.println("The square of " + number1 + " is " + square1);
System.out.println("The square of " + number2 + " is " + square2);
System.out.println("The sum of their squares is " + sum);
System.out.println("The difference of their squares is " + difference);

}  
  }