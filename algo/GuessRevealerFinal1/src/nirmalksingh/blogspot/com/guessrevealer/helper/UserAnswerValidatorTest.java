/**
 * 
 */
package nirmalksingh.blogspot.com.guessrevealer.helper;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author nirmalksingh
 *
 */


public class UserAnswerValidatorTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.setOut(null);
	}

	/**
	 * Test method for {@link nirmalksingh.blogspot.com.guessrevealer.helper.UserAnswerValidator#makeReady()}.
	 */
	@Test
	public void testMakeReady() {
//		fail("Not yet implemented");
		
		
		
//		App obj = new App();
//		Assert.assertEquals(36, obj.generateUniqueKey().length());
		UserAnswerValidator.higherLowerYesEnd(200);
		
		//for(int i=0;i<2;i++){
			System.out.println(GuessRevealerConstants.END);
			Assert.assertEquals(GuessRevealerConstants.READY_BEGIN_END, outContent.toString() );
			
//			System.out.println(outContent.toString());
			
		//}
		
		
		
		
		
	}

	/**
	 * Test method for {@link nirmalksingh.blogspot.com.guessrevealer.helper.UserAnswerValidator#higherLowerYesEnd(int)}.
	 */
	
//	@Test
//	public void testHigherLowerYesEnd() {
////		fail("Not yet implemented");
//	}
	
	/*
	Scanner scan = new Scanner(System.in);
    System.out.println("value1");
    int value1 = scan.nextInt();

    System.out.println("value2");
    int  value2 = scan.nextInt();

    System.out.println("value3");
    int value3 = scan.nextInt();

   MyClass1 numbers= new MyClass1(value1, value2, value3);
   assertThat(numbers.getValue1(),is(not(numbers.getValue2())));
	*/
	
	

}
