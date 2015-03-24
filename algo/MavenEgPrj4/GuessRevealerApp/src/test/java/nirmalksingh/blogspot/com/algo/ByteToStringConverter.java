package nirmalksingh.blogspot.com.algo;

import java.io.ByteArrayInputStream;

public class ByteToStringConverter {

	public static String byteToString(ByteArrayInputStream is) {
		int size = is.available();
		char[] theChars = new char[size];
		byte[] bytes = new byte[size];

		is.read(bytes, 0, size);
		for (int i = 0; i < size;)
			theChars[i] = (char) (bytes[i++] & 0xff);

		return new String(theChars);
	}
}
