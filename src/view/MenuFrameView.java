package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuFrameView extends JFrame {
    public static JLabel lblNotificacoes;

    public MenuFrameView() {
        super("Perfect Burguer");
        setLayout(new GridBagLayout());

        JMenu usuarioMenu = new JMenu("Usuários");
        usuarioMenu.setMnemonic('U');

        JMenuItem cadastrarMenu = new JMenuItem("Cadastrar");
        cadastrarMenu.setMnemonic('C');
        usuarioMenu.add(cadastrarMenu);

        JMenuItem pesquisarMenu = new JMenuItem("Pesquisar");
        pesquisarMenu.setMnemonic('P');
        usuarioMenu.add(pesquisarMenu);

        JMenuItem atualizarMenu = new JMenuItem("Atualizar");
        atualizarMenu.setMnemonic('A');
        usuarioMenu.add(atualizarMenu);

        JMenuItem removerMenu = new JMenuItem("Remover");
        removerMenu.setMnemonic('R');
        usuarioMenu.add(removerMenu);

        atualizarMenu.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    // EditarCadastro application = new EditarCadastro();
                    // application.setDefaultCloseOperation(HIDE_ON_CLOSE);
                }
            }
        );

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('x');

        usuarioMenu.add(exitItem);
        exitItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    int confirmDialog = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair do sistema?", "Mensagem do sistema", JOptionPane.OK_CANCEL_OPTION);
                    System.out.println(confirmDialog);
                    if (confirmDialog <= 0) {
                        System.exit(0);
                    }
                }
            }
        );

        
        cadastrarMenu.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    setVisible(false);
                    RegisterUserView appNovoCadastroView = new RegisterUserView();
                    appNovoCadastroView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
            }
        );
        pesquisarMenu.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    setVisible(false);
                    MostrarCadastroView appNovoCadastroView = new MostrarCadastroView();
                    appNovoCadastroView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
            }
        );

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(usuarioMenu);

        lblNotificacoes = new JLabel();
        lblNotificacoes.setText("Notificações");
        // lblNotificacoes.setHorizontalAlignment(SwingConstants.CENTER);
        lblNotificacoes.setVerticalAlignment(JLabel.BOTTOM);
        lblNotificacoes.setVerticalTextPosition(JLabel.BOTTOM);
        add(lblNotificacoes, new GridBagConstraints());

        setSize(500, 500);
        setVisible(true);
    }

    public static int confirmarSaida() {
        if (JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?",
                "Mensagem do sistema", JOptionPane.PLAIN_MESSAGE) > 0) {
            return EXIT_ON_CLOSE;
        } else {
            return DO_NOTHING_ON_CLOSE;
        }
    }

    public static MenuFrameView appMenuFrame = null;

    public static void main(String[] args) {
        appMenuFrame = new MenuFrameView();
        appMenuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}