package nirmalksingh.blogspot.com.algo;

//public class StringToByteMain {
//
//}

public class StringToByteMain {

	public static void main(String[] args) {

		try {

			String str1 = "Udemy online courses";

			System.out.println("string1 = " + str1);

			// copy the contents of the String to a byte array

			byte[] arr = str1.getBytes("UTF-8");

			String str2 = new String(arr);

			System.out.println("new string = " + str2);

		} catch (Exception e) {

			System.out.print(e.toString());

		}

	}

}
