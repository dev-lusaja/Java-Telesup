
package Public;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.regex.*;

public class Form extends JFrame implements  ActionListener {
    
    JButton btnCalcular;
    JButton btnLimpiar;
    JButton btnCerrar;
    JLabel label;
    JTextField apellidos_f;
    JTextField sueldo;
    JTextField n_faltas;
    JTextField sueldo_neto;
    Libs.functions obj_functions = new Libs.functions();
    
    public static void main(String[] args) {
    Form objventana=new Form();
       objventana.setVisible(true);            
    } 
    
    public Form(){       
        setSize(550,350);
        setLayout(null);        
        setTitle("Descuentos a trabajadores");
        
        label=new JLabel("Apellidos");
        label.setBounds(65,50,100,30);
        add(label);
        
        apellidos_f=new JTextField();
        apellidos_f.setBounds(200,50,300,30);
        add(apellidos_f);
        
        label=new JLabel("Sueldo");
        label.setBounds(65,100,100,30);
        add(label);
        
        sueldo=new JTextField();
        sueldo.setBounds(200,100,300,30);
        add(sueldo);
        
        label=new JLabel("Nº de Faltas");
        label.setBounds(65,150,150,30);
        add(label); 
        
        n_faltas=new JTextField();
        n_faltas.setBounds(200,150,300,30);
        add(n_faltas);
        
        label=new JLabel("Sueldo Final");
        label.setBounds(65,200,100,30);
        add(label);
        
        sueldo_neto=new JTextField();
        sueldo_neto.setBounds(200,200,300,30);
        add(sueldo_neto);
        
        btnCalcular=new JButton();
        btnCalcular.setText("Calcular");
        btnCalcular.setBounds(120,250,100,20);
        setLayout(null);
        getContentPane().add(btnCalcular);
        btnCalcular.addActionListener(this);
        
        btnLimpiar=new JButton();
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBounds(260,250,100,20);
        btnLimpiar.setVisible(true);
        getContentPane().add(btnLimpiar);
        btnLimpiar.addActionListener(this);
        
        btnCerrar=new JButton();
        btnCerrar.setText("Salir");
        btnCerrar.setBounds(400,250,100,20);
        btnCerrar.setVisible(true);
        getContentPane().add(btnCerrar);
        btnCerrar.addActionListener(this);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btnCalcular)        
            {
                Pattern p = Pattern.compile("[{digit}]+");
                Matcher m = p.matcher(sueldo.getText());
                boolean resultado_sueldo = m.find();
                Pattern p2 = Pattern.compile("[d]+");
                Matcher m2 = p2.matcher(n_faltas.getText());                
                boolean resultado_nfaltas = m2.find();
                if (resultado_sueldo == true) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros en el sueldo");
                    sueldo.requestFocus();
                } else if(resultado_nfaltas == true){
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros en el numero de faltas");
                    n_faltas.requestFocus();
                } else {
                    double descuento = obj_functions.Descuento(Double.parseDouble(sueldo.getText()), Integer.parseInt(n_faltas.getText()));
                    JOptionPane.showMessageDialog(null, "Descuento: "+String.valueOf(descuento));
                    double s_neto = Double.parseDouble(sueldo.getText()) - descuento;
                    sueldo_neto.setText(String.valueOf(s_neto));
                }
            } 
                if(e.getSource()==btnLimpiar)
                {
                    apellidos_f.setText("");
                    sueldo.setText("");
                    n_faltas.setText("");
                    sueldo_neto.setText("");
                }
                if(e.getSource()==btnCerrar)
                {
                    obj_functions.Salir();
                }
        }
    }   
