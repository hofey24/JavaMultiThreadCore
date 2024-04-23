package part3.pipe_input_output;

import java.io.PipedOutputStream;

/**
 * @author hofey
 **/
public class ThreadWrite extends Thread{
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out)
    {
        this.write = write;
        this.out = out;
    }

    public void run()
    {
        write.writeMethod(out);
    }
}
