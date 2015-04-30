/**
 *
 * @author Admin-Oscar
 */
package Num_Mayor;
import javax.swing.JOptionPane;
public class client extends functions{


    public static void main(String[] args) {
        double[] valores = new double[2];
        int i=0;
        do {
            String valor = JOptionPane.showInputDialog("Ingresa el "+(i+1)+"° valor");
            valores[i]=Double.parseDouble(valor);
            i++;
        } while (i<valores.length);
        client Obj_client = new client();
        double mayor = Obj_client.comparar(valores[0], valores[1]);
        if (mayor == 0) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "El numero mayor es: "+mayor);
        }
        
    }
    
}
