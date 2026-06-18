package StudentRecord;

import java.util.List;

public class StudentStatistics {

    public static void generateReport(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        double highest = students.get(0).getGpa();
        double lowest = students.get(0).getGpa();
        double total = 0;

        for (Student s : students) {

            if (s.getGpa() > highest)
                highest = s.getGpa();

            if (s.getGpa() < lowest)
                lowest = s.getGpa();

            total += s.getGpa();
        }

        System.out.println("Total Students: " + students.size());
        System.out.println("Highest GPA: " + highest);
        System.out.println("Lowest GPA: " + lowest);
        System.out.println("Average GPA: " + (total / students.size()));
    }
}