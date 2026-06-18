package StudentRecord;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public static void saveText(List<Student> students) throws Exception {

        PrintWriter pw = new PrintWriter("students.txt");

        for (Student s : students) {
            pw.println(s);
        }

        pw.close();
    }

    public static void loadText() throws Exception {

        Scanner sc = new Scanner(new File("students.txt"));

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    public static void saveBinary(List<Student> students) throws Exception {

        DataOutputStream dos =
                new DataOutputStream(
                        new FileOutputStream("students.dat"));

        for (Student s : students) {

            dos.writeInt(s.getId());
            dos.writeUTF(s.getName());
            dos.writeUTF(s.getDepartment());
            dos.writeDouble(s.getGpa());
        }

        dos.close();
    }

    public static void loadBinary() throws Exception {

        DataInputStream dis =
                new DataInputStream(
                        new FileInputStream("students.dat"));

        try {

            while (true) {

                int id = dis.readInt();
                String name = dis.readUTF();
                String department = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println(
                        id + " " + name + " " +
                                department + " " + gpa);
            }

        } catch (EOFException e) {
        }

        dis.close();
    }


    // OBJECT SERIALIZATION

    public static void saveObject(List<Student> students) throws Exception {

        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("students.obj"));

        oos.writeObject(students);

        oos.close();
    }

    public static void loadObject() throws Exception {

        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("students.obj"));

        List<Student> students =
                (List<Student>) ois.readObject();

        for (Student s : students) {
            System.out.println(s);
        }

        ois.close();
    }
}
