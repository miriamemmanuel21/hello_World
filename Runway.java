import java.until. Scanner;

 
public class RunwayPlane{

 public static void main(String[] args){
Scanner input =new Scanner(System.in);

System.out.println("enter velocity in meter per seconds");
double velocity = input.nextDouble();

System.out.println("enter accleration in meter per seconds square");
double acceleration =input.nextDouble()

double length = (velocity*velocity)/(2*acceleration);
System.out.printf("length is %.3f",length);
}

}



