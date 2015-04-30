
package pycajas1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ALUMNO
 */
public class Formularios extends JFrame implements ActionListener{
        JButton btnsaludo;
        JButton btnadios;
        JLabel etiqueta;
        JTextField codigo;
        
    public static void main(String[] args) {
        Formularios objventana = new Formularios();
        objventana.setVisible(true);
    }
    
    public Formularios(){
        setSize(500,500);
        setLayout(null);
            etiqueta = new JLabel("direccion");
            etiqueta.setBounds(50,50,100,110);
            add(etiqueta);
            codigo = new JTextField();
            codigo.setBounds(110,50,100,20);
            add(codigo);
            etiqueta = new JLabel("nombres");
            etiqueta.setBounds(50,50,100,70);
            add(etiqueta);
            codigo = new JTextField();
            codigo.setBounds(110,70,100,20);
            add(codigo);
            etiqueta = new JLabel("codigo");
            etiqueta.setBounds(50,50,100,30);
            add(etiqueta);
            codigo = new JTextField();
            codigo.setBounds(110,100,100,20);
            add(codigo);
        btnsaludo = new JButton();
        btnsaludo.setText("saludo");
        btnsaludo.setBounds(100,150,150,20);
        btnsaludo.setVisible(true);
        setLayout(null);
        btnadios = new JButton();
        btnadios.setText("Adios");
        btnadios.setBounds(200,300,150,20);
        btnadios.setVisible(true);
        
        getContentPane().add(btnsaludo);
        btnsaludo.addActionListener(this);
        
        getContentPane().add(btnadios);
        btnadios.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnsaludo) {
            JOptionPane.showMessageDialog(null, "Formulario ejecutado");
        }
        if (e.getSource()==btnadios) {
            JOptionPane.showMessageDialog(null, "segundo Formulario ejecutado");
        }
    }
}
