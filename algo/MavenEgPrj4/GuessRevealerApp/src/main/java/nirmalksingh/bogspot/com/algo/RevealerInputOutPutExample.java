package nirmalksingh.bogspot.com.algo;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class RevealerInputOutPutExample {

	static String userInput;
	static Scanner inputInstance = RevealerInStream.INPUT_INSTANCE;
	static PrintStream outInstance = RevealerOutStream.OUTPUT_INSTANCE;

	public static void readyMethod() {

		
		
		 System.setIn(new ByteArrayInputStream(new byte[0]));
		
		outInstance.println(GuessRevealerConstants.READY_BEGIN_END);

		userInput = inputInstance.nextLine();

		while (!userInput.equalsIgnoreCase(GuessRevealerConstants.READY)) {

			if (userInput.equalsIgnoreCase(GuessRevealerConstants.READY)) {

				break;

			} else if (userInput.equalsIgnoreCase(GuessRevealerConstants.END)) {

				System.out.println(GuessRevealerConstants.ENTERED_END_EXITING);
				inputInstance.close();
				System.exit(101);

			} else {

				System.out.println(GuessRevealerConstants.READY_BEGIN_END);
				userInput = inputInstance.nextLine();
			}
		}
	}
}
