package nirmalksingh.blogspot.com.algo.testcases;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import nirmalksingh.blogspot.com.algo.GuessRevealerConstants;

public class TestEnters {

	/*public static void main(String[] args) {

		PrintStream standardOut = System.out;

		String fiveEnters = GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE;

		byte[] testNEnter = fiveEnters.getBytes();
		int count = 0;

		try {
			// standardOut.print(new String(testNEnter, "UTF-8"));

			int i = 0;
			while (testNEnter.toString().equalsIgnoreCase(
					GuessRevealerConstants.READY)) {

				if (testNEnter.toString().equalsIgnoreCase(
						GuessRevealerConstants.READY)) {

					break;

				} else if (testNEnter.toString().equalsIgnoreCase(
						GuessRevealerConstants.END)) {

					System.out
							.println(GuessRevealerConstants.ENTERED_END_EXITING);
					// inputScanner.close();
					System.exit(101);

				} else {

					standardOut.println(GuessRevealerConstants.READY_BEGIN_END);
					standardOut.print(new String(testNEnter, i++, 1, "UTF-8"));
					// testNEnter = testNEnter.
					// System.out.println(GuessRevealerConstants.READY_BEGIN_END);
					// userInput =inputScanner.nextLine();
				}

			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}*/
	
	public static void main(String[] args) {

		PrintStream standardOut = System.out;

		String fiveEnters = GuessRevealerConstants.NEW_LINE
						  + GuessRevealerConstants.NEW_LINE
				          + GuessRevealerConstants.NEW_LINE
				          + GuessRevealerConstants.NEW_LINE
				          + GuessRevealerConstants.NEW_LINE;
			              

		byte[] testNEnter = fiveEnters.getBytes();
		int count =0;
		
		try {
			//standardOut.print(new String(testNEnter, "UTF-8"));
			
			for(int i=0;i<testNEnter.length;i++){
				//thie following line, effectively prints "enter"!!!!!!! That's awesome!
				standardOut.print("this is pass# "+ ++count);
				standardOut.print(new String(testNEnter, i, 1, "UTF-8"));
				
			}
			
			
			//System.out.print(new String(testNEnter, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
