import java.util.Scanner;

public class Game {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter player A name");
        int playerA = input.nextInt();

        System.out.println("Enter player B name");
        int playerB = input.nextInt();

        int player;
        if (player == 0) {
            System.out.printf("scissor");
        }
        if (player == 1) {
            System.out.printf("rock");
        }
        if (player == 2) {
            System.out.printf("papper");
        }
        if (player == 1) {
            System.out.printf("rock");
        }
        if (player == 0) {
            System.out.printf("scissor");
        }
        if (player == 1) {
            System.out.printf("rock");
        }
        if (player == 2) {
            System.out.printf("papper");
        }
        if (player == 0) {
            System.out.printf("scissor");
        }
        if (player == 1) {
            System.out.printf("rock");

        }
    }
}