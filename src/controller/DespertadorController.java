package controller;
import model.*;
import view.*;
import java.util.*;

public class DespertadorController extends DespertadorView {
    public static String[] verOpcoes() {
        return DespertadorModel.mostrarOpcoes();
    }

    public static String acaoDespertador(int opcaoUsuario) {

        String resposta = "";

        switch (opcaoUsuario) {
            case 1:
                if(adiamentoAtual <= 6){
                    mostrarOpcoesAdiamentos();
                    
                    if((minutoDespertar + adiar) > 59){
                        horaDespertar++;
                        if(horaDespertar > 23){
                            horaDespertar = 0;
                        }
                        minutoDespertar =(minutoDespertar + adiar) - 59;
                    }
                    DespertadorView.minutoDespertar += DespertadorView.adiar;
                    adiamentoAtual++;
                }else{
                    System.out.println("Você atingiu o limite de adiantamento");
                    sairDoSistema();
                }
                break;

            case 2:
                sairDoSistema();
                break;

            default:
                resposta = "Opção inválida.";
                break;
        }
        return resposta;
    }

    public static String getHMS() {
        date = new Date();
        calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        horaAtual = calendar.get(Calendar.HOUR_OF_DAY);
        minutoAtual = calendar.get(Calendar.MINUTE);
        segundoAtual = calendar.get(Calendar.SECOND);

        int horaFaltantes = horaDespertar - horaAtual;
        int minutoFaltantes = minutoDespertar - minutoAtual;
        int segundoFaltantes = segundoDespertar - segundoAtual;

        if (segundoFaltantes < 0) {
            segundoFaltantes += 60;
            minutoFaltantes--;
        }

        if (minutoFaltantes < 0) {
            minutoFaltantes += 60;
            horaFaltantes--;
        }

        if (horaFaltantes < 0) {
            horaFaltantes += 24;
        }

        return String.format("%02d:%02d:%02d", horaFaltantes, minutoFaltantes, segundoFaltantes);
    }
}