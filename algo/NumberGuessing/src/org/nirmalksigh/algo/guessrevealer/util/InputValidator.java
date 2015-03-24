package org.nirmalksigh.algo.guessrevealer.util;

import java.util.Scanner;

import nirmalksingh.blogspot.com.guessrevealer.helper.InputScanner;

public class InputValidator {

	public static String getUserInput() {

		String userInput = null;
		Scanner input = InputScanner.INSTANCE;

		do {
			System.out.print("higher lower or yes");

			if (input.hasNext()) {
				userInput = input.next();
				// switch to find higher, lower, yes or end
				userInput =GetValidInputString.higherLowerYesEnd(userInput);
			}
			else if (userInput.equals("yes")) {
				input.close();
				System.exit(101);
			}
			else {
				System.out.println("Please enter higher, lower, yes or end");
				// to move the cursor to next part of the input, effectively emptying what's in the buffer.
				//input.next(); 
			}
		} while (!userInput.equals("higher")||!userInput.equals("lower")
				||!userInput.equals("yes")||!userInput.equals("end"));
		return userInput;
	}
}
