
package Bean;


public class Obrero {
    private String nombre;
    private String apellido;
    private int tarifa;
    private int horasSem;
    private double sueldoExtra;
    private double sueldo;
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getTarifa(){
        return tarifa;
    }
    public int getHorasSem(){
        return horasSem;
    }
    public double getSueldoExtra(){
        return sueldoExtra;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTarifa(int tarifa){
        this.tarifa = tarifa;
    }
    public void setHorasSem(int horasSem){
        this.horasSem = horasSem;
    }
    public void setSueldoExtra(double sueldoExtra){
        this.sueldoExtra = sueldoExtra;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public Obrero(String nombre, String apellido, int tarifa, int horasSem, double sueldoExtra, double sueldo){
    this.nombre = nombre;
    this.apellido = apellido;
    this.tarifa = tarifa;
    this.horasSem = horasSem;
    this.sueldoExtra = sueldoExtra;
    this.sueldo = sueldo;
    }
    
}
