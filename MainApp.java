package ui;

import javax.swing.*;
import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smart Attendance System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to Smart Attendance System", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
