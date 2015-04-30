package proyectotabla;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import UPT.JAVA.DAO.AlumnoDAO;
import java.util.*;
import UPT.JAVA.BEAN.Alumno;

public class proyectotabla  extends JFrame{
    JScrollPane barra;
    JTable tabla;
    DefaultTableModel modelo;
    String columnas[]={"codigo","Nombre","Apellido","Edad"};

    public static void main(String[] args) {
    proyectotabla ventana = new proyectotabla();
    ventana.setVisible(true);
    }
    
    public proyectotabla(){
    setSize(800,500);
    setLayout(null);
    barra = new JScrollPane();
    tabla = new JTable();
    modelo = new DefaultTableModel(null,columnas);
    
    tabla.setModel(modelo);
    barra.setViewportView(tabla);
    barra.setBounds(50,50,500,200);
    add(barra);
    cargarDatos();
    }

    public void cargarDatos(){
    AlumnoDAO objAlumnoDAO = new AlumnoDAO();
    ArrayList<Alumno> lista = objAlumnoDAO.cargarDatos();
    int i = 0;
    modelo.setNumRows(lista.size());
        for (Alumno obj:lista) {
            modelo.setValueAt("001", i, 0);
            modelo.setValueAt("Oscar", i, 1);
            modelo.setValueAt("Sanchez", i, 2);
            modelo.setValueAt("25", i, 3);
            i++;
        }
    }
}
