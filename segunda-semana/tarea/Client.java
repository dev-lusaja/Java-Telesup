
package Tarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Client  extends JFrame  implements ActionListener{
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
    Server obj_functions = new Server();
    
    public static void main(String[] args) {
       Client obj_window = new Client();
       obj_window.setVisible(true);
    }
    
    public Client(){
        setSize(500,300);
        setLayout(null);
        setTitle("Formulario");
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
        getContentPane().add(btn_mostrar);
        btn_mostrar.addActionListener(this);
        
        btn_salir = new JButton("Salir");
        btn_salir.setBounds(280,200, 90,30);
        add(btn_salir);
        getContentPane().add(btn_salir);
        btn_salir.addActionListener(this);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_salir) {
            obj_functions.Salir();
        }
        if (e.getSource()==btn_mostrar) {
            String codigo = codigof.getText();
            String precio = preciof.getText();
            String descripcion = descripcionf.getText();
            String cantidad = cantidadf.getText();
            double subtotal = obj_functions.Subtotal(Double.parseDouble(precio),Integer.parseInt(cantidad));
            double igv = obj_functions.Igv(subtotal);
            double total = obj_functions.Total(subtotal, igv);
            JOptionPane.showMessageDialog(null, "Detalles de la compra:\n"
                    + "Producto: "+descripcion+"\n"
                    + "SubTotal: "+subtotal+"\n"
                    + "IGV: "+igv+"\n"
                    + "Total: "+total);
        }
    }

}
