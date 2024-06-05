package QuanLyDiem.GUI;

import javax.swing.*;

public class FrameAddTeacher extends JFrame {

    private JLabel lblTeacherID, lblTeacherName, lblDepartment;
    private JTextField txtTeacherID, txtTeacherName, txtDepartment;
    private JButton btnSave, btnCancel;

    public FrameAddTeacher() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components
        lblTeacherID = new JLabel("Teacher ID:");
        lblTeacherName = new JLabel("Teacher Name:");
        lblDepartment = new JLabel("Department:");
        txtTeacherID = new JTextField();
        txtTeacherName = new JTextField();
        txtDepartment = new JTextField();
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");

        // Configure frame settings
        setTitle("Add Teacher");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        // Set component bounds (only needed by Absolute Positioning)
        lblTeacherID.setBounds(10, 10, 80, 25);
        lblTeacherName.setBounds(10, 40, 100, 25);
        lblDepartment.setBounds(10, 70, 80, 25);
        txtTeacherID.setBounds(120, 10, 160, 25);
        txtTeacherName.setBounds(120, 40, 160, 25);
        txtDepartment.setBounds(120, 70, 160, 25);
        btnSave.setBounds(50, 110, 80, 25);
        btnCancel.setBounds(150, 110, 80, 25);

        // Add components to frame
        add(lblTeacherID);
        add(lblTeacherName);
        add(lblDepartment);
        add(txtTeacherID);
        add(txtTeacherName);
        add(txtDepartment);
        add(btnSave);
        add(btnCancel);

        // Add action listeners
        btnSave.addActionListener(e -> saveTeacher());
        btnCancel.addActionListener(e -> dispose());
    }

    private void saveTeacher() {
        // Add save logic here
        JOptionPane.showMessageDialog(this, "Teacher saved successfully!");
    }
}