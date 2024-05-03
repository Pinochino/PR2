import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginGUI implements  ActionListener {

    private static JLabel titleLabel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel success;


    @Override
    public void actionPerformed(ActionEvent e) {

        String username = userText.getText();
        String password = String.valueOf(passText.getPassword());

        if (username.equals("hung") && password.equals("123")){
            success.setText("Login successful! ");
        } else {
            success.setText("Login fail! ");
        }

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 210));
        frame.add(panel);


        titleLabel = new JLabel("Simple Login Form");
        titleLabel.setPreferredSize(new Dimension(300, 35));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel);

        userLabel = new JLabel("User");
        userLabel.setPreferredSize(new Dimension(80, 30));
        panel.add(userLabel);

         userText = new JTextField();
        userText.setPreferredSize(new Dimension(165, 30));
        panel.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setPreferredSize(new Dimension(80, 30));
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setPreferredSize(new Dimension(165, 30));
        panel.add(passText);

        button = new JButton("Login");
        button.setPreferredSize(new Dimension(80, 30));
        button.addActionListener(new loginGUI());
        panel.add(button);


        success = new JLabel("");
        success.setPreferredSize(new Dimension(300, 30));
        success.setHorizontalAlignment(JLabel.CENTER);
        panel.add(success);

        frame.setLocationRelativeTo(null);

//        resize window to fit the JPanel
        frame.pack();

//        make the window visible
        frame.setVisible(true);

    }
}

