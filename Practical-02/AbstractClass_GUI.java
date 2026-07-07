package practical02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Abstract Class
abstract class StudentGUI {
    abstract String studyDetails();
}

// Child Class
class CollegeStudentGUI extends StudentGUI {

    @Override
    String studyDetails() {
        return "Name      : Anchal Yadav\n"
                + "Course    : B.Sc CS\n"
                + "Semester  : 3rd Semester\n\n"
                + "Subject   : Java Programming\n"
                + "Topic     : Abstract Class and Abstract Method\n\n"
                + "Status    : Successfully Executed";
    }
}

public class AbstractClass_GUI extends JFrame implements ActionListener {

    JLabel heading, name, course, sem;
    JButton btnShow;
    JTextArea area;

    CollegeStudentGUI student = new CollegeStudentGUI();

    public AbstractClass_GUI() {

        setTitle("Abstract Class GUI");
        setSize(550, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        heading = new JLabel("ABSTRACT CLASS DEMONSTRATION");
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        heading.setBounds(90, 20, 350, 30);
        add(heading);

        name = new JLabel("Name : Anchal Yadav");
        name.setBounds(50, 80, 250, 25);
        add(name);

        course = new JLabel("Course : B.Sc CS");
        course.setBounds(50, 110, 250, 25);
        add(course);

        sem = new JLabel("Semester : III");
        sem.setBounds(50, 140, 250, 25);
        add(sem);

        btnShow = new JButton("Show Details");
        btnShow.setBounds(180, 190, 150, 35);
        btnShow.addActionListener(this);
        add(btnShow);

        area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane sp = new JScrollPane(area);
        sp.setBounds(50, 250, 430, 170);
        add(sp);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText(student.studyDetails());
    }

    public static void main(String[] args) {
        new AbstractClass_GUI();
    }
}