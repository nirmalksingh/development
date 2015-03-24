package nirmalksingh.blogspot.com.algo;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

public class MyTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Test
	public void overrideProperty() {
		System.out.print("hello world");
		Assert.assertEquals("hello world", log.getLog());
	}

}
