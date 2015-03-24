/*
 * This program tests for user entries of "carriage return" or the string "end".
 */

package nirmalksingh.blogspot.com.algo.guessrevealer.promoted.staged;

import java.io.UnsupportedEncodingException;

import nirmalksingh.blogspot.com.algo.GuessRevealerConstants;

/**
 * 
 * @author nirmalksingh
 * 
 */

public class TestCarriageReturn_and_End {

	public static void main(String[] args) {

		String fiveEnters = GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+"end"
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+"end";

		byte[] testNEnter = fiveEnters.getBytes();
		
		String carriageReturn;
		
		StringBuffer strBuffer = new StringBuffer();
		
		System.out.println(GuessRevealerConstants.READY_BEGIN_END);
		
		carriageReturn = System.getProperty("line.separator").toString();
		
		for (int i = 0; i < testNEnter.length; i++) {
			// do something with testNEnter[i]
			try {
				String strToEval = new String(testNEnter, i, 1, "UTF-8");
				
				//case when it is not character 
				if(carriageReturn.equalsIgnoreCase(strToEval)){
				
					System.out.print(strToEval);
					System.out.println(GuessRevealerConstants.READY_BEGIN_END);
				
				//case when it is character.
				//so read until you hit the non character.
				}else{
					if(!strToEval.equalsIgnoreCase(carriageReturn)){
						strBuffer.append(new String(testNEnter, i, 1, "UTF-8"));
						if(strBuffer.toString().equalsIgnoreCase(GuessRevealerConstants.END)){
							System.out.println(GuessRevealerConstants.ENTERED_END_EXITING);
							System.exit(101);
						}
					}
				}
					
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
