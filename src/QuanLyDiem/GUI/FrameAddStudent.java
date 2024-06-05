package QuanLyDiem.GUI;

import javax.swing.*;

public class FrameAddStudent extends JFrame {

    private JLabel lblStudentID, lblStudentName, lblClass;
    private JTextField txtStudentID, txtStudentName, txtClass;
    private JButton btnSave, btnCancel;

    public FrameAddStudent() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components
        lblStudentID = new JLabel("Student ID:");
        lblStudentName = new JLabel("Student Name:");
        lblClass = new JLabel("Class:");
        txtStudentID = new JTextField();
        txtStudentName = new JTextField();
        txtClass = new JTextField();
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");

        // Configure frame settings
        setTitle("Add Student");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        // Set component bounds (only needed by Absolute Positioning)
        lblStudentID.setBounds(10, 10, 80, 25);
        lblStudentName.setBounds(10, 40, 100, 25);
        lblClass.setBounds(10, 70, 80, 25);
        txtStudentID.setBounds(120, 10, 160, 25);
        txtStudentName.setBounds(120, 40, 160, 25);
        txtClass.setBounds(120, 70, 160, 25);
        btnSave.setBounds(50, 110, 80, 25);
        btnCancel.setBounds(150, 110, 80, 25);

        // Add components to frame
        add(lblStudentID);
        add(lblStudentName);
        add(lblClass);
        add(txtStudentID);
        add(txtStudentName);
        add(txtClass);
        add(btnSave);
        add(btnCancel);

        // Add action listeners
        btnSave.addActionListener(e -> saveStudent());
        btnCancel.addActionListener(e -> dispose());
    }

    private void saveStudent() {
        // Add save logic here
        JOptionPane.showMessageDialog(this, "Student saved successfully!");
    }
}