package practical02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Interface
interface MathOperationsGUI {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

// Implementation Class
class CalculatorGUI implements MathOperationsGUI {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}

// Main GUI Class
public class Interface_GUI extends JFrame implements ActionListener {

    JLabel heading, l1, l2, result;
    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    CalculatorGUI cal = new CalculatorGUI();

    public Interface_GUI() {

        setTitle("Interface Calculator");
        setSize(500, 420);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        heading = new JLabel("CALCULATOR USING INTERFACE");
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        heading.setBounds(80, 20, 320, 30);
        add(heading);

        l1 = new JLabel("First Number");
        l1.setBounds(50, 80, 100, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(170, 80, 200, 30);
        add(t1);

        l2 = new JLabel("Second Number");
        l2.setBounds(50, 130, 100, 25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(170, 130, 200, 30);
        add(t2);

        add = new JButton("ADD");
        add.setBounds(30, 190, 90, 35);
        add.addActionListener(this);
        add(add);

        sub = new JButton("SUB");
        sub.setBounds(140, 190, 90, 35);
        sub.addActionListener(this);
        add(sub);

        mul = new JButton("MUL");
        mul.setBounds(250, 190, 90, 35);
        mul.addActionListener(this);
        add(mul);

        div = new JButton("DIV");
        div.setBounds(360, 190, 90, 35);
        div.addActionListener(this);
        add(div);

        result = new JLabel("Result");
        result.setBounds(50, 260, 100, 25);
        add(result);

        t3 = new JTextField();
        t3.setBounds(170, 260, 200, 30);
        t3.setEditable(false);
        add(t3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());

        if (e.getSource() == add) {
            t3.setText(String.valueOf(cal.add(a, b)));
        }

        if (e.getSource() == sub) {
            t3.setText(String.valueOf(cal.subtract(a, b)));
        }

        if (e.getSource() == mul) {
            t3.setText(String.valueOf(cal.multiply(a, b)));
        }

        if (e.getSource() == div) {

            if (b == 0) {
                JOptionPane.showMessageDialog(this,
                        "Division by Zero is Not Allowed");
            } else {
                t3.setText(String.valueOf(cal.divide(a, b)));
            }
        }

    }

    public static void main(String args[]) {
        new Interface_GUI();
    }

}