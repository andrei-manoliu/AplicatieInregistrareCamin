package Cazare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class registerStudent extends JFrame {
    private JButton RegisterStudent;
    private JTextField numeField, prenumeField, facultateField, specializareField, cnpField, adresaField, tipstudiiField, anField;

    public registerStudent() {
        setSize(400, 300);  // Set the size of the JFrame
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        numeField = new JTextField(20);
        prenumeField = new JTextField(20);
        facultateField = new JTextField(20);
        specializareField = new JTextField(20);
        cnpField = new JTextField(20);
        adresaField = new JTextField(20);
        tipstudiiField = new JTextField(20);
        anField = new JTextField(20); // Initialize the anField

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5); // Add spacing between components
        add(new JLabel("Nume:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(numeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Prenume:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(prenumeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Facultate:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(facultateField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Specializare:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(specializareField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("CNP:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(cnpField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Adresa:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(adresaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("Tip de studii:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        add(tipstudiiField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        add(new JLabel("An:"), gbc); // Add label for the 'An' field

        gbc.gridx = 1;
        gbc.gridy = 7;
        add(anField, gbc); // Add the 'anField' to the JFrame

        RegisterStudent = new JButton("Register");
        gbc.gridx = 0;
        gbc.gridy = 8; // Update the grid position to accommodate the new field
        gbc.gridwidth = 2;
        add(RegisterStudent, gbc);

        RegisterStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                student student = new student();
                student.setSize(700, 450);
                student.setVisible(true);
            }
        });
    }
}
