package nirmalksingh.bogspot.com.algo;

import java.io.PrintStream;
import java.nio.ByteBuffer;

public class BytesAndStrings {

	// final String result = new String(datasink,0x00000000,sizeToRead);//

	public static void main(String[] args) {

		PrintStream standardOut = System.out;

		String fiveEnters = GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE + "end";

		byte[] testNEnter = fiveEnters.getBytes();
		// [10, 10, 10, 10, 10, 101, 110, 100]

		// ByteBuffer bb = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, 0, 0, 0, 'a'
		// });

		ByteBuffer byteBuffer = ByteBuffer.wrap(testNEnter);

		byteBuffer.rewind();

		final String result = new String(testNEnter, 0x00000000, 6);//

		System.out.print(result);
		
		

	}
}
