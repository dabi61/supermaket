package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginView extends JFrame {
    public JTextField txtUsername = new JTextField(15);
    public JPasswordField txtPassword = new JPasswordField(15);
    public JButton btnLogin = new JButton("Login");

    public LoginView() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Username:"));
        panel.add(txtUsername);
        panel.add(new JLabel("Password:"));
        panel.add(txtPassword);
        panel.add(btnLogin);
        add(panel);
    }
}
