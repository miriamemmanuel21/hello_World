import java.util.Scanner;

public class ComparingInteger1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int num = input.nextInt();

int square = num * num;
if (num > 100 ) {
System.out.println(num + " squared is " + square + ", which is greater than 100.");
    } else if (square == 100) {
      System.out.println(num + " squared is " + square + ", which is equal to 100.");
    } else {
      System.out.println(num + " squared is " + square + ", which is less than 100.");
      }
         }
            }
