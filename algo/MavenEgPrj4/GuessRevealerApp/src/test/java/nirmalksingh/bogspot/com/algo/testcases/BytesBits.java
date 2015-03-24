package nirmalksingh.bogspot.com.algo.testcases;

import nirmalksingh.bogspot.com.algo.GuessRevealerConstants;

public class BytesBits {

	public static void main(String args[]) {

		String fiveEnters = GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE
				+ GuessRevealerConstants.NEW_LINE;

		byte[] testNEnter = fiveEnters.getBytes();
		int i=0;
//		byte[] theoneBitByte;
		for (byte b : testNEnter) {
//			System.out.print(new String(testNEnter, i, 1, "UTF-8"));
		}
	}
}
