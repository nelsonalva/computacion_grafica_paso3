package panda;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame {

//    ATRIBUTOS
    private final Panel panel;

//   MÉTODO CONSTRUCTOR
    public Ventana() {
        // DISEÑO
        setTitle("Panda - Por Nelson Álvarez");
        setSize(700, 600);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));

        // INSTANCIAR
        panel = new Panel();

        // AGREGAR
        add(panel);
    }
}
