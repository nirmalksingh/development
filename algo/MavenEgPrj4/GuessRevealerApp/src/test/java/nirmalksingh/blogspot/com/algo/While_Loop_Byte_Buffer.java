package nirmalksingh.blogspot.com.algo;

//public class While_Loo_Byte_Buffer {

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

import nirmalksingh.blogspot.com.algo.GuessRevealerConstants;

public class While_Loop_Byte_Buffer {
	public static void main(String[] args) {

		PrintStream standardOut = System.out;

		String fiveEnters = GuessRevealerConstants.NEW_LINE
							+ GuessRevealerConstants.NEW_LINE
							+ GuessRevealerConstants.NEW_LINE
							+ GuessRevealerConstants.NEW_LINE
							+ GuessRevealerConstants.NEW_LINE 
							+ "end";

		byte[] testNEnter = fiveEnters.getBytes();
//		[10, 10, 10, 10, 10, 101, 110, 100]

		// ByteBuffer bb = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, 0, 0, 0, 'a'
		// });

		ByteBuffer byteBuffer = ByteBuffer.wrap(testNEnter);

		byteBuffer.rewind();

		// System.out.println("Byte Buffer");

		// while (byteBuffer.hasRemaining()){
		// System.out.println(byteBuffer.position() + " -> " +
		// byteBuffer.get());
		// }

		try {
			// standardOut.print(new String(testNEnter, "UTF-8"));
			int i = 0;
			System.out.println(GuessRevealerConstants.READY_BEGIN_END);
			while (byteBuffer.toString().equalsIgnoreCase(GuessRevealerConstants.READY)) {

				if (byteBuffer.toString().equalsIgnoreCase(GuessRevealerConstants.READY)) {

					break;

				} else if (byteBuffer.toString().equalsIgnoreCase(GuessRevealerConstants.END)) {

					System.out.println(GuessRevealerConstants.ENTERED_END_EXITING);
					// inputScanner.close();
					System.exit(101);

				} else {
//					if(){
						
//					}

					standardOut.println(GuessRevealerConstants.READY_BEGIN_END);
					if(i<testNEnter.length){
						
						standardOut.print(new String(testNEnter, i++, 1, "UTF-8"));
					}
//					else{
//						if(byteBuffer.get(dst, offset, length)){
//							
//						}
					}
					// testNEnter = testNEnter.
					// System.out.println(GuessRevealerConstants.READY_BEGIN_END);
					// userInput =inputScanner.nextLine();
				}

			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}finally {
			//todo
			System.out.println("print it");
		}

	}
}
