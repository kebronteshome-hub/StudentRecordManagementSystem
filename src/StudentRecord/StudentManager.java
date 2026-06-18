package StudentRecord;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public Student searchStudent(int id) {
        for (Student s : students)
            if (s.getId() == id)
                return s;

        return null;
    }

    public void updateStudent(int id, String name) {
        Student s = searchStudent(id);

        if (s != null)
            s.setName(name);
    }
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    public void displayAllStudents() {
        for (Student s : students)
            System.out.println(s);
    }
}