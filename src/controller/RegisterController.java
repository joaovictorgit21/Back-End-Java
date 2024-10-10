package controller;

import javax.swing.*;

import model.*;
import view.*;

public class RegisterController extends JFrame{
    // try {
    //     nome = nomeJTextField.getText();
    //     email = emailJTextField.getText();
    //     senha = senhalJTextField.getText();
    //     InserirRegistroConnection.cadastrar("db_teste", "tbl_teste", "name", "email", "senha", nome, email, senha);

    //     notificacaoJLabel.setText("Cadastro realizado com sucesso");
    // } catch(NumberFormatException ex) {
    //     notificacaoJLabel.setText("Digite alguma coisa:");
    //     return;
    // }
    public static void RegisterUserController() {
    if (RegisterUserView.JTextFieldUser.getText().trim().length() == 0) {
                RegisterUserView.JLabelNotification.setText(HelperController.setHtmlFormat("É necessário digitar um login para acessar! Por favor, verifique e tente novamente."));
                RegisterUserView.JTextFieldUser.requestFocus();
            } else if (String.valueOf(((JPasswordField) RegisterUserView.JPasswordFieldPass).getPassword()).trim().length() == 0) {
                RegisterUserView.JLabelNotification.setText(HelperController.setHtmlFormat("É necessário digitar uma senha para acessar! Por favor, verifique e tente novamente."));
                RegisterUserView.JPasswordFieldPass.requestFocus();
            } else {
                String regiterUser = RegisterModel.registerUser(RegisterUserView.JTextFieldUser.getText(), RegisterUserView.JTextFieldEmail.getText() , String.valueOf(LoginUserView.JPasswordFieldPass.getPassword()).trim());
                if (regiterUser != null) {
                    MostrarCadastroView appMostrarCadastro = new MostrarCadastroView();
                    appMostrarCadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    RegisterUserView.appRegisterUSer.dispose();
                } else {
                    RegisterUserView.JLabelNotification.setText(HelperController.setHtmlFormat("Não foi encontrado o login e/ou senha digitados! Por favor, verifique e tente novamente."));
                }
            }
    }
}
