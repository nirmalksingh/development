/*
 * This program tests for user entries of "carriage return" or the string "end".
 */

package nirmalksingh.bogspot.com.algo.testcases;

import java.io.UnsupportedEncodingException;

import nirmalksingh.bogspot.com.algo.GuessRevealerConstants;

public class TestWrong_Sequence_Higher_Lower {

	public static void main(String[] args) {
		
		
		String wrong_sequence_reset = GuessRevealerConstants.READY
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.HIGHER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.HIGHER
									+ GuessRevealerConstants.HIGHER
									+ GuessRevealerConstants.HIGHER
									+ GuessRevealerConstants.LOWER
									+ GuessRevealerConstants.HIGHER;
		/*
		You entered incorrect answer earlier, range is now reset to orignal, please re-enter...
		Please type and enter "ready" to begin or "end" to terminate 
		*/

		byte[] testWrongSequence = wrong_sequence_reset.getBytes();
		
		String userText;
		
		int guess;
		int count = 0;
		int errorCount=0;
		int low = 0;
		int high = 100000;
		
		guess = (high + low) / 2;
		
		StringBuffer strBuffer = new StringBuffer();
		
		System.out.print(GuessRevealerConstants.IS_HIGHER_LOWER_EQUAL_TO+guess+ GuessRevealerConstants.YES_FOR_RIGHT_HIGHER_LOWER);
		
		//carriageReturn = System.getProperty("line.separator").toString();
		int i=0;
//		for (int i = 0; i < testWrongSequence.length; i++) {
		while(i < testWrongSequence.length){
			
			i++;
			try {
				strBuffer.append(new String(testWrongSequence, i, 1, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// do something with testNEnter[i]
			/*try {
				String strToEval = new String(testWrongSequence, i, 1, "UTF-8");
				
				//case when it is not character 
				if(userText.equalsIgnoreCase(strToEval)){
				
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
			}*/
		}
	}

}
