package StudentRecord;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        try {

            File file = new File("students.txt");

            if (!file.exists())
                file.createNewFile();

            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length());
            System.out.println("Modified: " + file.lastModified());

            StudentManager sm = new StudentManager();

            sm.addStudent(new Student(1, "Tina", "CS", 3.8));
            sm.addStudent(new Student(2, "Samson", "IT", 3.5));
            sm.addStudent(new Student(3, "Sara", "SE", 3.9));

            sm.displayAllStudents();

            FileManager.saveText(sm.students);
            FileManager.saveBinary(sm.students);
            FileManager.saveObject(sm.students);

            StudentStatistics.generateReport(sm.students);

            DataBackup.backup();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}