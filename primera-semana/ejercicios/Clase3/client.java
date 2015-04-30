

package Clase3;

import javax.swing.JOptionPane;

public class client  extends Calculadora{

    public static void main(String[] args) {
    String opcion = JOptionPane.showInputDialog("Ingresa opcion\nsuma(1)\nresta(2)\nmultiplicacion(3)\ndivision(4)");
    String val1 = JOptionPane.showInputDialog("Ingresa el primer valor");
    String val2 = JOptionPane.showInputDialog("Ingresa el segundo valor");
    client Obj_client = new client(Integer.parseInt(val1),Integer.parseInt(val2));
   
    int int_opcion = Integer.parseInt(opcion);
    
        switch(int_opcion)
        {
            case 1:
                {
                    double suma =Obj_client.Suma();
                    String result = String.valueOf(suma);
                    JOptionPane.showMessageDialog(null, "La suma es: "+result);
                    break;
                }
            case 2:
                {
                    double resta =Obj_client.Resta();
                    String result = String.valueOf(resta);
                    JOptionPane.showMessageDialog(null, "La resta es: "+result);
                    break;
                }
            case 3:
                {
                    double multi =Obj_client.Multiplicacion();
                    String result = String.valueOf(multi);
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: "+result);
                    break;
                }
            case 4:
                {
                    if (Integer.parseInt(val2)==0) {
                        JOptionPane.showMessageDialog(null, "El divisor no debe ser 0");
                        break;
                    }
                    double divi =Obj_client.Division();
                    String result = String.valueOf(divi);
                    JOptionPane.showMessageDialog(null, "La division es: "+result);
                    break;
                }
            default:
                {
                    System.exit(0);
                }
            
        }
    
    }
    
    public  client(int v1, int v2){
        super(v1, v2);
    }
    
}