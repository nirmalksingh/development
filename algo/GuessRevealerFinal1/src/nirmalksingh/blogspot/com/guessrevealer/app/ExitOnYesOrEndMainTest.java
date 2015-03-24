
package nirmalksingh.blogspot.com.guessrevealer.app;

import java.util.Scanner;

import nirmalksingh.blogspot.com.guessrevealer.helper.InputScanner;
import nirmalksingh.blogspot.com.guessrevealer.helper.GuessRevealerConstants;
import nirmalksingh.blogspot.com.guessrevealer.helper.UserAnswerValidator;

public class ExitOnYesOrEndMainTest {

	public static void main(String[] args) {

		int guess;
		int count=GuessRevealerConstants.ZERO;
		int low = GuessRevealerConstants.LOW_NUMBER;
		int high = GuessRevealerConstants.HIGH_NUMBER;

		String userInput = null;
		Scanner inputScanner = InputScanner.INSTANCE;

		userInput = UserAnswerValidator.makeReady();

		
		do {

			guess = (high + low) / 2;

				userInput = UserAnswerValidator.higherLowerYesEnd(guess);

				if (userInput.equals(GuessRevealerConstants.HIGHER)) {
					
					if(guess==high){
						System.out.println(GuessRevealerConstants.INCORRECT_USER_ANSWER);
						low=GuessRevealerConstants.LOW_NUMBER;
						high=GuessRevealerConstants.HIGH_NUMBER;
						count=0;
					}else{
						low = guess;
						count++;
					}

				} else if (userInput.equals(GuessRevealerConstants.LOWER)) {
					
					if(guess==low){
						System.out.println(GuessRevealerConstants.INCORRECT_USER_ANSWER);
						low=0;
						high=100000;
						count=0;
					}else{
						high = guess;
						count++;
					}

				} else if (userInput.equals(GuessRevealerConstants.YES)) {

					System.out.println(GuessRevealerConstants.CONGRATULATIONS+guess+GuessRevealerConstants.COUNT+count);
					inputScanner.close();
					System.exit(101);

				}


		} while (!userInput.equals(GuessRevealerConstants.END));

		inputScanner.close();
		System.out.println(userInput);
	}
}
