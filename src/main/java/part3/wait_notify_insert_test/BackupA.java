package part3.wait_notify_insert_test;

/**
 * @author hofey
 **/
public class BackupA extends Thread{
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
