package nirmalksingh.blogspot.com.algo;


import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class MyIOUnitTest {

    @Test
    public void testRead() throws IOException {
        MyIOUnit unitTokens = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unitTokens.read(input);

        assertEquals("123", unitTokens.tokens.get(0));
        assertEquals("456", unitTokens.tokens.get(1));
        assertEquals("789", unitTokens.tokens.get(2));
        assertEquals("123", unitTokens.tokens.get(3));
        assertEquals("456", unitTokens.tokens.get(4));
        assertEquals("789", unitTokens.tokens.get(5));
    }
}

