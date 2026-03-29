package gui;

import service.AttendanceService;
import model.Student;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private AttendanceService service = new AttendanceService();
    private JTextArea output;

    public MainFrame() {
        setTitle("Student Attendance System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JButton addBtn = new JButton("Add Student");
        JButton markBtn = new JButton("Mark Attendance");
        JButton viewBtn = new JButton("View Records");

        panel.add(addBtn);
        panel.add(markBtn);
        panel.add(viewBtn);

        output = new JTextArea();
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(output), BorderLayout.CENTER);

        // Add Student
        addBtn.addActionListener(e -> {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
            String name = JOptionPane.showInputDialog("Enter Name");
            service.addStudent(id, name);
            output.setText("Student Added\n");
        });

        // Mark Attendance
        markBtn.addActionListener(e -> {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
            int choice = JOptionPane.showConfirmDialog(null, "Present?");
            service.markAttendance(id, choice == 0);
            output.setText("Attendance Marked\n");
        });

        // View Records
        viewBtn.addActionListener(e -> {
            StringBuilder sb = new StringBuilder();
            for (Student s : service.getAllStudents()) {
                sb.append("ID: ").append(s.getId())
                  .append(", Name: ").append(s.getName())
                  .append(", %: ").append(s.getAttendancePercentage())
                  .append("\n");
            }
            output.setText(sb.toString());
        });
    }
}
