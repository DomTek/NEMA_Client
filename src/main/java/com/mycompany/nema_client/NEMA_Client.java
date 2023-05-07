/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nema_client;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nighthawk
 */
public class NEMA_Client extends JFrame{

      // Declare GUI components
    private JLabel severityLabel, fireLabel;
    private JTextArea reportArea;
    private JComboBox<String> severityComboBox;
    private JList<String> fireList;
    private JButton updateButton, respondButton, exitButton;

    public NEMA_Client() {

        // Set GUI window properties
        setTitle("NEMA Client");
        setSize(600, 500);
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

        // Add GUI components to content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(updateButton);
        contentPane.add(topPanel, BorderLayout.NORTH);
        JScrollPane reportScrollPane = new JScrollPane(reportArea);
        contentPane.add(reportScrollPane, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new GridLayout(2, 2));
        bottomPanel.add(severityLabel);
        bottomPanel.add(severityComboBox);
        bottomPanel.add(fireLabel);
        bottomPanel.add(fireList);
        bottomPanel.add(respondButton);
        bottomPanel.add(exitButton);
        contentPane.add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        NEMA_Client client = new NEMA_Client();
        client.setVisible(true);
    }
}