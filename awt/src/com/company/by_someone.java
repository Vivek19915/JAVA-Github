package com.company;
import java.awt.*;
import java.awt.event.*;
class calc implements ActionListener {
    // Declaring frame and components
    Frame f = new Frame();
    Label l1 = new Label("First Number");
    Label l2 = new Label("Second Number");
    Label l3 = new Label("Result");
    TextField tf1 = new TextField();
    TextField tf2 = new TextField();
    TextField tf3 = new TextField();
    Button b1 = new Button("Add");
    Button b2 = new Button("Subtract");
    Button b3 = new Button("Multiply");
    Button b4 = new Button("Divide");
    Button b5 = new Button("Reset");
    Button b6 = new Button("Exit");
    calc() {
// Positioning components
        l1.setBounds(50, 60, 100, 20);
        l2.setBounds(50, 100, 100, 20);
        l3.setBounds(50, 140, 100, 20);
        tf1.setBounds(200, 60, 100, 20);
        tf2.setBounds(200, 100, 100, 20);
        tf3.setBounds(200, 140, 100, 20);
        tf3.setEditable(false);
        b1.setBounds(50, 200, 50, 20);
        b2.setBounds(118, 200, 50, 20);
        b3.setBounds(185, 200, 50, 20);
        b4.setBounds(250, 200, 50, 20);
        b5.setBounds(100, 250, 50, 20);
        b6.setBounds(200, 250, 50, 20);
// Adding components to the frame
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        f.setTitle("Basic Calculator");
        f.setLocation(500,150);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 350);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        double num1 = Integer.parseInt(tf1.getText());
        double num2 = Integer.parseInt(tf2.getText());
        if (e.getSource() == b1) {
            tf3.setText(String.format("%.0f",(num1 + num2)));
        }
        if (e.getSource() == b2) {
            tf3.setText(String.format("%.0f",(num1 - num2)));
        }
        if (e.getSource() == b3) {
            tf3.setText(String.format("%.0f",(num1 * num2)));
        }
        if (e.getSource() == b4) {
            tf3.setText(String.format("%.2f",(num1 / num2)));
        }
        if (e.getSource() == b5) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
        else if (e.getSource() == b6) {
            System.exit(0);
        }
    }
    public static void main(String... s) {
        new calc();
    }
}
