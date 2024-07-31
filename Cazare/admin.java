package Cazare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class admin extends JFrame {
    private JButton loginAdminButton, registerAdminButton;
    private JTextField userFieldAdmin, passwordFieldAdmin;
    
    public admin() {
        setTitle("Admin Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        
        userFieldAdmin = new JTextField();
        passwordFieldAdmin = new JPasswordField(); // Use JPasswordField for password input
        
        loginAdminButton = new JButton("Login");
        registerAdminButton = new JButton("Register");
        
        add(new JLabel("Username:"));
        add(userFieldAdmin);
        add(new JLabel("Password:"));
        add(passwordFieldAdmin);
        add(loginAdminButton);
        add(registerAdminButton);
        
        registerAdminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registerAdmin registerAdmin = new registerAdmin();
                registerAdmin.setSize(700, 450);
                registerAdmin.setVisible(true);
            }
        });
        
        
    }}
    
    
