package Clase3;


public class Calculadora {
double val1;
double val2;


    public Calculadora(int v1, int v2){
    val1 = v1;
    val2 = v2;
    }
    public double Suma(){
    double suma = val1 + val2;
    return suma;
    }
    
    public double Resta(){
    double resta = val1 - val2;
    return resta;
    }
    
    public double Multiplicacion(){
    double multi = val1 * val2;
    return multi;
    }
    
    public double Division(){
    double divi = val1 / val2;
    return divi;
    }
    
    public static void main(String[] args) {
        
    }
    
}
