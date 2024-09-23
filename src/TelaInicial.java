import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial {
    private JLabel inicialLabel;
    private JButton botaoInicial1;
    private JButton botaoInicial2;
    private JButton botaoInicial3;
    private JPanel painel1;
    private JPanel painelBoasVindas;

    public TelaInicial() {
        JFrame frame = new JFrame("Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(painel1);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        botaoInicial3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}