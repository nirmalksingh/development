package nirmalksingh.bogspot.com.algo;


	import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

	public class AccessingRedirectedStdout {

		static Scanner inputScanner = new Scanner(System.in);
		
	    public static void main(String[] args) {
	        // Save the old output stream to have the chance to set it back later
	    	
//	    	byte[] testNEnter = new byte[5];
	    	
//	    	String fiveEnters = GuessRevealerConstants.NEW_LINE+","
//	    						+GuessRevealerConstants.NEW_LINE+","
//	    						+GuessRevealerConstants.NEW_LINE+","
//	    						+GuessRevealerConstants.NEW_LINE+","
//	    						+GuessRevealerConstants.NEW_LINE;
	    	
	    	String fiveEnters = GuessRevealerConstants.NEW_LINE
					+GuessRevealerConstants.NEW_LINE
					+GuessRevealerConstants.NEW_LINE
					+GuessRevealerConstants.NEW_LINE;
//					+"ready";
	    	
	    	
	    	byte[] testNEnter = fiveEnters.getBytes();
	    	
	    	
//	    	for(int i=0;i<testNEnter.length;i++){
//	    		testNEnter[i] = GuessRevealerConstants.NEW_LINE.;
//	    	}
	    	
//	    	String testString = GuessRevealerConstants.NEW_LINE+" "+GuessRevealerConstants.NEW_LINE+" "+GuessRevealerConstants.NEW_LINE+" "+GuessRevealerConstants.NEW_LINE;
	    	
//	    	testNEnter = testString.getBytes();
	    	
	    	
//	    	final ByteArrayInputStream inContent = new ByteArrayInputStream(new byte[20]);
	    	
//	    	byte[] testNreturns={GuessRevealerConstants.NEW_LINE.getBytes(),GuessRevealerConstants.NEW_LINE.getBytes(),GuessRevealerConstants.NEW_LINE.getBytes(),GuessRevealerConstants.NEW_LINE.getBytes(),GuessRevealerConstants.NEW_LINE.getBytes()}
	    	
	    	final ByteArrayInputStream inContent = new ByteArrayInputStream(testNEnter);
	    	inContent.markSupported();
	    	final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    	
	    	
	        InputStream standardIn  = System.in;
	        PrintStream standardOut = System.out;
	        PrintStream standardErr = System.err;

	        // Set useless streams
//	        System.setIn(new ByteArrayInputStream(new byte[0]));
	        System.setIn(inContent);
//	      System.setOut(new PrintStream(new ByteArrayOutputStream()));
	        
	        System.setOut(new PrintStream(outContent));
	        
	        System.setErr(new PrintStream(new ByteArrayOutputStream()));

	        // retrieve the following string "Hello World" from bytestream object below
	        System.out.println("Hello World");
	        
	        String userInput;
	        
	        standardOut.println("Stuff");
	       //userInput=ByteToStringConverter.byteToString(inContent);
	        
	       //userInput = inContent.read()
	        
	    
        try {

	        standardOut.print(new String(testNEnter, "UTF-8"));
//			System.out.print(new String(testNEnter, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	        
	        Scanner myByteArInStrm = new Scanner(new InputStreamReader(inContent, StandardCharsets.UTF_8));
	        
	        
	        userInput=null;
//	        while(myByteArInStrm.hasNextByte()){
//	        	System.out.print(myByteArInStrm.nextByte());
//	        }
	       
	        while(myByteArInStrm.hasNextByte()){
//	          userInput = myByteArInStrm.next();
	          standardOut.print(myByteArInStrm. next());
	        
	        /*
	        System.out.println(GuessRevealerConstants.READY_BEGIN_END);
	        while(!userInput.equalsIgnoreCase(GuessRevealerConstants.READY)){
	        	
	        
	        	if(userInput.equalsIgnoreCase(GuessRevealerConstants.READY)){
					
					break;
				
				}
	        	else{
	        		userInput = myByteArInStrm.next();
	        	}
	        }/*
	        
	        }
	        standardOut.println(userInput+" this is from scanner");
	        
	        
	        
	        standardOut.println();
	        /*
	         *In tow of the lines above. When we do System.out.print("Hellow World"), the message "Hello World" 
	         *is in two places. 1.) in the standardOut object and 2.) in outContent object because the Syste.out
	         *has been redirected to an ByteArrayOutputStream object called outContent. The message will not be written.
	         *
	         */
	        
	        //standardOut.print(standardOut.getBytes(StandardCharsets.UTF_8));
	        
	        
	        
	        if(outContent.toString().equalsIgnoreCase("Hello World"+GuessRevealerConstants.NEW_LINE)){
	        	standardOut.println("##1Wow It Does Work.");
	        }

	        // Now set back the old streams to have output again
	        System.setIn(standardIn);
	        System.setOut(standardOut);
	        System.setErr(standardErr);

	        // Will be shown again
	        System.out.println("Finally we got the Hello");
	    }

	    }
	}


