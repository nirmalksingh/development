package nirmalksingh.bogspot.com.algo;


import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Test_End_And_Enters {

	public static void main(String[] args) {

		PrintStream standardOut = System.out;

		String fiveEnters = GuessRevealerConstants.NEW_LINE
						  + GuessRevealerConstants.NEW_LINE
				          + GuessRevealerConstants.NEW_LINE
				          + GuessRevealerConstants.NEW_LINE
				          + GuessRevealerConstants.NEW_LINE
				          + "end";
			              

		byte[] testNEnter = fiveEnters.getBytes();
		int count =0;
		
		try {
			//standardOut.print(new String(testNEnter, "UTF-8"));
			
			int i=0;
			while(testNEnter.length>0&&testNEnter.toString().equalsIgnoreCase(GuessRevealerConstants.READY)){
			
				
				if(testNEnter.toString().equalsIgnoreCase(GuessRevealerConstants.READY)){
					
					break;
				
				}else if (testNEnter.toString().equalsIgnoreCase(GuessRevealerConstants.END)){
					
					System.out.println(GuessRevealerConstants.ENTERED_END_EXITING);
					//inputScanner.close();
					System.exit(101);
				
			}else{
				
				standardOut.println(GuessRevealerConstants.READY_BEGIN_END);
				standardOut.print(new String(testNEnter, i++, 1, "UTF-8"));
//				testNEnter =  testNEnter.
//				System.out.println(GuessRevealerConstants.READY_BEGIN_END);
//				userInput =inputScanner.nextLine();
			}
			
			}
		} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
			/*
			  standardOut.println(GuessRevealerConstants.READY_BEGIN_END);
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
			  
			  
			 */
				
//			for(int j=0;j<testNEnter.length;i++){
//				//thie following line, effectively prints "enter"!!!!!!! That's awesome!
//				standardOut.print("this is pass# "+ ++count);
//				standardOut.print(new String(testNEnter, j, 1, "UTF-8"));
//				
//			}
			
			
			//System.out.print(new String(testNEnter, "UTF-8"));

	}

}
