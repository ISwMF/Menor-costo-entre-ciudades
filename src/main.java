
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ciudades"));
        Mostrador M = new Mostrador(valor);
        M.setVisible(true);
    }

}
