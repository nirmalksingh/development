package nirmalksingh.blogspot.com.algo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class RedirectedOutput {

    public static void main(String[] args) {
        // Save the old output stream to have the chance to set it back later
    	
    	//final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    	
        InputStream standardIn  = System.in;
        PrintStream standardOut = System.out;
        PrintStream standardErr = System.err;

        // Set useless streams
        System.setIn(new ByteArrayInputStream(new byte[0]));
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        System.setErr(new PrintStream(new ByteArrayOutputStream()));
        
       // System.setOut(new PrintStream(outContent));
        

        // Will not be shown
        System.out.println("Hello World");

        
        
        
//        try {
//			outContent.write("stuff".getBytes(StandardCharsets.UTF_8));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        
        // Now set back the old streams to have output again
        System.setIn(standardIn);
        System.setOut(standardOut);
        System.setErr(standardErr);

        // Will be shown again
        System.out.println("Finally we got the Hello");
    }

}
