package nirmalksingh.blogspot.com.guessrevealer.app;

import java.util.Scanner;

import nirmalksingh.blogspot.com.guessrevealer.helper.InputScanner;
import nirmalksingh.blogspot.com.guessrevealer.helper.GuessRevealerConstants;
import nirmalksingh.blogspot.com.guessrevealer.helper.UserAnswerValidator;

public class GuessRevealerApp {

	public static void main(String[] args) {
		guessUserNumber();
	}

	private static void guessUserNumber() {
		int guess;
		int count = 0;
		int errorCount=0;
		int low = 0;
		int high = 100000;

		String userInput = null;
		Scanner inputScanner = InputScanner.INSTANCE;

		userInput = UserAnswerValidator.makeReady();

		do {
			guess = (high + low) / 2;
			userInput = UserAnswerValidator.higherLowerYesEnd(guess);
			if (userInput.equals(GuessRevealerConstants.HIGHER)) {
				
				/*
				 * Check for erroneous user answer, reset range for low high
				 * Restart the guessing game
				 */
				if (guess == high || guess==low) {
					System.out.println(GuessRevealerConstants.INCORRECT_USER_ANSWER);
					low = 0;
					high = 100000;
					errorCount++;
					if(errorCount>0){
						userInput = UserAnswerValidator.makeReady();;
					}
				} else {
					low = guess;
					count++;
				}

			} else if (userInput.equals(GuessRevealerConstants.LOWER)) {

				/*
				 * Check for erroneous user answer, reset to original range for low high
				 * Restart the guessing game
				 */
				if (guess == low||guess==high) {
					System.out.println(GuessRevealerConstants.INCORRECT_USER_ANSWER);
					low = 0;
					high = 100000;
					errorCount++;
					if(errorCount>0){
						userInput = UserAnswerValidator.makeReady();;
					}
				} else {
					high = guess;
					count++;
				}

			} else if (userInput.equals(GuessRevealerConstants.YES)) {

				System.out.println(GuessRevealerConstants.CONGRATULATIONS + guess + GuessRevealerConstants.COUNT + count);
				inputScanner.close();
				System.exit(101);
			}

		} while (!userInput.equals(GuessRevealerConstants.END));

		inputScanner.close();
		System.out.println(userInput);
	}
}