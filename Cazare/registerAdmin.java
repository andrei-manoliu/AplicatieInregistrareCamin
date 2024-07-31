package Cazare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class registerAdmin extends JFrame {
    private JButton RegisterAdminFinal;
    private JTextField numeField, prenumeField, facultateField, specializareField, cnpField, adresaField, tipstudiiField;

    public registerAdmin() {
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

        RegisterAdminFinal = new JButton("Register");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        add(RegisterAdminFinal, gbc);

        RegisterAdminFinal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                admin admin=new admin();
                admin.setSize(700,450);
                admin.setVisible(true);
            }
        });
   
   
    }
}