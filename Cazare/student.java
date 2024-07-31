package Cazare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class student extends JFrame {
    private JButton LoginStudent, RegisterStudent;
    private JTextField userField, passwordField;
    public student(){
        setLayout(new GridLayout(3,2));
        userField=new JTextField();
        passwordField=new JTextField();
        LoginStudent=new JButton("Login");
        RegisterStudent=new JButton("Register");
        add(new JLabel("Username:"));
        add(userField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(LoginStudent);
        add(RegisterStudent);


        
        RegisterStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                registerStudent registerStudent=new registerStudent();
                registerStudent.setSize(700,450);
                registerStudent.setVisible(true);
            }
        });

        LoginStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                cerere cerere=new cerere();
                cerere.setSize(700,450);
                cerere.setVisible(true);
            }
        });
    }}

