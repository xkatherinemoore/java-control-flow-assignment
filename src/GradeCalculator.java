import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first assignment score
        System.out.println("Enter the assignment scores (enter a negative value to end):");

        // Variables to hold the sum and count of valid scores
        int scoreSum = 0;
        int numScores = 0;

        // Loop endlessly to collect assignment scores
        while (true) {
            // Prompt for an assignment score
            System.out.print("Score: ");
            int score = scanner.nextInt();

            // Check for termination condition
            if (score < 0) {
                break; // Exit the loop when a negative score is entered
            }

            // Validate the score
            if (score > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                continue; // Skip the current iteration and start the loop from the beginning to ask for another score
            }

            // Add the valid score to the sum and increment the count
            scoreSum += score;
            numScores++;
        }

        scanner.close();

        // Calculate the average grade. Make sure to cast to a double to get a precise answer
        double average = (double) scoreSum / numScores;

        // Display the average grade and corresponding message
        System.out.println("Average grade: " + average);

        if (average >= 90) {
            System.out.println("Excellent work!");
        } else if (average >= 80) {
            System.out.println("Good job!");
        } else if (average >= 70) {
            System.out.println("Keep it up!");
        } else {
            System.out.println("You need to work harder.");
        }
    }
}
