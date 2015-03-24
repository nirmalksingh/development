package nirmalksingh.bogspot.com.algo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class WriteToPrintStream {
	
	static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	public static void main(String[] args) {
		
		System.setOut(new PrintStream(outContent));
		InputStream standardIn = System.in;
		PrintStream standardOut = System.out;
		//use revealerOutStream in place of standardOut.
		PrintStream standardErr = System.err;
		// Set useless streams
		// Will not be shown
//		System.out.println("Hello World");
		String writeBytes = "Some String";
		try {
//			outContent.write(System.getProperty("line.separator").getBytes(StandardCharsets.UTF_8));
//			outContent.flush();
//			outContent.reset();
			outContent.write(writeBytes.getBytes(StandardCharsets.UTF_8));
//			MakeReadyMethod.makeReady();
		} catch (IOException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}finally{
//			System.setOut(standardOut);
		}
//		System.out.println(outContent.toString());
		// Now set back the old streams to have output again
//		System.setIn(standardIn);
//		System.setOut(standardOut);
//		System.setErr(standardErr);
	}
}