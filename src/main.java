
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ciudades"));
        Mostrador M = new Mostrador(valor);
        M.setVisible(true);

//        double graph[][]
//                = {{Double.POSITIVE_INFINITY, 2, 1, 3},
//                {7, Double.POSITIVE_INFINITY, 9, 2},
//                {2, 2, Double.POSITIVE_INFINITY, 1},
//                {3, 4, 8, Double.POSITIVE_INFINITY}};
//        int inicio = 0;
//        int fin = 2;
//        Linea[] matriz = new Linea[graph.length];
//        for (int i = 0; i < graph.length; i++) {
//            matriz[i] = new Linea(i, "", 0, 0);
//            if (i != inicio) {
//                matriz[i].Valor = graph[inicio][i] + graph[i][fin];
//                if (i == fin) {
//                    matriz[i].Recorrido = String.valueOf(i);
//                }else{
//                    matriz[i].Recorrido = inicio + "->" + i + "->" + fin;
//                }
//            } else {
//                matriz[i].Recorrido = inicio + "->" + fin;
//                matriz[i].Valor = graph[inicio][fin];
//            }
//            try {
//                matriz[i].Mejor = Math.min(matriz[i].Valor, matriz[i - 1].Mejor);
//            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
//                System.out.println(AIOOBE.getMessage());
//                matriz[i].Mejor = matriz[i].Valor;
//            }
//        }
//        for (Linea matriz1 : matriz) {
//            System.out.println(matriz1.Nodo + " | " + matriz1.Valor + " | " + matriz1.Mejor + " | " + matriz1.Recorrido);
//        }

    }

}
