/**
 *
 * @author Admin-Oscar
 */
package Promedio;
import javax.swing.JOptionPane;

public class client extends functions{

    public static void main(String[] args) {
        client obj_client = new client();
        double[] notas =  new double[3];
        String estado;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Alumno");
        int i = 0;
        do {
            String nota = JOptionPane.showInputDialog("Ingrese la "+(i+1)+"° nota");
            notas[i]= Double.parseDouble(nota);
            i++;
        } while (i<notas.length);
        
        double promedio = obj_client.promedio(notas[0], notas[1], notas[2]);
        if (promedio>11) {
            estado = "Aprobado";
        } else {
            estado = "Desaprobado";
        }
        JOptionPane.showMessageDialog(null, "Alunmo:\n"+nombre+"\nNotas ingresadas:\n"+notas[0]+"\n"+notas[1]+"\n"+notas[2]+"\nEl promedio de las notas es: "+promedio+"\nEstado: "+estado);
    }
    
}
