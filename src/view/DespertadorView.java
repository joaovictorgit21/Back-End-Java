// Pasta
package view;

// Bibliotecas
import java.util.*;
import javax.sound.sampled.*;

// Arquivos
import controller.*;

public class DespertadorView {
    public static int adiar = 10; // minutos
    public static int[] adiamentos = { 1, 5, 10, 15, 20, 25 };
    public static int qtdAdiantamentos = 6;
    public static int adiamentoAtual = 0;
    
    public static Date date = null;
    public static Calendar calendar = null;
    
    public static int horaAtual;
    public static int minutoAtual;
    public static int segundoAtual;
    public static int horaDespertar;
    public static int minutoDespertar;
    public static int segundoDespertar;
    public static String tempoRestante;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static Scanner scnInput = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        int respostaUsuario;

        DespertadorController.getHMS();

        System.out.println(
            String.format(
                "Agora são: %s%d:%d:%d%s.",
                ANSI_BLUE,
                horaAtual,
                minutoAtual,
                segundoAtual,
                ANSI_RESET
            )
        );

        configurarDespertador();

        while (sair == false) {
            tempoRestante = DespertadorController.getHMS();

            System.out.println(
                String.format(
                    "Agora são: %s%d:%d:%d%s. O próximo alarme irá despertar às %s%d:%d:%d%s, Tempo restante até despertar: %s%s%s | Você adiou %s%d%s vezes",
                    ANSI_YELLOW,
                    horaAtual,
                    minutoAtual,
                    segundoAtual,
                    ANSI_RESET,
                    ANSI_RED,
                    horaDespertar,
                    minutoDespertar,
                    segundoDespertar, 
                    ANSI_RESET,
                    ANSI_GREEN,
                    tempoRestante,
                    ANSI_RESET,
                    ANSI_CYAN,
                    adiamentoAtual,
                    ANSI_RESET
                )
            );

            if (horaAtual >= horaDespertar &&
                minutoAtual >= minutoDespertar &&
                segundoAtual >= segundoDespertar) {
                    System.out.println("Acorda, seu despertador está chamando.");
                    System.out.println("Digite um número abaixo das seguintes opções:");
                    String[] opcoes = DespertadorController.verOpcoes();
                    
                    for (int c = 0; c < opcoes.length; c++) {
                        System.out.println(
                            String.format(
                                "[%d] >> %s",
                                c + 1,
                                opcoes[c]
                            )
                        );
                    playSound("Sound/alarme-motivacional.wav");
            }

                respostaUsuario = scnInput.nextInt();
                System.out.println(DespertadorController.acaoDespertador(respostaUsuario));
            }

            contador(1000);

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        scnInput.close();
    }

    public static void contador(int milisseg) {
        try {
            Thread.sleep(milisseg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void configurarDespertador() {
        System.out.println("Digite abaixo a hora que você deseja configurar o despertador e tecle Enter:");
        horaDespertar = scnInput.nextInt();

        System.out.println("Digite abaixo o minuto que você deseja configurar o despertador e tecle Enter:");
        minutoDespertar = scnInput.nextInt();
    }

    public static void sairDoSistema() {
        System.out.println("Alarme parado.");
        System.exit(0);
    }

    public static void mostrarOpcoesAdiamentos() {
        int respostaAdiar;

        System.out.println("Digite o número da opção abaixo e tecle Enter:");
        for (int a = 0; a < adiamentos.length; a++) {
            System.out.println(
                String.format(
                    "[%d] >> adiar %d minutos",
                    a + 1,
                    adiamentos[a]
                )
            );
        }
        respostaAdiar = scnInput.nextInt();
        adiar = adiamentos[respostaAdiar - 1];
    }

    public static void exibirAlarmeAdiado(int adiamentoInteger) {
        System.out.println("Ok! Despertador adiado em: " + adiamentoInteger + " minuto(s)");
        System.out.println("Você poderá adiar mais " + (qtdAdiantamentos - adiamentoAtual) + ".");
    }

    public static synchronized void playSound(final String waveFile) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            DespertadorView.class.getResourceAsStream("./" + waveFile));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}