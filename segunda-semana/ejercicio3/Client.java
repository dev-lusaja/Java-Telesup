package UPT.JAVA.PRINCIPAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
public class Client extends JFrame implements ActionListener{
    JButton agregar,listar,limpiar,vaciar;
    JLabel etiqueta;
    JTextField codigo;
    JTextField edad;
    JTextField apellidos;
    JTextField nombres;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane barra;
    ArrayList<Lista>list=new ArrayList<Lista>();
    String columnas[]={"codigo","nombres","apellidos","edad"};
    int i= 0;
    public static void main(String[] args) {
        Client z=new Client();
    }
    private Object e;
    public Client(){
        setVisible(true);
        setLayout(null);
        setSize(700,800);
        etiqueta=new JLabel("codigo");
        etiqueta.setBounds(50,50,100,30);
        add(etiqueta);
        etiqueta=new JLabel("nombre");
        etiqueta.setBounds(50,100,100,30);
        add(etiqueta);
        etiqueta=new JLabel("apellidos");
        etiqueta.setBounds(50,150,100,30);
        add(etiqueta);
        etiqueta=new JLabel("edad");
        etiqueta.setBounds(50,200,100,30);
        add(etiqueta);
        codigo=new JTextField();
        codigo.setBounds(200,50,200,30);
        add(codigo);
        nombres=new JTextField();
        nombres.setBounds(200,100,200,30);
        add(nombres);
        apellidos=new JTextField();
        apellidos.setBounds(200,150,200,30);
        add(apellidos);
        edad=new JTextField();
        edad.setBounds(200,200,200,30);
        add(edad);
        agregar=new JButton("agregar");
        agregar.setBounds(200,250,100,30);
        add(agregar);
        agregar.addActionListener(this);
        limpiar=new JButton("limpiar");
        limpiar.setBounds(350,250,100,30);
        add(limpiar);
        limpiar.addActionListener(this);
        listar=new JButton("listar");
        listar.setBounds(50,250,100,30);
        add(listar);
        listar.addActionListener(this);
        modelo=new DefaultTableModel(null,columnas);
        tabla=new JTable();
        tabla.addMouseListener(null);
        tabla.setModel(modelo);
        barra=new JScrollPane();
        barra.setViewportView(tabla);
        barra.setBounds(50,400,400,300);
        add(barra); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==agregar){
            Lista a= new Lista();
            a.setCodigo(codigo.getText());
            a.setNombre(nombres.getText());
            a.setApellidos(apellidos.getText());
            a.setEdad(edad.getText());
            list.add(a);
            codigo.setText("");
            nombres.setText("");
            apellidos.setText("");
            edad.setText(""); 
        }
        if(e.getSource()==limpiar){
            for(int j=0;j<i;j++){
                modelo.setValueAt("",j,0);
                modelo.setValueAt("",j,1);
                modelo.setValueAt("",j,2);
                modelo.setValueAt("",j,3);
            } 
        }
        if(e.getSource()==listar){
            modelo.setNumRows(list.size());
            i=0;
            for(Lista z:list){
                modelo.setValueAt(z.getCodigo(),i,0);
                modelo.setValueAt(z.getNombre(),i,1);
                modelo.setValueAt(z.getApellidos(),i,2);
                modelo.setValueAt(z.getEdad(),i,3);
                i++;
            }
        }
    }
}