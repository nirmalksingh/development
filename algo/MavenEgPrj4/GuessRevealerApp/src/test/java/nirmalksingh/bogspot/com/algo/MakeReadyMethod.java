package nirmalksingh.bogspot.com.algo;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class MakeReadyMethod {
	
	static Scanner inputScanner = InputScanner.INSTANCE;// new Scanner(System.in);
	static ByteArrayOutputStream outContent = MyByteArrOutStream.BYTE_ARR_OUT_INSTANCE;
	
//	static PrintStream standardOut = System.out;
	
	/*
	 * Loops for useful answer in beginning for either ready or end. 
	 * Returns to calling method.
	 */
	
	static String userInput;
	
	public static void makeReady(String[] args){//makeReady() {
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
	}
	

}
