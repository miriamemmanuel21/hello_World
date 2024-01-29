
import java.util.Scanner;

public class WomenDrip {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("What is your name: ");
                String name = input.nextLine();
                System.out.println(" Welcome my dear " + name + " !");

                System.out.println(" Babe When was the last time you saw your drip");
                String answer = input.nextLine();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the date of the first day of your last drip girl!");
                System.out.print("Enter the  date in this format dd/mm/yyyy: ");
                String inputDate = scanner.nextLine();
                System.out.println("Your last drip happened on the : " + inputDate);
                System.out.print("Enter the length of your menstrual cycle (in days): ");
                int cycleLength = input.nextInt();
                String firstDay = input.nextLine();
                input.close();

                String[] dateParts = firstDay.split("-");
                int year = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int day = Integer.parseInt(dateParts[2]);

                int periodLength = day;
                int lastDay = day + periodLength - 1;
                if (lastDay > 28) {
                        lastDay -= 28;
                        month++;
                }
                if (month > 12) {
                        month -= 12;
                        year++;
                }

                
                int nextPeriod = day + cycleLength;
                if (nextPeriod > 28) {
                        nextPeriod -= 28;
                        month++;
                }
                if (month > 12) {
                        month -= 12;
                        year++;
                }

                System.out.println("Your period started on " + firstDay + " and ended on " + year + "-" + month + "-" + lastDay + ".");
                System.out.println("Your next period is expected to start on " + year + "-" + month + "-" + nextPeriod + ".");
        }
}