package Clase2;

import java.awt.Component;
import javax.swing.JOptionPane;
public class ClaseB{
int cantidad;
int precio;

    public void producto(){
        String cantidad2 = String.valueOf(cantidad);
        String precio2 = String.valueOf(precio);

        JOptionPane.showMessageDialog(null,"La cantidad es "+cantidad2);
        JOptionPane.showMessageDialog(null,"El precio es "+precio2);
        double r = cantidad*precio;
        System.out.println(r);
    }
    public ClaseB(int val1, int val2){
        cantidad = val1;
        precio = val2;
    }
    
        public static void main(String[] args) {
    }
    
}
