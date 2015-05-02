package Arreglos;
import Bean.Inmueble;
import java.util.ArrayList;


public class ArregloInmueble {
    public ArrayList<Inmueble> ar;
    public ArregloInmueble(){
        ar = new ArrayList<Inmueble>();
    }
    public void agregar(Inmueble inm){
    ar.add(inm);
    }
    public Inmueble Obtener(int i){
        return ar.get(i);
    }
    public int Tamaño(){
        return ar.size();
    }
}


