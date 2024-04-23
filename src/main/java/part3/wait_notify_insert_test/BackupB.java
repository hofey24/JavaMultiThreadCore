package part3.wait_notify_insert_test;

/**
 * @author hofey
 **/
public class BackupB extends Thread{

    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
