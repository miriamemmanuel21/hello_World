import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;
        int sum = 0;

        for (int number = 0; number < numberOfScores; number++) {
            System.out.print("Enter score " + (number + 1) + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        double average = (double) sum / numberOfScores;
        System.out.println("Average of the scores: " + average);
       
    }
}