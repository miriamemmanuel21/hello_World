import java.util.Scanner;

public class Absolutevalue {

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();

int absolute = Math.abs(number);
System.out.println("The absolute value" + number  +  " is " + absolute);
}
  }  
