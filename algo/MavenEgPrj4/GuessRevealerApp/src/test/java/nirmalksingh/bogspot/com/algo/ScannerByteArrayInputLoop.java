package nirmalksingh.bogspot.com.algo;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ScannerByteArrayInputLoop {

	public static void main(String[] args) {

		String fiveEnters = 
				 	GuessRevealerConstants.NEW_LINE
				  + GuessRevealerConstants.NEW_LINE
				  + GuessRevealerConstants.NEW_LINE
				  + GuessRevealerConstants.NEW_LINE;

		byte[] testNEnter = fiveEnters.getBytes();

		final ByteArrayInputStream inContent = new ByteArrayInputStream(
				testNEnter);
		inContent.markSupported();
		System.setIn(inContent);

		Scanner myByteArInStrm = new Scanner(new InputStreamReader(inContent,
				StandardCharsets.UTF_8));

//		System.out.println("the size is: "+myByteArInStrm.)
		
		String userInput = null;

//		while (myByteArInStrm.hasNextByte()) {

			System.out.println(GuessRevealerConstants.READY_BEGIN_END);
			userInput = myByteArInStrm.next();
			int count =0;
			while (!userInput.equalsIgnoreCase(GuessRevealerConstants.READY)) {

				if (userInput.equalsIgnoreCase(GuessRevealerConstants.READY)) {

					break;

				} else {
					System.out.println(GuessRevealerConstants.READY_BEGIN_END);
					userInput = myByteArInStrm.next();
				}
				System.out.println(count++);
			}
			
			System.out.println(count++);
			
			myByteArInStrm.close();

//		}

	}

}
