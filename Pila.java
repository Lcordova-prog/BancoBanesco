
package Banco;

 
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
      Nodo depo = new Nodo(deposito);
        depo.fila = deposito;
        depo.siguiente = this.depo;
        this.depo = depo;
      
        
     tamano++;  
     }
     
    
     
      public String Mostrar(){
      Nodo a = depo;
      String api = "";
      while(!vacioPila()){
          api += depo.fila+"$"+"\n";  
      depo=depo.siguiente;
      
  
                  
               
      }
      
      depo = a;
      return api;
  }
      public int retiro(){
    int aux = depo.fila;
    depo = depo.siguiente;
     tamano --;
    
return aux;

      }
}
