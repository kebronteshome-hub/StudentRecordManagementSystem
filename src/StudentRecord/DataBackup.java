package StudentRecord;

import java.io.*;

public class DataBackup {

    public static void backup() throws Exception {

        BufferedInputStream bis =
                new BufferedInputStream(
                        new FileInputStream("students.obj"));

        BufferedOutputStream bos =
                new BufferedOutputStream(
                        new FileOutputStream("backup.obj"));

        int data;

        while ((data = bis.read()) != -1)
            bos.write(data);

        bis.close();
        bos.close();
    }
}