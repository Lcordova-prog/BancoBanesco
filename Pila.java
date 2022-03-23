
package Banco;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

 
public class Pila {
    private Nodo depo;
    int tamano = 0;
    String lista = "";
    
    
    Pila (){
        depo = null;
        tamano = 0;
    }
    
    boolean vacioPila(){
        if (depo == null) {
            return true;
        }else{
            return false;
        }
    }
    
    
     public void deposito(int deposito){
         
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalTime hora =  LocalTime.now();
        
        Date fechaActual = new Date();
      Nodo depo = new Nodo(deposito);
          Cola f = new Cola();
        depo.fila = deposito;
        depo.siguiente = this.depo;
        this.depo = depo;
       try(
                       
            FileWriter fw = new FileWriter("Taquilla.log", true);
            FileReader fr = new FileReader("Taquilla.log")
                ){
            fw.write(sdf.format(fechaActual)+" "+hora+"\r"+"\n");
            fw.write("Depositos realizados: "+deposito+"$"+"\r\n"+"\r\n");

            fw.flush();
            int valor = fr.read();
            while(valor !=-1){
               
                valor = fr.read();
            }
        }catch(IOException e){
            System.out.println("ERROR E/S: "+e);
        }
        
         
        
     tamano++;  
     }
     
    
     
      public String Mostrar(){
      Nodo a = depo;
      String api = "";
      while(!vacioPila()){
          api += depo.fila+"$"+"\n";  
      depo=depo.siguiente;
      
  
                  
               
      }
      
      depo = a ;
      return api;
  }
      public int retiro(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalTime hora =  LocalTime.now();
        Date fechaActual = new Date();
    int aux = depo.fila;
    depo = depo.siguiente;
     tamano --;
     
      try(
                       
            FileWriter fw = new FileWriter("Taquilla-retiro.log", true);
            FileReader fr = new FileReader("Taquilla-retiro.log")
                ){
            fw.write(sdf.format(fechaActual)+" "+hora+"\r"+"\n");
            fw.write("Retiros realizados: "+aux+"$"+"\r\n"+"\r\n");

            fw.flush();
            int valor = fr.read();
            while(valor !=-1){
               
                valor = fr.read();
            }
        }catch(IOException e){
            System.out.println("ERROR E/S: "+e);
        }
    
return aux;

      }
      
            
  public int cima(){
      return depo.deposito1-20;
  }
  
  
      
      
}
