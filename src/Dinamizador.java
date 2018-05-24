
public class Dinamizador {

    public void dinamizar(String m[][], String ini, String fi) {

        double adyacencia[][] = convertirMatriz(m);
        int inicio = Integer.parseInt(ini);
        int fin = Integer.parseInt(fi);
        inicio = inicio - 1;
        fin = fin - 1;
        if (inicio == fin) {
            System.out.println("Ya está en la ciudad");
        } else {
            Linea[] matriz = new Linea[adyacencia.length];
            for (int i = 0; i < adyacencia.length; i++) {
                matriz[i] = new Linea(i, "", 0, 0);
                if (i != inicio) {
                    matriz[i].Valor = adyacencia[inicio][i] + adyacencia[i][fin];
                    if (i == fin) {
                        matriz[i].Recorrido = String.valueOf((i+1));
                    } else {
                        matriz[i].Recorrido = (inicio + 1) + "->" + i + "->" + (fin + 1);
                    }
                } else {
                    matriz[i].Recorrido = (inicio + 1) + "->" + (fin + 1);
                    matriz[i].Valor = adyacencia[inicio][fin];
                }
                try {
                    matriz[i].Mejor = Math.min(matriz[i].Valor, matriz[i - 1].Mejor);
                } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                    System.out.println(AIOOBE.getMessage());
                    matriz[i].Mejor = matriz[i].Valor;
                }
            }

            double menorRecorrido = matriz[matriz.length - 1].Mejor;
            System.out.println("El menor recorrido que se puede lograr es " + menorRecorrido);
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i].Mejor == menorRecorrido) {
                    System.out.println(matriz[i].Recorrido);
                    break;
                }
            }
        }
    }

    public double[][] convertirMatriz(String m[][]) {
        double[][] matriz = new double[m.length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].equals("inf")) {
                    matriz[i][j] = Double.POSITIVE_INFINITY;
                } else {
                    matriz[i][j] = Double.parseDouble(m[i][j]);
                }
            }
        }
        return matriz;
    }

    public void imprimirMatriz(double Matriz[][]) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
