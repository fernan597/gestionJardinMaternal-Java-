
package clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Jardin {
    ArrayList<Docente> docentes;
   private ArrayList<NoDocente> noDocentes;
   private ArrayList<Alumno> alumnos;
    
    public Jardin(){
        docentes = new ArrayList<>();
        noDocentes = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(Docente docente) {this.docentes.add(docente);}

    public ArrayList<NoDocente> getNoDocentes() {return noDocentes;}

    public void setNoDocentes(NoDocente noDocente) {this.noDocentes.add(noDocente);}

    public ArrayList<Alumno> getAlumnos() { return this.alumnos;}

    public void setAlumnos(Alumno alumno) {this.alumnos.add(alumno);}
    
    public ArrayList<Alumno> listAlumnos(int sala){
        ArrayList<Alumno> aux = new ArrayList<>();
        for(Alumno al : this.alumnos){
            if(al.edad == sala){
            aux.add(al);
            }           
        }
        return aux;
    }
    public ArrayList<Alumno> listAlumnos2() {   ArrayList<Alumno> aux = new ArrayList<>();
        for(Alumno al : this.alumnos){
            aux.add(al);
        }
        return aux;}
    public ArrayList<Docente> listDocentes(){
        ArrayList<Docente> aux = new ArrayList<>();
        for(Docente doc : this.docentes){
            aux.add(doc);
        }
        return aux;
    }
    public ArrayList<NoDocente> listNoDocentesCat(String c) {
        ArrayList<NoDocente> aux = new ArrayList<>();
        for (NoDocente nodoc : this.noDocentes) {
                    if (nodoc.categoria.equals(c)) {
                       aux.add(nodoc);
                    }
            }
            return aux;
        }
    
    public ArrayList<NoDocente> listNoDocentes() {
        ArrayList<NoDocente> aux = new ArrayList<>();
        for (NoDocente nodoc : this.noDocentes) {
                       aux.add(nodoc);
            }
            return aux;
        }
    
    public void ordenarDocentes() {
    Collections.sort(this.docentes);
    }
    public void ordenarAlumnos(){
        Collections.sort(this.alumnos);
    }
    public void ordenarNoDocentes(){
        Collections.sort(this.noDocentes);
    }
   
    
}
