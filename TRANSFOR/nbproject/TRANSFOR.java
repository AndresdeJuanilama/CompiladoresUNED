package TRANSFOR;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class TRANSFOR {
    public static void main(String[] args) {
     
        String nombreArchivo = "";
        boolean hayerrores =false;
        ArrayList<Linea> listadelineas =new ArrayList<Linea>();
        
    try {
            nombreArchivo = args[0]; 
             
        }
         
    catch (Exception error) {
            System.out.println("\t No se  Ingreso un  nombre del archivo.");
             System.out.println("\t Fin del programa.");
            System.exit(0);
        }
        
    try {
            nombreArchivo = args[0];
            
            
            
            if (ValidamosNombre.validarNombreArchivo(nombreArchivo)) {
                //lectura archivo
              ManejarArchivo file = new ManejarArchivo();
                
              listadelineas= file.ManejarArchivo2(nombreArchivo);
            }
            
            ///validar etiquue
            for (Linea linea : listadelineas) {
               
               if(linea.getTipo().equalsIgnoreCase("comentario"))continue;
               
        

            }
            
              ///validar comandos
            for (Linea linea : listadelineas) {
               
               if(linea.getTipo().equalsIgnoreCase("comentario"))continue;
               
               String codigo = linea.getCodigo();
               ArrayList<String> tokens=herramientas.tokens(codigo);
              
               herramientas.printtokens(tokens);
        
               
            }
            
            
            
            
            //ayuda visiual
           
            for (Linea linea: listadelineas) {
             
              //  if(linea.getTipo().equalsIgnoreCase("comentario"))continue;
                
                System.out.println("["+linea.getNumerolinea()+"]["+linea.getTipo()+"]["+linea.getCodigo()+"]");
                
                for (String error : linea.getErrores()) {
                    System.out.println("\t"+error);
                }
                
                
            }
            
            
            
          //  System.exit(0);

        } catch (Exception error) {
            System.out.println("\t No se  Ingreso un  nombre del archivo.");
             System.out.println("\t Fin del programa.");
            System.exit(0);
        }
        
        
        
         for (Linea linea: listadelineas) {

                for (String error : linea.getErrores()) {
                    hayerrores=true;
                }
            }
        
        
        if(hayerrores){
        //imprimir archivo errores
        
        }else{
        
        //imprimir f90 y ejecutar
        
        
        /*try {
            String ruta = "C:\\Users\\Dell G3";
            String contenido = "Contenido de ejemplo";
            File file = new File(ruta);
            file.createNewFile();
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    
}
        }
        
        
        
        
    }


    