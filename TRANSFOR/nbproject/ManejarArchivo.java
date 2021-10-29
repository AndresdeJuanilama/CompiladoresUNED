package TRANSFOR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManejarArchivo {
    
   public ArrayList<Linea> ManejarArchivo2 (String nombreArhivo){
       
       
       
       
       ArrayList<Linea> lineas=new ArrayList<>();
       
       
       File archivo=new File(nombreArhivo);
       
       
       try {
           FileInputStream inputarchivo = new FileInputStream(archivo);
           Scanner leer = new Scanner(inputarchivo);
        
            int n = 1;   
           while (leer.hasNextLine()) {
                String lineaDatos = leer.nextLine();
                String numero=String.format("%05d", n);
                 
              Linea nuevalinea=new Linea(lineaDatos, numero);
                
                
                
               lineas.add(nuevalinea);
               n++;
            
           }
           
           
       } catch (FileNotFoundException fileNotFoundException) {
           
         
           
       }
       
       


 return lineas;

}

    void ManejarArchivo2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
