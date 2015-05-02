
package Ventana;
import Arreglo.ArregloObrero;
import Bean.Obrero;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmPrincipal extends JFrame implements ActionListener{
    private JLabel lblTitulo;
    private JLabel lblTarifa;
    private JLabel lblNombre;
    private JLabel lblHorasSem;
    private JTextField txtTarifa;
    private JTextField txtNombre;
    private JButton btnEliminar, btnLimpiar, btnSalir;
    private JButton btnBuscar;
    private JButton btnListar;
    private JButton btnRegistrar;
    private JTextField txtHorasSem;
    private JTextField txtApellido;
    private JLabel lblApellido;
    private JTable tabla;
    private JScrollPane Panel;
    
    DefaultTableModel tablaModel;
    ArregloObrero ar = new ArregloObrero();

    public static void main(String[] args) {
        FrmPrincipal Fr = new FrmPrincipal();
        Fr.setVisible(true);
    }
    public FrmPrincipal(){
        String columnas[]={"NOMBRE", "APELLIDO", "TARIFA", "HORAS SEMANALES", "S. EXTRA", "SUELDO"};
        try{
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            setSize(600,550);
            getContentPane().setLayout(null);
            
                lblTitulo = new JLabel();
                getContentPane().add(lblTitulo);
                lblTitulo.setText("Registro de Obreros");
                lblTitulo.setBounds(206,20,191,32);
                
                lblTarifa = new JLabel();
                getContentPane().add(lblTarifa);
                lblTarifa.setText("Pago por hora");
                lblTarifa.setBounds(78,156,120,16);
                
                lblNombre = new JLabel();
                getContentPane().add(lblNombre);
                lblNombre.setText("Nombres");
                lblNombre.setBounds(78,84,74,16);
                
                lblApellido = new JLabel();
                getContentPane().add(lblApellido);
                lblApellido.setText("Apellidos");
                lblApellido.setBounds(78,122,74,16);
                
                lblHorasSem = new JLabel();
                getContentPane().add(lblHorasSem);
                lblHorasSem.setText("horas Semanales");
                lblHorasSem.setBounds(78,193,120,16);
                
                txtTarifa = new JTextField();
                getContentPane().add(txtTarifa);
                txtTarifa.setBounds(206,153,128,23);
                
                txtNombre = new JTextField();
                getContentPane().add(txtNombre);
                txtNombre.setBounds(206,81,218,23);
                
                txtApellido = new JTextField();
                getContentPane().add(txtApellido);
                txtApellido.setBounds(206,119,128,23);
                
                txtHorasSem = new JTextField();
                getContentPane().add(txtHorasSem);
                txtHorasSem.setBounds(206,190,128,23);
                
                btnRegistrar = new JButton();
                getContentPane().add(btnRegistrar);
                btnRegistrar.setText("Registrar");
                btnRegistrar.setBounds(425,81,128,23);
                btnRegistrar.addActionListener(this);
                
                btnListar = new JButton();
                getContentPane().add(btnListar);
                btnListar.setText("Listar");
                btnListar.setBounds(425,119,90,23);
                btnListar.addActionListener(this);
                
                btnBuscar = new JButton();
                getContentPane().add(btnBuscar);
                btnBuscar.setText("Buscar");
                btnBuscar.setBounds(425,156,90,23);
                btnBuscar.addActionListener(this);
                
                btnEliminar = new JButton();
                getContentPane().add(btnEliminar);
                btnEliminar.setText("Eliminar");
                btnEliminar.setBounds(425,190,90,23);
                btnEliminar.addActionListener(this);
                
                btnLimpiar = new JButton();
                getContentPane().add(btnLimpiar);
                btnLimpiar.setText("Limpiar");
                btnLimpiar.setBounds(170,230,82,23);
                btnLimpiar.addActionListener(this);
                
                btnSalir = new JButton();
                getContentPane().add(btnSalir);
                btnSalir.setText("Salir");
                btnSalir.setBounds(280,230,82,23);
                btnSalir.addActionListener(this);
                
                Panel = new JScrollPane();
                getContentPane().add(Panel);
                Panel.setBounds(20,280,540,200);
                
                tablaModel = new DefaultTableModel(null, columnas);
                tabla = new JTable();
                Panel.setViewportView(tabla);
                tabla.setModel(tablaModel);
                
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnRegistrar) {
            try{
                int tarifa = Integer.parseInt(txtTarifa.getText());
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                int HorasSeman = Integer.parseInt(txtHorasSem.getText());
                double extra = calcularExtra(HorasSeman, tarifa);
                double sueldo = extra+HorasSeman*40;
                
                Obrero o = new Obrero(nombre, apellido, tarifa, HorasSeman, extra ,sueldo);
                ar.adicionar(o);
                imprimir();
            } catch (Exception r){
                r.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error de ingreso");
            }
        }
        if (e.getSource()==btnListar) {
            imprimir();
        }
        if (e.getSource()==btnLimpiar) {
            limpiar();
        }
        if (e.getSource()==btnBuscar) {
            String dato = txtNombre.getText();
            buscar(dato);
        }
        if (e.getSource()==btnSalir) {
            System.exit(1);
        }
    }
    
    void imprimir(){
        tablaModel.setNumRows(ar.tamaño());
        for (int i = 0; i < ar.tamaño(); i++) {
            tablaModel.setValueAt(ar.obtener(i).getNombre(),i,0);
            tablaModel.setValueAt(ar.obtener(i).getApellido(),i,1);
            tablaModel.setValueAt(""+ar.obtener(i).getTarifa(),i,2);
            tablaModel.setValueAt(""+ar.obtener(i).getHorasSem(),i,3);
            tablaModel.setValueAt(""+ar.obtener(i).getSueldoExtra(),i,4);
            tablaModel.setValueAt(""+ar.obtener(i).getSueldo(),i,5);
        }
    }
    void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtTarifa.setText("");
        txtHorasSem.setText("");
        for (int i = 0; i < ar.tamaño(); i++) {
            tablaModel.setValueAt("",i,0);
            tablaModel.setValueAt("",i,1);
            tablaModel.setValueAt("",i,2);
            tablaModel.setValueAt("",i,3);
            tablaModel.setValueAt("",i,4);
            tablaModel.setValueAt("",i,5);
        }
    }
    void buscar(String dato){
        tablaModel.setNumRows(ar.tamaño());
        int n = 0;
        for (int i = 0; i < 10; i++) {
            if ((ar.obtener(i).getNombre()).equals(dato)){
                tablaModel.setValueAt(ar.obtener(i).getNombre(),n,0);
                tablaModel.setValueAt(ar.obtener(i).getApellido(),n,1);
                tablaModel.setValueAt(""+ar.obtener(i).getTarifa(),n,2);
                tablaModel.setValueAt(""+ar.obtener(i).getHorasSem(),n,3);
                tablaModel.setValueAt(""+ar.obtener(i).getSueldoExtra(),n,4);
                tablaModel.setValueAt(""+ar.obtener(i).getSueldo(),n,5);
                n++;  
            }
        }
    }
    public double calcularExtra(int x, int y){
        if ((x>40)&&((x-40)<8)) {
            return (x-40)*2*y;
        }else if((x>40)&&((x-40)>8)){
            return (x-48)*3*y+(16*y);
        } else {
            return 0;
        }
    }
}
