package part3.wait_notify_insert_test;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 10; i++) {
            BackupB backupB = new BackupB(dbTools);
            backupB.start();
            BackupA backupA = new BackupA(dbTools);
            backupA.start();
        }
    }
}
