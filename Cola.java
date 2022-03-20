
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
  int retiro, deposito,consulta, libreta, pagoServicio, cliente;
  String cola = "";
  
 
  
  boolean vaciaCola(){
     return frente == null;
  }
  
  boolean SinSaldo(){
      if (deposito == 0) {
          return true;
      } else {
          return false;
      }
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
                System.out.println((char)valor);
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
      if (!vaciaCola()) {
         int aux = frente.fila;
          if (frente == atras) {
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
