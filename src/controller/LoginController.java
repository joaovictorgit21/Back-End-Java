package controller;

import javax.swing.JFrame;

import model.*;
import view.*;

public class LoginController extends JFrame{
    public static void LoginUserController() {
        try {
            if (LoginUserView.JTextFieldUser.getText().trim().length() == 0) {
                LoginUserView.JLabelNotification.setText(HelperController.setHtmlFormat("É necessário digitar um login para acessar! Por favor, verifique e tente novamente."));
                LoginUserView.JTextFieldUser.requestFocus();
            } else if (String.valueOf(LoginUserView.JPasswordFieldPass.getPassword()).trim().length() == 0) {
                LoginUserView.JLabelNotification.setText(HelperController.setHtmlFormat("É necessário digitar uma senha para acessar! Por favor, verifique e tente novamente."));
                LoginUserView.JPasswordFieldPass.requestFocus();
            } else {
                boolean achouUsuario = LoginModel.loginUser(LoginUserView.JTextFieldUser.getText(), String.valueOf(LoginUserView.JPasswordFieldPass.getPassword()).trim());
                if (achouUsuario == true) {
                    MostrarCadastroView appMostrarCadastro = new MostrarCadastroView();
                    appMostrarCadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    LoginUserView.appLoginUSer.dispose();
                } else {
                    LoginUserView.JLabelNotification.setText(HelperController.setHtmlFormat("Não foi encontrado o login e/ou senha digitados! Por favor, verifique e tente novamente."));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            LoginUserView.JLabelNotification.setText(HelperController.setHtmlFormat("Ops! Deu ruim no banco de dados. Por favor, tente novamente mais tarde, muito obrigado"));
        }
    }
}
