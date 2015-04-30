
package Tarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Client  extends JFrame implements ActionListener{
    JButton btn_mostrar;
    JButton btn_salir;
    JLabel titulo;
    JLabel codigo;
    JLabel precio;
    JLabel descripcion;
    JLabel cantidad;
    JTextField codigof;
    JTextField preciof;
    JTextField descripcionf;
    JTextField cantidadf;
    
    public static void main(String[] args) {
       Client obj_window = new Client();
       obj_window.setVisible(true);
    }
    
    public Client(){
        setSize(500,300);
        setLayout(null);
        titulo = new JLabel("Listado de Articulos");
        titulo.setBounds(170,10,150,50);
        add(titulo);
        codigo = new JLabel("Codigo");
        codigo.setBounds(80,50,100,30);
        add(codigo);  
        codigof = new JTextField();
        codigof.setBounds(140,50,100,30);
        add(codigof);  

        precio = new JLabel("Precio");
        precio.setBounds(250,50,100,30);
        add(precio);  
        preciof = new JTextField();
        preciof.setBounds(300,50,100,30);
        add(preciof);  
        
        descripcion = new JLabel("Descripcion");
        descripcion.setBounds(80,100,100,30);
        add(descripcion);  
        descripcionf = new JTextField();
        descripcionf.setBounds(160,100,240,30);
        add(descripcionf);  
        
        cantidad = new JLabel("Cantidad");
        cantidad.setBounds(80,150,100,30);
        add(cantidad);  
        cantidadf = new JTextField();
        cantidadf.setBounds(160,150,240,30);
        add(cantidadf);  
        
        btn_mostrar = new JButton("Mostrar");
        btn_mostrar.setBounds(100,200, 90,30);
        add(btn_mostrar);
        
        btn_salir = new JButton("Salir");
        btn_salir.setBounds(280,200, 90,30);
        add(btn_salir);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
