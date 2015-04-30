
package Num_Mayor;


public class functions {

    public double comparar(double v1, double v2){
        double mayor;
        if (v1>v2) {
            mayor = v1;
        } else if (v2>v1) {
            mayor = v2;
        }else{
            mayor = 0;
        }
        return mayor;
    }
    public static void main(String[] args) {

    }
    
}
