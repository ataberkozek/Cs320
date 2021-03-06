import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


public class LoginPanel extends JFrame {
    String username = "username";
    String password = "pass";
    JTextField txtUsername;
    JPasswordField txtPassword;


    public static void main(String args[]) {
        LoginPanel login = new LoginPanel();
        login.initialize();
    }

    private void initialize() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel UsernameLabel = new JLabel("Username:");
        JLabel PasswordLabel = new JLabel("Password:");
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            if (username.equals(txtUsername.getText()) && Arrays.equals(password.toCharArray(), txtPassword.getPassword())) {
                JOptionPane.showMessageDialog(null, "Logged in successfully!");
                frame.dispose();
                Operators operator = new Operators();
                operator.initialize();
            } else {
                JOptionPane.showMessageDialog(null, "Log in failed!");
            }
        });
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> System.exit(0)
        );

        panel.add(UsernameLabel);
        panel.add(txtUsername);
        panel.add(PasswordLabel);
        panel.add(txtPassword);
        panel.add(loginButton);
        panel.add(cancelButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(250,200);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);


    }



}