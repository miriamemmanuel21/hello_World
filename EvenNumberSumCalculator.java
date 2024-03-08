import java.util.Scanner;

public class EvenNumberSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;
        int evenNumberSum = 0;

        for (int number = 0; number < numberOfScores; number++) {
            System.out.print("Enter score " + (number + 1) + ": ");
            int score = scanner.nextInt();
            if (score % 2 == 0) {
                evenNumberSum += score;
            }
        }

        System.out.println("Sum of even numbers: " + evenNumberSum);
    }
}