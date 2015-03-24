package nirmalksingh.blogspot.com.algo;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import nirmalksingh.blogspot.com.algo.GuessRevealerConstants;

public class StoreLineSeparatorInByteArrayInputStream {
	
	
	public static void main(String args[]){
		
		String fiveEnters = GuessRevealerConstants.NEW_LINE
				+GuessRevealerConstants.NEW_LINE
				+GuessRevealerConstants.NEW_LINE
				+GuessRevealerConstants.NEW_LINE
				+"ready";
		
		
		byte[] testNEnter = fiveEnters.getBytes();
		
		InputStream stdin = System.in;
	    System.setIn(new ByteArrayInputStream(testNEnter));
	 
	    Scanner scanner = new Scanner(System.in);
	 
	    scanner.nextByte();
	    scanner.nextByte();
	    
	    String result = scanner.next();
		
	    
		
		try {
			System.out.print(new String(testNEnter, "UTF-8"));
			
			//System.out.print(result.);
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//ByteArrayInputStream bais = null;
		
		// create new byte array input stream
        //bais = new ByteArrayInputStream(testNEnter);
		
		
        
        
       /*
        for (byte s :testNEnter)
        {
           // covert byte to char
           char c = (char)s;
           
           // prints byte
           System.out.print(s);
//           
//           if(s==0)
//              
//              // if byte is 0
//              System.out.println(": Null");
//           else
//              
//              // if byte is not 0
//              System.out.println(": "+c);
        }
        */
        
		
	}

}
