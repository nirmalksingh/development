package org.nirmalksigh.algo.guessrevealer.util;

public class GetValidInputString {
	
	public static String higherLowerYesEnd(String userValidInput) {
	     String higherLowYesEnd;
	     String lowercaseInput = toLowerCase(userValidInput);
	     switch (lowercaseInput) {
	         case "higher":
	        	 higherLowYesEnd = "higher";
	             break;
	         case "lower":
	        	 higherLowYesEnd = "lower";
	             break;
	         case "yes":
	        	 higherLowYesEnd = "yes";
	             break;
	         case "end":
	        	 higherLowYesEnd = "end";
	             break;
	         default:
	             throw new IllegalArgumentException("Something is not right: " + userValidInput);
	     }
	     return higherLowYesEnd;
	}
	
	private static String toLowerCase(String userValidInput){
		String lowerCaseInput = userValidInput.toLowerCase();
		return lowerCaseInput;
	}

}
