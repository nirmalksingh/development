package nirmalksingh.blogspot.com.algo;

public class ScratchStreamsPiped {
	
	

}

/*
public class StreamTest
{
    public static class MyOutputStream extends FilterOutputStream
    {
        public MyOutputStream(OutputStream out)
        {
            super(out);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException
        {
            byte[] text = "MyOutputStream called: ".getBytes();         
            super.write(text, 0, text.length);
            super.write(b, off, len);
        }
    }

    @Test   
    public void test()
    {       
        //Any OutputStream-implementation will do for PrintStream, probably
        //you'll want to use the one from the logging framework
        PrintStream outStream = new PrintStream(new MyOutputStream(System.out), true);  //Direct to MyOutputStream, autoflush
        System.setOut(outStream); 

        System.out.println("");
        System.out.print("TEST");
        System.out.println("Another test");
    }
}
*/


/*
**********************************************
*/

/*
Here is an example of using the class:

OutputCaputre outputCapture = new OutputCaputre() {
    protected void userFilter(String line) {
        downstream.println("Capture: " + line);
    }       
};
System.out.println("do you see me captured?");
// here is your test    
outputCapture.terminate(); // finally, stop capturing

*/

//***********************************


/**
 * Once started, std output is redirected to this thread. 
 * Thread redirects all data to the former system.out and
 * captures some strings.*/
/*
static abstract class OutputCaputre extends Thread {

    // overrdie these methods for System.err
    PrintStream getDownstream() { return System.out;}
    void restoreDownstream() { System.setOut(downstream);}

    // will be called for every line in the log
    protected abstract void userFilter(String line);

    final PrintStream downstream;
    public final PipedInputStream pis;
    private final PipedOutputStream pos;
    OutputCaputre() throws IOException {
        downstream = getDownstream();

        pos = new PipedOutputStream();
        pis = new PipedInputStream(pos);
        System.setOut(new PrintStream(pos));

        start();
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(pis));

            // once output is resotred, we must terminate
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    return;
                }
                downstream.println(line);
                userFilter(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void terminate() throws InterruptedException, IOException {
        restoreDownstream(); // switch back to std
        pos.close(); // there will be no more data - signal that
        join(); // and wait until capture completes
    }
};

*/