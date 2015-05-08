
package Tarea;


public class Server {

    public double Subtotal(double precio, int cantidad){
        double subtotal = precio * cantidad;
        return subtotal;
    }
    public double Igv(double subtotal){
        double igv = subtotal * 0.18;
        return igv;
    }
    public double Total(double subtotal, double igv){
        double total = subtotal + igv;
        return total;
    }
    public void Salir(){
        System.exit(0);
    }
}
