package nirmalksingh.bogspot.com.algo;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MyIOUnitExample {

    protected List<String> tokens = new ArrayList<String>();

    public void write(OutputStream output) throws IOException {
        for(int i=0; i<tokens.size(); i++){
            if(i>0){
                output.write(',');
            }
            output.write(tokens.get(i).getBytes());
       }
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;


public class MyIOUnitTest {

    @Test
    public void testWrite() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }
}
*/
