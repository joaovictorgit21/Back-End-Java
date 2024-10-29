package view;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import model.*;
import controller.*;

public class RegisterUserView extends JFrame {

    private final JLabel JLabelEmail = new JLabel("Email", SwingConstants.CENTER);
    public final static JTextField JTextFieldEmail = new JTextField(40);
    private final JLabel JLabelUser = new JLabel("Usuario", SwingConstants.CENTER);
    public final static JTextField JTextFieldUser = new JTextField(40);
    private final JLabel JLabelPass = new JLabel("Senha", SwingConstants.CENTER);
    public final static JTextField JPasswordFieldPass = new JTextField(40);
    private final JButton JButtonCadastrar = new JButton("Cadastrar");
    private final JButton JButtonEnterUser = new JButton("Logar >");
    private final JCheckBox JCheckBoxTerms = new JCheckBox("Aceite os Termos");
    public final static JLabel JLabelNotification = new JLabel("Notificações...", SwingConstants.CENTER);
    public final static JLabel JLabelImagePath = new JLabel("Caminho da Imagem");
    private final JLabel JLabelImagePreview = new JLabel();
    private final JButton JButtonSelectImage = new JButton("Selecionar Imagem");
    private final JPanel imagePanel = new JPanel(); // Painel para centralizar a imagem

    // private final JLabel espacador10 = new JLabel("");

    private final String dbPadrao = "db_teste";
    private final String tblPadrao = "tbl_teste";


    public RegisterUserView() {
        super("Tela de Cadastro");
        // setLayout(new GridLayout(17, 1, 5, 5));
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // JPanel lineMenos1 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line1 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line2 =  new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel line4 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line5 =  new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel line7 =  new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel line8 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line10 = new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line11 = new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel line12 = new JPanel(new GridLayout(1, 1, 10, 10));

        //--------------------------------------------------- Events ---------------------------------------------------//

        JButtonCadastrar.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {

                    JTextFieldUser.requestFocus();
                    
                    String name = JTextFieldUser.getText();
                    String email = JTextFieldEmail.getText();
                    String password = JPasswordFieldPass.getText();
                    String profile_image = JLabelImagePath.getText();

                    if (JCheckBoxTerms.isSelected()) {
                        try {
                            Connection connection = MySQLConnector.connection();
                            String strSqlsearchEmail = "select email FROM `" + dbPadrao + "`.`" + tblPadrao + "` where `email` = '" + email + "' order by `id` asc";
                            Statement stmSqlsearchEmail = connection.createStatement();
                            ResultSet rstSearchEmail = stmSqlsearchEmail.executeQuery(strSqlsearchEmail);


                            if (rstSearchEmail.next()) {
                                JLabelNotification.setText("Email já cadastrado");
                                System.out.println("Email já cadastrado");
                            } else {
                                NavegadorDeRegistro.newRegister(dbPadrao, tblPadrao, "name", "email", "password", "profile_image", name, email, password, profile_image);
                                JLabelNotification.setText("Cadastro realizado com sucesso");
                            }

                            stmSqlsearchEmail.close();
                            connection.close();
                        } catch (Exception e) {
                            JLabelNotification.setText("Digite alguma coisa:");
                        }
                    } else {
                        JLabelNotification.setText("Você deve aceitar os Termos");
                    }
                }
            });

            JButtonEnterUser.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        setVisible(false);
                        LoginUserView appLogin = new LoginUserView();
                        appLogin.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    } 
                }
            );

            JButtonSelectImage.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    int returnValue = fileChooser.showOpenDialog(null);
                    
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        String imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                        JLabelImagePath.setText(imagePath);
                        
                        // Exibe a imagem selecionada e a redimensiona para caber no JLabel
                        ImageIcon imageIcon = new ImageIcon(imagePath);
                        Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH); // Redimensiona para 300x300
                        JLabelImagePreview.setIcon(new ImageIcon(image));
                        JLabelImagePreview.setPreferredSize(new Dimension(150, 150)); // Define o tamanho do JLabel
                    }
                }
            });

        //--------------------------------------------------------------------------------------------------------------//
        
        //----------------------------------------------- Insert Elements ----------------------------------------------//
        
        imagePanel.add(JLabelImagePreview); // Label para mostrar a imagem no centro
        add(imagePanel);

        add(line1);
        line1.add(JLabelUser);

        add(line2);
        line2.add(JTextFieldUser);
        
        add(line4);
        line4.add(JLabelEmail);
        
        add(line5);
        line5.add(JTextFieldEmail);
        
        add(line7);
        line7.add(JLabelPass);
        
        add(line8);
        line8.add(JPasswordFieldPass);
        
        add(line10);
        line10.add(JButtonSelectImage);
        line10.add(JButtonCadastrar);
        line10.add(JButtonEnterUser);
        
        add(line11);
        line11.add(JCheckBoxTerms);

        add(line12);
        line12.add(JLabelNotification);

        setSize(550, 600);
        setVisible(true);

        //----------------------------------------------    ----------------------------------------------------------------//

    }

    public static RegisterUserView appRegisterUSer;

    public static void main(String[] args) {
        appRegisterUSer = new RegisterUserView();
        appRegisterUSer.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
