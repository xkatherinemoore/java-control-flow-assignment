import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// 1. Initialize any variables and objects you need (i.e. a scanner, some
		// counters for a total running sum, and a number tracking the # of scores inputted
		Scanner userInput = new Scanner(System.in);
		int sumGrades = 0;
		int numGrades = 0;
		int inputGrade = 0;
		
		
		
		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
		// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again
		
		//Grade calculator instructions
		System.out.println("Calculate your average grade by inputting your grades one at a time.");
		System.out.println("When all grades have been entered, input a negative number to calculate the grade average.");
		System.out.println("Grades over 100 will not be counted");
		
		//Grade input loop
		while (inputGrade >= 0) {
			System.out.printf("\nPlease enter your grade: \n");
			inputGrade = Integer.parseInt(userInput.nextLine());
			
			if (inputGrade > 100) {
				continue;
			}
			if (inputGrade <= 0) {
				break;
			} //Stops negative number from adding into sumGrades
			
			sumGrades += inputGrade;
			numGrades++;
		} 
		
		
		
		
		// 4. Calculate the average of all scores collected during the loop
		float gradeAvg = sumGrades / numGrades;

			
		
		// 5. Display the average grade and corresponding message
		// - If over 90: "Excellent Work!"
		// - If over 80: "Good Job!"
		// - If over 70: "Keep it up!"
		// - anything else: "Let's work hard to get those grades up!"
		
		System.out.printf("\nYour current grade is: %.2f%%\n", gradeAvg);

		if (gradeAvg >= 90) {
			System.out.println("That's an A average!\n");
			System.out.println("Excellent Work!\n");
		} else if (gradeAvg >= 80) {
			System.out.println("That's a B average!\n");
			System.out.println("Good Job!\n");
		} else if (gradeAvg >= 70) {
			System.out.println("That's a C average!\n");
			System.out.println("Keep it up!\n");
		} else {
			System.out.println("That's below a C average!\n");
			System.out.println("Let's work hard to get those grades up!\n");
		}
			
	}
}