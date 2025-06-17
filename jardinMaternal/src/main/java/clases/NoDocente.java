
package clases;


public class NoDocente extends Empleado implements Comparable<NoDocente>{
    String categoria;
    int dni;
    public NoDocente(){}
    
    public NoDocente(String nbre, String ape, String direccion, String categoria) {
        super(nbre, ape, direccion);
        this.categoria = categoria;
        this.dni = dni;}

    public int getDni() {return dni;}

    public void setDni(int dni) {this.dni = dni;}
    
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getCategoria() {return categoria;}
    
    public void setNbre(String nbre) {this.nbre= nbre;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getApe() {return ape;}

    public void setApe(String ape) {this.ape = ape;}
    
    @Override
    public String getNombre() {return this.nbre;}

    @Override
    public String getDireccion() {return this.direccion;}

    @Override
    public String toString() {
        return "NoDocente{Nombre: "+this.nbre+" "+this.ape+ ", categoria=" + categoria + '}';
    }
  
    @Override
    public int compareTo(NoDocente n) {
        return this.ape.compareToIgnoreCase(n.getApe()); // Ordenar por apellido
    }
}
