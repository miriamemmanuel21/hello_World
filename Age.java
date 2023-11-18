import java.util.Scanner;

public class Age {

public static void main(String[] args){

Scanner Scanner = new Scanner(System.in);

System.out.print("enter age in years");

int ageinyears = Scanner.nextInt();
int ageindays = ageinyears*365;
System.out.println("your age in days is:" + ageindays);
}

}