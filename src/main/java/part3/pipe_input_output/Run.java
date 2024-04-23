package part3.pipe_input_output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedOutputStream out = new PipedOutputStream();
            PipedInputStream in = new PipedInputStream();
            //使两个管道之间产生通信连接，这样才可以将数据进行输出与输入
            in.connect(out);
            out.connect(in);

            ThreadRead threadRead = new ThreadRead(readData, in);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, out);

            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
