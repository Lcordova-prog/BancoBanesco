
package Banco;


public class Nodo {
  int fila;
  Nodo siguiente;
  int deposito1;
  int cliente;
  String nombre;
  
  Nodo(){
      
  }

    public Nodo(int fila, int deposito, String nombre) {
        this.fila = fila;
        this.nombre = nombre;
       
   
    }
   

    Nodo(int deposito1) {
        this.deposito1 = deposito1;
    }

   

    
  
  
}
