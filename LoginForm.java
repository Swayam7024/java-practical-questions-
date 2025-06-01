import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    // Components
    JLabel labelUser, labelPass;
    JTextField textUser;
    JPasswordField textPass;
    JButton loginButton;

    // Constructor
    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Create components
        labelUser = new JLabel("Username:");
        labelPass = new JLabel("Password:");
        textUser = new JTextField();
        textPass = new JPasswordField();
        loginButton = new JButton("Login");

        // Add action listener
        loginButton.addActionListener(this);

        // Add components to frame
        add(labelUser);
        add(textUser);
        add(labelPass);
        add(textPass);
        add(new JLabel()); // empty cell
        add(loginButton);

        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        String username = textUser.getText();
        String password = new String(textPass.getPassword());

        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    }

    // Main method
    public static void main(String[] args) {
        new LoginForm();
    }
}
