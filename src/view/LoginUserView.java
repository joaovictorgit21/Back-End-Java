package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.*;

public class LoginUserView extends JFrame{

    private final JLabel JLabelUser = new JLabel("Email", SwingConstants.CENTER);
    public static final JTextField JTextFieldUser = new JTextField();
    private final JLabel JLabelPass = new JLabel("Senha", SwingConstants.CENTER);
    public static final JPasswordField JPasswordFieldPass = new JPasswordField();
    private final JButton JButtonLogin = new JButton("Entrar");
    private final JButton JButtonNewUser = new JButton("Cadastrar >");
    public static final JLabel JLabelNotification = new JLabel("Notificações...", SwingConstants.CENTER);

    private final JLabel espacador = new JLabel("");
    private final JLabel espacador2 = new JLabel("");
    private final JLabel espacador3 = new JLabel("");
    private final JLabel espacador4 = new JLabel("");
    private final JLabel espacador5 = new JLabel("");
    private final JLabel espacador6 = new JLabel("");
    private final JLabel espacador7 = new JLabel("");
    private final JLabel espacador8 = new JLabel("");
    private final JLabel espacador9 = new JLabel("");

    public static final String dbPadrao = "db_teste";
    public static final String tblPadrao = "tbl_teste";

    // private final JLabel    JLabelTerms = new JLabel("Aceite os Termos");

    public LoginUserView() {
        super("Tela de Login");
        setLayout(new GridLayout(11, 1, 5, 5));

        JPanel line0 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line1 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line2 =  new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel line3 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line4 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line5 =  new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel line6 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line7 =  new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel line8 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line10 = new JPanel(new GridLayout(1, 1, 10, 10));

        JButtonLogin.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    LoginController.LoginUserController();
                }
            }
        );

        JButtonNewUser.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        setVisible(false);
                        RegisterUserView appcadastro = new RegisterUserView();
                        appcadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    } 
                }
            );

        add(line0);
        line0.add(espacador);

        add(line1);
        line1.add(JLabelUser);
        
        add(line2);
        line2.add(espacador5);
        line2.add(JTextFieldUser);
        line2.add(espacador6);
        
        add(line3);
        line3.add(espacador2);
        
        add(line4);
        line4.add(JLabelPass);
        
        add(line5);
        line5.add(espacador7);
        line5.add(JPasswordFieldPass);
        line5.add(espacador8);
        
        add(line6);
        line6.add(espacador3);
        
        add(line7);
        line7.add(espacador9);
        line7.add(JButtonLogin);
        line7.add(JButtonNewUser);
        
        add(line8);
        line8.add(espacador4);
        
        add(line10);
        line10.add(JLabelNotification);

        setSize(600, 600);
        setVisible(true);
    }

    public static LoginUserView appLoginUSer;

    public static void main(String[] args) {
        appLoginUSer = new LoginUserView();
        appLoginUSer.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
