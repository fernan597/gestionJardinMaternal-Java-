
package clases;

public class Alumno implements Comparable<Alumno> {
    String nbre;
    String ape;
    int edad;
    int dni;
    
    public Alumno(){}
    
    public Alumno(String nbre, String ape, int edad){
        this.nbre = nbre;
        this.ape = ape;
        this.edad = edad;
        this.dni = dni;
    }

    public int getDni() {return dni;}

    public void setDni(int dni) {this.dni = dni;}
    
    public String getNbre() {return nbre;}

    public void setNbre(String nbre) {this.nbre= nbre;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}
    
    public String getApe() {return ape;}

    public void setApe(String ape) {this.ape = ape;}
    
    @Override
    public int compareTo(Alumno a) {
        return this.ape.compareToIgnoreCase(a.getApe()); // Ordenar por apellido
    }
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nbre + ", apellido=" + ape + ", edad=" + edad + "}\n";
    }

    
    
    
    
}
