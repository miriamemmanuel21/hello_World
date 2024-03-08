import java.util.Scanner;

public class MulitiplicationTable {

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();
int count = 1;
int result = number * count;
if(number < 1 || number > 12){
while(number < 1 || number > 12);
System.out.print("Try again");
}
while(count <= 12){
System.out.println(number + "x" + count + "=" + (number * count));
count+=1;

}
}
 }
   

