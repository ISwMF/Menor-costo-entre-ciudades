
public class Linea {

    int Nodo;
    String Recorrido;
    double Valor;
    double Mejor;

    public Linea(int Nodo, String Recorrido, double Valor, double Mejor) {
        this.Nodo = Nodo;
        this.Recorrido = Recorrido;
        this.Valor = Valor;
        this.Mejor = Mejor;
    }
    
    public void imprimir(){
        System.out.println("Numero: " + Nodo + ", || Valor: " + Valor + ", || Mejor: " + Mejor + ", || Recorrido: " + Recorrido);
    }

}
