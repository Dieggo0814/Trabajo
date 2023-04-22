import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JButton añadirInformaciónDeUnButton;

    private JButton apilarButton;

    private JButton desapilarButton;

    private JFormattedTextField informaciónAsociadaAUnFormattedTextField;

    private JPanel mainPanel;

    private JButton verListadoDeContenedoresButton;

    public Interfaz(){
        setTitle("Interfaz trabajo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra la aplicacion y sale de memoria
        setVisible(true);
        setContentPane(mainPanel);
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        añadirInformaciónDeUnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        verListadoDeContenedoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new Interfaz();
    }
}
