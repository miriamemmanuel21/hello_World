import java.util.Scanner;

public class ScoreSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;
        int sum = 0;

        for (int number = 0; number < numberOfScores; number++) {
            System.out.print("Enter score " + (number + 1) + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        System.out.println("Sum of the scores: " + sum);
        scanner.close();
    }
}