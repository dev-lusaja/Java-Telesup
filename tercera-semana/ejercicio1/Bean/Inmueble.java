
package Bean;


public class Inmueble {
    private String tipo;
    private String transaccion;
    private String distrito;
    private String direccion;
    private String dimension;
    private Double precio;
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTransaccion(){
        return transaccion;
    }
    public void setTransaccion(String transaccion){
        this.transaccion = transaccion;
    }
    
    public String getDistrito(){
        return distrito;
    }
    public void setDistrito(String distrito){
        this.distrito = distrito;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDimension(){
        return dimension;
    }
    public void setDimension(String dimension){
        this.dimension = dimension;
    }
    
    public Double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public Inmueble(String tipo, String transaccion, String distrito, String direccion, String dimension, double precio){
        this.tipo = tipo;
        this.transaccion = transaccion;
        this.distrito = distrito;
        this.direccion = direccion;
        this.dimension = dimension;
        this.precio = precio;
    }
    
   
}
