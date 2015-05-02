package Ventanas;

import Arreglos.ArregloInmueble;
import Bean.Inmueble;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmPrincipal extends JFrame implements ActionListener,ItemListener{
    private JLabel lblTipo;
    private JTextField txtPrecio;
    private JLabel lblTitulo;
    private JButton btnLimpiar;
    private JButton btnGrabar;
    private JTextField txtDimension;
    private JTextField txtDireccion;
    private JLabel lblPrecio;
    private JComboBox cboDistrito;
    private JRadioButton rbtnAlquiler;
    private JRadioButton rbtnVenta;
    private JComboBox cboTipo;
    private JComboBox cboBusqueda;
    private JLabel lblDireccion;
    private JLabel lblDimension;
    private JLabel lblDistrito;
    private JLabel lblTransaccion;
    private JLabel lblbusqueda;
    private ButtonGroup grupo;
    private ComboBoxModel distritoModelo,distritoModelo2;
    String transaccion;
    private JScrollPane barra;
    private JButton btnListar;
    private JTable tabla;
    DefaultTableModel modelo;
    String[]cadena;
    String[]distritos;
    ArregloInmueble ar=new ArregloInmueble();
    public static void main (String[]args){
        FrmPrincipal fr=new FrmPrincipal();
        fr.setVisible(true);
    }
    public FrmPrincipal(){
        setLayout(null);
        setSize(520,650);
        lblTitulo=new JLabel();
        getContentPane().add(lblTitulo);
        lblTitulo.setText("INGRESO DE INMUEBLES");
        lblTitulo.setBounds(120,17,221,16);
        lblTitulo.setFont(new java.awt.Font("Segoe UI",1,18));
        lblTipo=new JLabel();
        getContentPane().add(lblTipo);
        lblTipo.setText("Tipo");
        lblTipo.setBounds(80,56,94,16);
        
        lblTransaccion=new JLabel();
        getContentPane().add(lblTransaccion);
        lblTransaccion.setText("Tipo de Transaccion");
        lblTransaccion.setBounds(80,100,123,21);
          
        lblDistrito=new JLabel();
        getContentPane().add(lblDistrito);
        lblDistrito.setText("Distrito");
        lblDistrito.setBounds(80,147,51,22);
        
           lblDireccion=new JLabel();
        getContentPane().add(lblDireccion);
        lblDireccion.setText("Direccion");
        lblDireccion.setBounds(80,192,83,22);
        
           lblDimension=new JLabel();
        getContentPane().add(lblDimension);
        lblDimension.setText("Dimension");
        lblDimension.setBounds(80,231,75,23);
        
           lblPrecio=new JLabel();
        getContentPane().add(lblPrecio);
        lblPrecio.setText("Precio");
        lblPrecio.setBounds(80,272,50,16);
        lblbusqueda=new JLabel();
        getContentPane().add(lblbusqueda);
        lblbusqueda.setText("Busqueda por Distrito");
        lblbusqueda.setBounds(80, 350, 150, 16);
        cboTipo=new JComboBox();
        getContentPane().add(cboTipo);
        cboTipo.setBounds(220,53,140,20);
        cboTipo.addItem("Departamento");
          cboTipo.addItem("Oficina");
          distritos=new String []{"Los Olivos","Comas","San Miguel","San Isidro","Miraflores","Barranco"};
          distritoModelo=new DefaultComboBoxModel(distritos);
          distritoModelo2=new DefaultComboBoxModel(distritos);
          cboDistrito=new JComboBox();
          cboDistrito.setModel(distritoModelo);
          cboDistrito.setBounds(220, 146, 140, 20);
          getContentPane().add(cboDistrito);
          
          cboBusqueda=new JComboBox();
          cboBusqueda.setModel(distritoModelo2);
          cboBusqueda.setBounds(300,350,130,20);
          getContentPane().add(cboBusqueda);
          cboBusqueda.addActionListener(this);
          //cboBusqueda.addMouseListener(this);
          
          rbtnVenta=new JRadioButton();
          getContentPane().add(rbtnVenta);
          rbtnVenta.setText("Venta");
          rbtnVenta.setBounds(230, 86, 95, 20);
          rbtnVenta.addItemListener(this);
          
      rbtnAlquiler=new JRadioButton();
          getContentPane().add(rbtnAlquiler);
          rbtnAlquiler.setText("Alquiler");
          rbtnAlquiler.setBounds(230,105,70, 20);
          rbtnAlquiler.addItemListener(this);
          
          txtDireccion=new JTextField();
          getContentPane().add(txtDireccion);
          txtDireccion.setBounds(220, 191, 150, 23);
          
              txtDimension=new JTextField();
          getContentPane().add(txtDimension);
          txtDimension.setBounds(220,226,150, 23);
          
              txtPrecio=new JTextField();
          getContentPane().add(txtPrecio);
          txtPrecio.setBounds(220,269,150, 23);
          
              btnGrabar=new JButton();
              getContentPane().add(btnGrabar);
              btnGrabar.setText("Grabar");
              btnGrabar.setBounds(90, 300, 100, 25);
              btnGrabar.addActionListener(this);
              
              btnLimpiar=new JButton();
              getContentPane().add(btnLimpiar);
              btnLimpiar.setText("Limpiar");
              btnLimpiar.setBounds(210,300,100,25);
              btnLimpiar.addActionListener(this);
              grupo=new ButtonGroup();
              
              grupo.add(rbtnVenta);
              grupo.add(rbtnAlquiler);
              cadena=new String[]{"Tipo","Tipo de Transaccion","Distrito","Direccion","Dimension","Precio"};
              modelo= new DefaultTableModel(null,cadena);
              tabla=new JTable();
              tabla.setModel(modelo);
              barra=new JScrollPane();
              barra.setViewportView(tabla);
              barra.setBounds(20,390,460,200);
              getContentPane().add(barra);
              btnListar=new JButton();
              btnListar.setText("Listar");
              btnListar.setBounds(330,300,100,25);
              btnListar.addActionListener(this);
              add(btnListar);
          
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==btnGrabar){
                String tipo=(String)cboTipo.getSelectedItem();
                String distrito= (String)cboDistrito.getSelectedItem();
                String Direccion=txtDireccion.getText();
                String Dimension= txtDimension.getText();
                Double precio=Double.parseDouble(txtPrecio.getText());
                
                Inmueble inm= new Inmueble(tipo,transaccion,distrito,Direccion,Dimension,precio);
                ar.agregar(inm);
                imprimir();
            }
        }catch(Exception r){
    r.printStackTrace();
    JOptionPane.showMessageDialog(null,"Error de ingreso");
    }
        if(e.getSource()==btnListar){
            imprimir();
        }
        if(e.getSource()==btnLimpiar)
            limpiar();
        if(e.getSource()==cboBusqueda){
            limpiar();
            buscar();
        }
}
void imprimir(){
    modelo.setNumRows(ar.Tamaño());
    for(int i=0; i<ar.Tamaño();i++){
        modelo.setValueAt(ar.Obtener(i).getTipo(),i,0);
             modelo.setValueAt(ar.Obtener(i).getTransaccion(),i,1);
                  modelo.setValueAt(ar.Obtener(i).getDistrito(),i,2);
                       modelo.setValueAt(ar.Obtener(i).getDireccion(),i,3);
                            modelo.setValueAt(ar.Obtener(i).getDimension(),i,4);
                            modelo.setValueAt(""+ar.Obtener(i).getPrecio(),i,5);
                            
    }
}
@Override
public void itemStateChanged(ItemEvent e){
    if(rbtnAlquiler.isSelected())
        transaccion="Alquiler";
    if(rbtnVenta.isSelected())
        transaccion="Venta";
    }
void limpiar(){
    for(int i=0;i<ar.Tamaño();i++){
        modelo.setValueAt("", i, 0);
         modelo.setValueAt("", i, 1);
          modelo.setValueAt("", i, 2);
           modelo.setValueAt("", i, 3);
            modelo.setValueAt("", i, 4);
             modelo.setValueAt("", i, 5);
    }
}
void buscar(){
    modelo.setNumRows(ar.Tamaño());
    int n=0;
    for(int i=0; i<ar.Tamaño();i++){
        if((ar.Obtener(i).getDistrito()).equals(cboBusqueda.getSelectedItem())){
            modelo.setValueAt(ar.Obtener(i).getTipo(),n,0);
            modelo.setValueAt(ar.Obtener(i).getTransaccion(),n,1);
                  modelo.setValueAt(ar.Obtener(i).getDistrito(),n,2);
        }
    }
}
}
