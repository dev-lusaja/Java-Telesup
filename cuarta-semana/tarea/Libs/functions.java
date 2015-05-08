
package Libs;


public class functions {
    public double Descuento(double sueldo, int faltas){
        double sueldo_diario, descuento;
        sueldo_diario = (sueldo / 26);
        descuento = (sueldo_diario * faltas) * 2;
        return descuento;
    }
    
    public void Salir(){
        System.exit(0);
    }
}
