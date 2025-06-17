
package clases;


public class Docente extends Empleado implements Comparable<Docente>{
    int sala;
    int dni;


    public Docente(){}
    
    public Docente(String nbre, String ape, String direccion, int sala, int dni) {
        super(nbre, ape, direccion);
        this.sala = sala;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;}
    
    public void setSala(int sala) {this.sala = sala;}

    public int getSala() {return sala;} 

    public void setNbre(String nbre) {this.nbre = nbre;}

    public String getApe() {return ape;}

    public void setApe(String ape) {this.ape = ape;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    @Override
    public String getNombre() {return this.nbre;}

    @Override
    public String getDireccion() {return this.direccion;}

    @Override
    public String toString() {
        return "Docente{Nombre: "+super.nbre+" Apellido: "+super.ape + "sala=" + sala + '}';
    }

     @Override
    public int compareTo(Docente d) {
        return this.ape.compareToIgnoreCase(d.getApe()); // Orden por apellido
    }
}
