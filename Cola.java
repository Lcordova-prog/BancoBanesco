
package Banco;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Cola {
  Nodo frente;
  Nodo atras;
  String cola = "";
  
 
  
  boolean vaciaCola(){
     return frente == null;
  }
  
  
  public void taquilla(int fila, String nombre) throws IOException{
       SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        LocalTime hora =  LocalTime.now();
        Date fechaActual = new Date();

      Nodo a = new Nodo(fila);
       a.fila = fila;
       a.nombre = nombre;
       a.siguiente = null;
        if (vaciaCola()) {
            frente = a;
            atras = a;
        } else {
           atras.siguiente = a;
           atras = a;
      
        
        }
        try(
            FileWriter fw = new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\BancoBanesco\\Atendidos.txt", true);
            FileReader fr = new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\BancoBanesco\\Atendidos.txt")
                ){
            fw.write(sdf.format(fechaActual)+" "+hora+"\r"+"\n");
            fw.write("Personas Ingresadas al Banco: "+nombre+"\r\n"+"\r\n");
            fw.flush();
            int valor = fr.read();
            while(valor !=-1){
               
                valor = fr.read();
            }
        }catch(IOException e){
            System.out.println("ERROR E/S: "+e);
        }
        
         
            
        
        
 }
  
  
 public void MostrarCola(){
        Nodo recorrido = frente;
        String ColaInvertida = "";
        
        while(recorrido != null){
            cola += recorrido.nombre+" C.I:"+recorrido.fila+"/ ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = cola.split(" ");
        
        for (int i = cadena.length -1; i >= 0; i--) {
            ColaInvertida += " "+cadena[i];
            
        }
        System.out.println(ColaInvertida);
        cola = "";
 }
 
   public int SalirBanco(){
       Nodo aux2 = new Nodo();
      if (!vaciaCola()) {
          Nodo aux1 = frente;
          boolean x = false;
         int aux = frente.fila;
          if (aux2 != null) {
              if (aux1.fila >= 50) {
                  aux2.siguiente = aux1.siguiente;
                  x = true;
                  
                          
              }
              aux2 = aux1;
              aux1 = aux1.siguiente;
             
                  
              
              frente = null;
              atras = null;
        }else{
              frente = frente.siguiente;
          }
          
          return aux;
          
      }else{
      return Integer.MAX_VALUE;
      }
      
  }
   
   public void prioridad(){
       Nodo aux2 = new Nodo();
      Nodo aux1 = frente;
      boolean x= false;
      while(aux1 != null){
          if (aux1.fila >= 50) {
              aux2.siguiente = aux1.siguiente;
              x = true;
              
              break;
          }
          aux2 = aux1;
          aux1 = aux1.siguiente;
      }
       if (!x) {
           this.SalirBanco();
           
       }
   }

    void deposito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public int siguiente(){
       if (!vaciaCola()) {
                  return frente.fila;

       }
       return 0;
   }

   
    

   
    
}
