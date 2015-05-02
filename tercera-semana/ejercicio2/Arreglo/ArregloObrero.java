
package Arreglo;
import Bean.Obrero;
import java.util.ArrayList;
public class ArregloObrero {
    
    public ArrayList<Obrero> pr;
    
    public ArregloObrero(){
        pr = new ArrayList<Obrero>();
    }
    
    public void adicionar(Obrero x){
        pr.add(x);
    }
    public void eliminar(Obrero x){
        pr.remove(x);
    }
    
    public Obrero buscar(int cod){
        for (int i = 0; i < pr.size(); i++) {
            if (cod==pr.get(i).getTarifa()) {
                return pr.get(i);
            }
        }
        return null;
    }
    public Obrero obtener(int pos){
        return pr.get(pos);
    }
    public int tamaño(){
        return pr.size();
    }
}
