/**
 * 
 */
package nirmalksingh.bogspot.com.algo;


import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author nirmalksingh
 *
 */
public class UserAnswerValidatorTest extends TestCase{
	
	static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	static Scanner inputInstance = RevealerInStream.INPUT_INSTANCE;
	static PrintStream outInstance = RevealerOutStream.OUTPUT_INSTANCE;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testMakeReady() {
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(f, false));
		
		PrintStream stdOut = System.out;
		String data = System.lineSeparator();
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		System.setOut(new PrintStream(outContent));
		
		try {
			outContent.write(data.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.setOut(stdOut);
		}
		
		RevealerInputOutPutExample.readyMethod();
		
		/*
		String outStr = outInstance.toString();
		byte[] b = "end".getBytes();
	    Assert.assertEquals(GuessRevealerConstants.READY_BEGIN_END, outStr);
	    outInstance.print(System.lineSeparator());
	    outInstance.write(20);
	    try {
			outInstance.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    */
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
//		System.setOut(null);
//		System.setErr(null);
	}	
}
