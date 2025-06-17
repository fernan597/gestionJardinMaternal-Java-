
package clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class FilesJardin {
    File ar;
    FileWriter fwar;
    BufferedWriter bwar;
    FileReader frar;
    BufferedReader brar;
    
    
     public void cargarDocentes(Jardin jardin){
             try{
             ar = new File("docentes.txt");
             frar = new FileReader(ar);
             brar = new BufferedReader(frar);
            String aux;
            if(ar.exists()){
                while((aux=brar.readLine())!=null){
                    Docente doc = new Docente();
                    doc.setNbre(aux);
                    doc.setApe(brar.readLine());
                    doc.setDireccion(brar.readLine());
                    doc.setSala(Integer.parseInt(brar.readLine()));
                    doc.setDni(Integer.parseInt(brar.readLine()));
                    jardin.setDocentes(doc);
                }
            }
             brar.close();
             Collections.sort(jardin.getDocentes());
            }catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar o abrir el archivo.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer o escribir en el archivo.");
        }
    }
     
     public void cargarAlumnos(Jardin jardin){
         try{ 
          ar = new File("alumnos.txt");
         frar = new FileReader(ar);
         brar = new BufferedReader(frar);
        String s;
       if(ar.exists()){
           while((s=brar.readLine())!=null){
               Alumno al = new Alumno();
               al.setNbre(s);
               al.setApe(brar.readLine());
               al.setEdad(Integer.parseInt(brar.readLine()));
               al.setDni(Integer.parseInt(brar.readLine()));
               jardin.setAlumnos(al);
           }     
        }
       Collections.sort(jardin.getAlumnos());
       brar.close();
        }catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar o abrir el archivo.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer o escribir en el archivo.");
        }
    }
     
     public void cargarNoDocentes(Jardin jardin){
         try{
               ar = new File("nodocentes.txt");
             frar = new FileReader(ar);
             brar = new BufferedReader(frar);
            String aux2;
            if(ar.exists()){
                while((aux2=brar.readLine()) != null){
                    NoDocente nodoc = new NoDocente();
                    nodoc.setNbre(aux2);
                    nodoc.setApe(brar.readLine());
                    nodoc.setDireccion(brar.readLine());
                    nodoc.setCategoria(brar.readLine());
                    nodoc.setDni(Integer.parseInt(brar.readLine()));
                    jardin.setNoDocentes(nodoc);
                }
            }
            Collections.sort(jardin.getNoDocentes());
            brar.close();
         }catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar o abrir el archivo.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer o escribir en el archivo.");
        }
     }
     
     public void writeFileAlumno(ArrayList<Alumno> al){
         try{
          ar = new File("alumnos.txt");
         fwar  = new FileWriter(ar);
          bwar = new BufferedWriter(fwar);
         for(Alumno a : al){
             bwar.write(a.getNbre()+"\n");
             bwar.write(a.getApe()+"\n");
             bwar.write(a.getEdad()+"\n");
             bwar.write(a.getDni()+"\n");    
         }
         bwar.close();
         }catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar o abrir el archivo.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer o escribir en el archivo.");
        }
     }
     
     public void writeFileDocente(ArrayList<Docente> d){
         try{
          ar = new File("docentes.txt");
          fwar = new FileWriter(ar);
          bwar = new BufferedWriter(fwar);
         for(Docente a : d){
             bwar.write(a.getNombre()+"\n");
             bwar.write(a.getApe()+"\n");
             bwar.write(a.getDireccion()+"\n");
             bwar.write(a.getSala()+"\n");
             bwar.write(a.getDni()+"\n");  
         }
         bwar.close();
         }catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar o abrir el archivo.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer o escribir en el archivo.");
        }
     }
     public void writeFileNoDocente(ArrayList<NoDocente> nd){
         try{
         ar = new File("nodocentes.txt");
          fwar = new FileWriter(ar);
          bwar = new BufferedWriter(fwar);
         for(NoDocente a : nd){
             bwar.write(a.getNombre()+"\n");
             bwar.write(a.getApe()+"\n");
             bwar.write(a.getDireccion()+"\n");
             bwar.write(a.getCategoria()+"\n");
             bwar.write(a.getDni()+"\n");  
         }
         bwar.close();
         }catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar o abrir el archivo.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer o escribir en el archivo.");
        }
     }
}
