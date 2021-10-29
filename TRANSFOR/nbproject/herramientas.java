
package TRANSFOR;

import java.util.ArrayList;


public class herramientas {
    
    public static ArrayList<String> tokens(String texto) {
    
    ArrayList<String> respuesta=new ArrayList<String>();
    
    
       texto=texto.replace(",", " , ");
       texto=texto.replace("*", " * ");
       
       while(texto.contains("  ")){
       
          texto=texto.replace("  ", " ");
       
       }
    
        for (String string : texto.split("[\\s]")) {
            
            respuesta.add(string);
            
        }
    
    return respuesta;
    }
    
    
        public static void printtokens(ArrayList<String> tokens) {
    

            System.out.println("----tokens-----\n");
    
            
            int contar=0;
        for(String string : tokens) {
            
            System.out.println("#"+contar+"["+string+"]");
            contar++;
        }
            System.out.println("\n");

    }
    
}
