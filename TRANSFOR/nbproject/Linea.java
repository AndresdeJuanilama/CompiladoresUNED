
package TRANSFOR;

import java.util.ArrayList;


public class Linea {
    
    
    private String Texto;
    private String numerolinea;
    private String tipo="nulo";
    private ArrayList<String> errores=new ArrayList<>();
    
    
      private String etiqueta="";
      private String codigo="";

    public Linea(String xTexto, String xnumerolinea) {
        Texto = xTexto;
        numerolinea = xnumerolinea;
        
        
         if(Texto.length()>6){
         
             
             if(Texto.charAt(6)=='!')
             tipo="comentario";
         }
         
         
        if(Texto.length()==0)tipo="comentario";
        if(Texto.length()>80){
            
            tipo="error";
            errores.add("Error 0001 esta linea es mayor a 80 columnas");
        
        
        }
        
          if(Texto.length()>4)etiqueta=Texto.substring(0,5);
          if(Texto.length()>6)codigo=Texto.substring(6);
       
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public String getNumerolinea() {
        return numerolinea;
    }

    public void setNumerolinea(String numerolinea) {
        this.numerolinea = numerolinea;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getErrores() {
        return errores;
    }

    public void setErrores(ArrayList<String> errores) {
        this.errores = errores;
    }
    
    public void adderror(String error){
       errores.add(error);
    }
    
    
}
