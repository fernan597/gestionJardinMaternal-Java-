
package clases;


public abstract class Empleado{
    String nbre;
    String ape;
    String direccion;
    public Empleado(){}
    public Empleado(String nbre,String ape, String direccion){
        this.nbre = nbre;
        this.ape = ape;
        this.direccion = direccion;
    }
    public abstract String getNombre();
    public abstract String getDireccion();
    
}
