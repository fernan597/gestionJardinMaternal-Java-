
package ejecuciones;

import clases.*;
import java.io.*;
import java.util.Collections;


public class Inicializacion {
    
    public static void main(String args[]) {
         Jardin jardin = new Jardin();
         FilesJardin file = new FilesJardin();
         file.cargarAlumnos(jardin);
         file.cargarDocentes(jardin);
         file.cargarNoDocentes(jardin);
         Principal principal = new Principal(jardin);
         principal.pack();                  // ajusta el tamaño automát&icamente
         principal.setLocationRelativeTo(null); // centra la ventana
         principal.setVisible(true);
    }
}

