package nirmalksingh.blogspot.com.guessrevealer.helper;

import java.util.Scanner;

import nirmalksingh.blogspot.com.guessrevealer.helper.GuessRevealerConstants;

public class UserAnswerValidator {

	static String userInput;

	static Scanner inputScanner = InputScanner.INSTANCE;

	/*
	 * Loops for useful answer in beginning for either ready or end. 
	 * Returns to calling method.
	 */
	public static String makeReady() {
		System.out.println(GuessRevealerConstants.READY_BEGIN_END);
		userInput =inputScanner.nextLine();
		
		while (!userInput.equalsIgnoreCase(GuessRevealerConstants.READY)){
			
			if(userInput.equalsIgnoreCase(GuessRevealerConstants.READY)){
				
				break;
			
			}else if (userInput.equalsIgnoreCase(GuessRevealerConstants.END)){
				
				System.out.println(GuessRevealerConstants.ENTERED_END_EXITING);
				inputScanner.close();
				System.exit(101);
			
			}else{
				
				System.out.println(GuessRevealerConstants.READY_BEGIN_END);
				userInput =inputScanner.nextLine();
			}
		}
		return userInput;
	}
	
	/*
	 * Method for user answer; loops for useful answer and
	 * returns to calling to calling method.
	 */
	
	public static String higherLowerYesEnd(int guess) {
		System.out.print(GuessRevealerConstants.IS_HIGHER_LOWER_EQUAL_TO+guess+ GuessRevealerConstants.YES_FOR_RIGHT_HIGHER_LOWER);
		userInput =inputScanner.nextLine();
		
		while (!userInput.equalsIgnoreCase(GuessRevealerConstants.HIGHER)
				||!userInput.equalsIgnoreCase(GuessRevealerConstants.LOWER)
				||!userInput.equalsIgnoreCase(GuessRevealerConstants.YES)){
				
			
			if(userInput.equalsIgnoreCase(GuessRevealerConstants.HIGHER)
					||userInput.equalsIgnoreCase(GuessRevealerConstants.LOWER)
					||userInput.equalsIgnoreCase(GuessRevealerConstants.YES)){
				
				break;
			
			}else if (userInput.equalsIgnoreCase(GuessRevealerConstants.END)){
				
				System.out.println(GuessRevealerConstants.ENTERED_END_EXITING);
				inputScanner.close();
				System.exit(101);
			
			}else{
				
				System.out.println(GuessRevealerConstants.HIGHER_LOWER_YESR_END);
//				userInput =inputScanner.nextLine();
			}
		}
		return userInput;
	}

}
