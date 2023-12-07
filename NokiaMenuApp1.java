import java.util.Scanner;

public class NokiaMenuApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Nokia 3310 Menu");
        displayMainMenu();

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                displayPhoneBookMenu();
                int phoneBookInput = scanner.nextInt();
                if (phoneBookInput == 1) {
                    System.out.println("Search");
                } else if (phoneBookInput == 8) {
                    displayPhoneBookOptionsMenu();
                    int phoneBookOptionsInput = scanner.nextInt();
                    if (phoneBookOptionsInput == 1) {
                        System.out.println("Type of view");
                    } else if (phoneBookOptionsInput == 2) {
                        System.out.println("Memory status");
                    } else {
                        System.out.println("Invalid option");
                    }
                } else {
                    System.out.println("Invalid option");
                }
                break;
            case 2:
                System.out.println("Messages");
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("Call Register");
                break;
            case 5:
                System.out.println("Tones");
                break;
            case 6:
                System.out.println("Settings");
                break;
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.println("Clock");
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("Sim Services");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private static void displayMainMenu() {
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call Register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call Divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");
    }

    private static void displayPhoneBookMenu() {
        System.out.println("1. Search");
        System.out.println("2. Service Nos");
        System.out.println("3. Add Name");
        System.out.println("4. Erase");
        System.out.println("5. Edit");
        System.out.println("6. Assign tone");
        System.out.println("7. Send B' Card");
        System.out.println("8. Options");
        System.out.println("9. Speed Dials");
        System.out.println("10. Voice Tags");
    }

    private static void displayPhoneBookOptionsMenu() {
        System.out.println("1. Type of view");
        System.out.println("2. Memory status");
    }
}
