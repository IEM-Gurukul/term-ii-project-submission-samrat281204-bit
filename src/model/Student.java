package model;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Boolean> attendanceList;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.attendanceList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void markAttendance(boolean present) {
        attendanceList.add(present);
    }

    public ArrayList<Boolean> getAttendanceList() {
        return attendanceList;
    }

    public double getAttendancePercentage() {
        if (attendanceList.size() == 0) return 0;

        int presentCount = 0;
        for (boolean status : attendanceList) {
            if (status) presentCount++;
        }

        return (presentCount * 100.0) / attendanceList.size();
    }
}
