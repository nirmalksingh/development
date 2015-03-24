package nirmalksingh.bogspot.com.algo;


	import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

	public class AccessinghRedirectedStdoutOriginal {

		static Scanner inputScanner = new Scanner(System.in);
		
	    public static void main(String[] args) {
	        // Save the old output stream to have the chance to set it back later
	    	
	    	String newLIneStr = GuessRevealerConstants.NEW_LINE;
	    	
	    	final ByteArrayInputStream inContent = new ByteArrayInputStream(new byte[20]);
	    	
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
	        
	        
	        
	        standardOut.println("Stuff");
	        
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


