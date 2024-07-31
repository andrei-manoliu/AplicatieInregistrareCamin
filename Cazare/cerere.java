package Cazare;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cerere extends JFrame {
    private JTextField locatieField, distantaField;
    private JRadioButton CuColegRadioButton, FaraColegRadioButton;
    private JButton submitButton;
    
    public cerere() {
        setTitle("Cerere Camin");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        
        locatieField = new JTextField();
        distantaField = new JTextField();
        
        CuColegRadioButton = new JRadioButton("Cu coleg");
        FaraColegRadioButton = new JRadioButton("Fara coleg");

        
        ButtonGroup CuColegGroup = new ButtonGroup();
        CuColegGroup.add(CuColegRadioButton);
        CuColegGroup.add(FaraColegRadioButton);
        
        submitButton = new JButton("Trimite cerere");
        
        add(new JLabel("Localitate:"));
        add(locatieField);
        add(new JLabel("Distanta:"));
        add(distantaField);
        add(new JLabel("CuColeg:"));
        add(CuColegRadioButton);
        add(new JLabel(""));
        add(FaraColegRadioButton);
        add(new JLabel(""));
        add(submitButton);
        
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String location = locatieField.getText();
                String distance = distantaField.getText();
                String CuColeg = "";
                if (CuColegRadioButton.isSelected()) {
                    CuColeg = "Cu Coleg";
                } else if (FaraColegRadioButton.isSelected()) {
                    CuColeg = "Fara Coleg";
                }
                
                
                dispose();
            }
        });
    }
}
