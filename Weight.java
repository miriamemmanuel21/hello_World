import java.util.Scanner;



public class Weight {
	public static void main(String[] args){
	Scanner input1 = new Scanner(System.in);

	System.out.print("input weight in pounds: ");
	double pounds = input1.nextDouble();
	double constant1 = 0.4535927;

	double kilogram = pounds*constant1;

	System.out.printf("%.2f in Pounds to Kilogram is: %.6f%n ",pounds,kilogram);
	
	Scanner input2 = new Scanner(System.in);

	
	System.out.print("input height in inches; ");
	double inches = input2.nextDouble();
	double constant2 = 0.0254;

	double meter = inches*constant2;

	System.out.printf("%.2f in inches to meters is: %.6f ",inches,meter);
	double meter2 = meter*meter;
	double bmi = kilogram/(meter*meter);
	System.out.print("body mass index is: "+bmi);
	}

}




