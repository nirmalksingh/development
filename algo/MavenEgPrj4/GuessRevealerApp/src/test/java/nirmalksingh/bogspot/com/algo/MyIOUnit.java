package nirmalksingh.bogspot.com.algo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyIOUnit {

    protected static List<String> tokens = new ArrayList<String>();

    public void read(InputStream input) throws IOException {
//    public static void main(InputStream input) throws IOException {
        StringBuilder builder = new StringBuilder();

        int data = input.read();
        while(data != -1){
            if(((char)data) != ','){
                builder.append((char) data);
            } else {
                tokens.add(builder.toString().trim());
                builder.delete(0, builder.length());
            }

            data = input.read();
        }
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class MyIOUnitTest {

    @Test
    public void testRead() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));
        assertEquals("456", unit.tokens.get(1));
        assertEquals("789", unit.tokens.get(2));
        assertEquals("123", unit.tokens.get(3));
        assertEquals("456", unit.tokens.get(4));
        assertEquals("789", unit.tokens.get(5));
    }
}
*/