import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JDialog {
    private JTextField tfMassage;
    private JTextField tfStatus;
    private JTextField tfComment;
    private JButton btnJmlKata1;
    private JButton btnJmlKata2;
    private JPanel JPanel;
    private JButton btnJmlKata3;
    private JButton btnClose;
    private JPanel LoginPanel;

    public Login(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(LoginPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        btnJmlKata1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = tfMassage.getText();
                String[] words = message.split("\\s+");
                int count = words.length;
                tfStatus.setText("Jumlah Kata : " + count);
            }
        });

        btnJmlKata2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = tfStatus.getText();
                String[] words = message.split("\\s+");
                int count = words.length;
                tfStatus.setText("Jumlah Kata : " + count);
            }
        });

        btnJmlKata3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = tfComment.getText();
                String[] words = message.split("\\s+");
                int count = words.length;
                tfComment.setText("Jumlah Kata : " + count);
            }
        });

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pack();

    }

    public static void main(String[] args) {
        Login login = new Login(null);
        login.setVisible(true);
    }
}