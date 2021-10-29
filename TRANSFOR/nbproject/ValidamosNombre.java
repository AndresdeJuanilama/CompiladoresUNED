package TRANSFOR;
        

import java.io.File;
import java.util.regex.Pattern;

public class ValidamosNombre {

    public static String nameFile;
    public static boolean isValido;
    static String nameFileErrores;

    public static boolean validarNombreArchivo(String nombreArchivo) {
        isValido = true;
        String nombre = nombreArchivo.toLowerCase();
        nombre = nombre.replace(".transfor", "");
        try {
            
            //Empezar con una letra.
            if (!Character.isLetter(nombreArchivo.charAt(0))) {
                ListaDeErrores.ImprimeError(10, nombreArchivo);
                isValido = false;
            }
            //Tener letras, números o guiones bajos.
            if (!Pattern.matches("^[A-Za-z0-9_]+$", nombre)) {
                ListaDeErrores.ImprimeError(11, nombreArchivo);
                isValido = false;
            }
            //No empezar o terminar con guión bajo.
            if (nombre.startsWith("_") || nombre.endsWith("_")) {
                ListaDeErrores.ImprimeError(12, nombreArchivo);
                isValido = false;
            }
            //Tener una longitud máxima de 30 caracteres.
            if (nombreArchivo.trim().length() > 30) {
                ListaDeErrores.ImprimeError(13, nombreArchivo);
                isValido = false;
            }
            //nombre del archivo de texto con extensión
            if (!nombreArchivo.toLowerCase().endsWith(".transfor") && nombreArchivo.contains(".")) {
                ListaDeErrores.ImprimeError(14, nombreArchivo);
                isValido = false;
            }else{
                if(!nombreArchivo.toLowerCase().endsWith(".transfor")){
                    nombreArchivo+=".transfor";
                }
            }
            
            //Validar si el arhivo existe
            if (!(new File(nombreArchivo)).exists()) {
                ListaDeErrores.ImprimeError(15, nombreArchivo);
                //System.out.println(nombreArchivo);
                isValido = false;
            }
            if(isValido){
                nameFile=nombreArchivo;
            }
            
        } catch (Exception error) {
            System.out.println("\tERROR 015 Ingrese el nombre del archivo.");
            
            
        }

        return isValido;
    }

    public boolean accept(File dir, String extension) {
        return dir.getName().endsWith(extension);
    }
}