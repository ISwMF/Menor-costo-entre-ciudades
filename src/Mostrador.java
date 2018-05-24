
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mostrador extends JFrame {

    int numerodeciudades;

    public Mostrador(int numerodeciudades) {
        this.numerodeciudades = numerodeciudades;
        JPanel PanelMatriz = new JPanel(new GridLayout(numerodeciudades, numerodeciudades));
        JPanel PanelBoton = new JPanel(new GridLayout(1, 0));
        JPanel PanelSelCiud = new JPanel(new GridLayout(0, 2));
        JPanel PanelTodo = new JPanel();
        PanelTodo.setLayout(new BoxLayout(PanelTodo, BoxLayout.PAGE_AXIS));
        JTextField[] valores = new JTextField[numerodeciudades * numerodeciudades];
        int j = 0;
        for (int i = 0; i < numerodeciudades * numerodeciudades; i++) {
            if (i == j) {
                valores[i] = new JTextField("inf");
                valores[i].setEditable(false);
                PanelMatriz.add(valores[i]);
                j = j + numerodeciudades + 1;
            } else {
                valores[i] = new JTextField();
                PanelMatriz.add(valores[i]);

            }
        }
        String[] ciudades = new String[numerodeciudades];
        for (int i = 0; i < ciudades.length; i++) {
            ciudades[i] = String.valueOf((i + 1));
        }
        JComboBox ciudades1 = new JComboBox(ciudades);
        JComboBox ciudades2 = new JComboBox(ciudades);
        PanelSelCiud.add(ciudades1);
        PanelSelCiud.add(ciudades2);
        JButton Button = new JButton("Espero que funcione");
        Button.addActionListener((ActionEvent e) -> {
            String matriz[][] = new String[numerodeciudades][numerodeciudades];
            int recorrido = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int k = 0; k < matriz[i].length; k++) {
                    matriz[i][k] = valores[recorrido].getText();
                    recorrido++;
                }
            }
            String inicio = (String)ciudades1.getSelectedItem();
            String fin = (String)ciudades2.getSelectedItem();
            Dinamizador D = new Dinamizador();
            D.dinamizar(matriz, inicio, fin);
        });
        PanelBoton.add(Button);
        PanelTodo.add(PanelMatriz);
        PanelTodo.add(PanelSelCiud);
        PanelTodo.add(PanelBoton);
        this.add(PanelTodo);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
