import java.util.Scanner;

public class NokiaMenuApp {
 public static void main(String[] args) {
  System.out.println("Welcome to Nokia 3310 Menu");
  displayMainMenu();

  Scanner scanner = new Scanner(System.in);
  int userInput = scanner.nextInt();

  switch (userInput) {
   case 1:
   displayPhonebookMenu();
   int phonebookInput = scanner.nextInt();
   if (phonebookInput == 1) {
    System.out.println("Search");
                
 displayPhonebookoptionsMenu();
  int phonebookoptionsInput = scanner.nextInt();
 
         