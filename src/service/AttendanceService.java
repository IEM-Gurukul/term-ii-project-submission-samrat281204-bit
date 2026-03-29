package service;

import model.Student;
import java.util.ArrayList;

public class AttendanceService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public void markAttendance(int id, boolean present) {
        Student s = findStudent(id);
        if (s != null) {
            s.markAttendance(present);
        }
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}
