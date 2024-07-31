package Cazare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class role extends JFrame {
    private JButton Student, Admin;
    
    public role(){
        setLayout(new GridLayout(1,2));
        

        Student = new JButton("student");
        Admin = new JButton("admin");

        add(Student);
        add(Admin);

        

        
        Student.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                student student=new student();
                student.setSize(700,450);
                student.setVisible(true);
            }
        });
        Admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                admin admin=new admin();
                admin.setSize(700,450);
                admin.setVisible(true);
            }
        });
    }
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
    
            role role=new role();
            
            role.setSize(300, 150);
            role.setVisible(true);
            }
        });
    }}