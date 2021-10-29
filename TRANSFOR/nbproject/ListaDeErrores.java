package TRANSFOR;

import java.io.BufferedWriter;
import java.io.IOException;

//Aqui tratareos los errores que conciernen al nombre del archivo
public class ListaDeErrores {
    private BufferedWriter wrError;
    public static boolean  isError;
  public ListaDeErrores(BufferedWriter fileError) 
  { 
      this.wrError = wrError; 
  }
    
    
    public static void ImprimeError(int TipoError, String nombreArhivo) throws IOException {
      isError=true;
    switch (TipoError) {
      case 10:
        System.out.println("\tERROR 001 Debe empezar con una letra. "+ nombreArhivo);
        break;
      case 11:
        System.out.println("\tERROR 002 Debe tener letras, números o guiones bajos. "+ nombreArhivo);
        break;
      case 12:
        System.out.println("\tERROR 003 Debe no empezar o terminar con guión bajo. "+ nombreArhivo);
        break;
      case 13:
        System.out.println("\tERROR 004 Debe tener una longitud máxima de 30 caracteres. "+ nombreArhivo);
        break;
      case 14:
        System.out.println("\tERROR 005 La extencion del archivo es incorrecta. "+ nombreArhivo);
        break;
      case 15:
        System.out.println("\tERROR 006 El arhicvo no existe o no está ubicado en la carpeta. "+ nombreArhivo);
        break;
    } 
  }
}
