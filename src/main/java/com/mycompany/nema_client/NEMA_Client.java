/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nema_client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nighthawk
 */
public class NEMA_Client extends JFrame {

    // Declare GUI components
    private JLabel severityLabel, fireLabel;
    private JTextArea reportArea;
    private JComboBox<String> severityComboBox;
    private JList<String> fireList;
    private JButton updateButton, respondButton, exitButton;

public NEMA_Client() {

    // Set GUI window properties
    setTitle("NEMA Client");
    setSize(600, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Initialize GUI components
    updateButton = new JButton("Update Report");
    reportArea = new JTextArea();
    severityLabel = new JLabel("Select Fire Severity:");
    severityComboBox = new JComboBox<>(new String[]{"Low", "Medium", "High"});
    fireLabel = new JLabel("Select Fire:");
    fireList = new JList<>(new String[]{"Fire 1", "Fire 2", "Fire 3"});
    respondButton = new JButton("Respond Truck");
    exitButton = new JButton("Exit");
    
        // Add action listener to exit button
    exitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0); // Terminate the Java Virtual Machine
        }
    });

    // Add GUI components to content pane
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    topPanel.add(updateButton);
    topPanel.add(exitButton);
    contentPane.add(topPanel, BorderLayout.NORTH);
    JScrollPane reportScrollPane = new JScrollPane(reportArea);
    contentPane.add(reportScrollPane, BorderLayout.CENTER);
    JPanel bottomPanel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;
    c.anchor = GridBagConstraints.CENTER;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1.0;
    c.insets = new Insets(0, 10, 0, 10); 
    bottomPanel.add(severityLabel, c);
    c.gridx = 1;
    c.insets = new Insets(0, 0, 0, 10); 
    bottomPanel.add(severityComboBox, c);
    c.gridx = 2;
    c.insets = new Insets(0, 0, 0, 10); 
    bottomPanel.add(fireLabel, c);
    c.gridx = 3;
    c.insets = new Insets(0, 0, 0, 10); 
    bottomPanel.add(fireList, c);
    c.gridx = 4;
    c.insets = new Insets(0, 0, 0, 10);
    bottomPanel.add(respondButton, c);
    contentPane.add(bottomPanel, BorderLayout.SOUTH);
}
    public static void main(String[] args) {
        NEMA_Client client = new NEMA_Client();
        client.setVisible(true);
    }
}
