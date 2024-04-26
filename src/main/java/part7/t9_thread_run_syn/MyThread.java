package part7.t9_thread_run_syn;

/**
 * @author hofey
 **/
public class MyThread extends Thread{
    private MyService service;
    private String eachThreadPrintChar;;
    private Integer eachThreadPrintPosition;

    public MyThread(MyService service, String eachThreadPrintChar, Integer eachThreadPrintPosition) {
        this.service = service;
        this.eachThreadPrintChar = eachThreadPrintChar;
        this.eachThreadPrintPosition = eachThreadPrintPosition;
    }

    @Override
    public void run() {
        service.printMethod(eachThreadPrintChar,eachThreadPrintPosition);
    }
}
