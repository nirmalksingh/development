package nirmalksingh.bogspot.com.algo;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintEnter_with_NewStringOfByteUTF8 {

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
