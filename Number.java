import java.util.Scanner;

public class Number{

public static void main(String[]args ){

Scanner input =new Scanner( System.in);
System.out.print( "Enter number");
int num1 = input.nextInt();

if( num1 == 1){
System.out.printf("%d",0);
}
if( num1 == 0){
System.out.printf("%d",1);
}

}

}